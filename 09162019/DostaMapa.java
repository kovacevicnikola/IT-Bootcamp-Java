package Mape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class DostaMapa {

	public static void main(String[] args) {
		HashMap<String, Integer> x = new HashMap<>();
		x.put("Aaa", 18);
		x.put("ZZZ", 1);
		x.put("Abc", 0);
		sortiraj(x);
		sortiraj(x);
		sortiraj(x);
		System.out.println(ponavljanje(new int[] {1,2,3,2,2,3,1}));
		ArrayList<String> b = new ArrayList<String>();
		b.add("Miroslav");
		b.add("Djura");
		ArrayList<String> c = new ArrayList<>();
		c.add("Miroslav");
		c.add("Miroslav");
		dedaMraz(b,c);
		
	}
	public static void sortiraj(HashMap<String, Integer> x) {
		TreeMap<String,Integer> sort = new TreeMap<>(x);
		for (String el: x.keySet()) {
			System.out.println(el);
		}
	}
	
	public static int ponavljanje(int[] x) {	
		HashMap<Integer, Integer> l = new HashMap<>();
		for (Integer el: x) {
			if (l.containsKey(el)) l.put(el, l.get(el)+1);
			else l.put(el, 1);
		}
		for (Integer el: l.keySet())
			if (l.get(el)%2!=0) return el;
	return -1;
	}
	
	public static void dedaMraz(ArrayList<String> x, ArrayList<String> y) {
		HashMap<String,Integer> m = new HashMap<>();
		for (String el: x) {
			m.put(el, 0);
		}
		for (String el: y) {
			m.put(el, m.get(el)+1);
		}
		for (String el: m.keySet()) {
			if (m.get(el)>1) System.out.println(el);
		}
		
	}
}
