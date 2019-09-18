package svetiSava;

public class Datum {
	private int dan;
	private int mesec;
	private int godina;
	
	public Datum(int dan, int mesec, int godina) {
		super();
		this.dan = dan;
		this.mesec = mesec;
		this.godina = godina;
	}

	@Override
	public String toString() {
		String sum="";
		if (dan<10) sum+="0";
		sum+=dan;
		sum+=".";
		if (mesec<10) sum+="0";
		sum+=mesec;
		sum+=".";
		sum+=godina;
		sum+=".";
		return sum;
	}
	
	

}
