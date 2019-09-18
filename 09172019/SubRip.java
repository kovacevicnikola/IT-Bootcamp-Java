package titlovi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubRip {
	public ArrayList<String> data;
	public String name;
	public String name2;
	public BufferedWriter wr;
	public SubRip( String name, String name2) throws Exception {
		this.data = new ArrayList<>();
		this.name=name;
		this.name2=name2;
		wr = new BufferedWriter(new FileWriter(name2));
		wr.write("");
		wr.flush();
		
	
	}
	
	public void load() throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Nick\\eclipse-workspace\\JavaProject\\src\\"+name));
		String x;
		x = in.readLine();
		System.out.println(x);
		while (x!=null) {
			data.add(x);
			x= in.readLine();
		}
		in.close();
	}
	public void srtToDVD() throws Exception {
		boolean cont=false;
		for (int i=0; i<data.size(); i++) {
			
			if (data.get(i).matches("^[0-9]+$")) {
				String start=data.get(i+1).split(" --> ")[0];
				String end= data.get(i+1).split(" --> ")[1];
				wr.write("{"+((Integer) timeToFrame(start)).toString()+"} ");
				
				wr.write("{"+((Integer) timeToFrame(end)).toString()+"}");
				cont=true;
			} else if (cont){
				cont=false;
				continue;
			} else if (!data.get(i).isEmpty()){
				wr.write(data.get(i)+" |");
			} else {
				wr.write("\n");
			}
		
		}
		wr.close();
	}
	public int timeToFrame(String time) {
		int hrs=Integer.parseInt(time.split(":")[0]);
		int min=Integer.parseInt(time.split(":")[1]);
		int sec=Integer.parseInt(time.split(":")[2].split(",")[0]);
		int ms=Integer.parseInt(time.split(":")[2].split(",")[1]);
			return 25*(60*60*hrs+60*min+sec+ms*(1/1000));
	}
	public String frameToTime(int frame) {
		frame = frame/25;
		String hrs = "";
		if(((Integer)(frame/60/60))<=10) {
			hrs+="0"+((Integer)(frame/60/60)).toString();
		} else {
			hrs+=((Integer)(frame/60/60)).toString();
		}
		String mins ="";
		frame = frame%60%60;
		if(((Integer)(frame/60))<=10) {
			mins+="0"+((Integer)(frame/60)).toString();
		} else {
			mins+=((Integer)(frame/60)).toString();
		}
		frame = frame%60;
		String secs=((Integer)frame).toString();
		return hrs+":"+mins+":"+secs+",000";
	}
	public void dvdToSrt() throws Exception {
		String start="";
		String end="";
		for (int i=0;i<data.size();i++) {
			
			Pattern pattern = Pattern.compile("\\{(.*?)\\}");
			Matcher matcher = pattern.matcher(data.get(i));
			
			if (matcher.find()) start = frameToTime(Integer.parseInt(matcher.group(1)));
			if (matcher.find()) end =frameToTime(Integer.parseInt(matcher.group(1)));
			
			wr.write(i+1+"\n");
			wr.write(start+" --> "+end+"\n");
			
			wr.write(data.get(i).split("}")[2].replace("|", "\n"));
			wr.write("\n");
		}
	}

}
