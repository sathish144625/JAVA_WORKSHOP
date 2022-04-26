package JavaProject;

import java.util.HashMap;
import java.util.TreeMap;


public class HashExample {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("aaa","aaa");
		hm.put("bbb","bbb");
		hm.put("ccc","ccc");
		hm.put("ddd","ddd");
		hm.put("fff","fff");
		
		
		System.out.println(hm);
		
		
		TreeMap<String, String> tm = new TreeMap<String, String>(hm);		
		
		System.out.println(tm);					
	
	}
	
}
