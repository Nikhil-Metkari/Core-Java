package p4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class sort_by_key_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map = new HashMap<>();
		map.put(33 ,"Z");
		map.put(99 ,"I");
		map.put(22 ,"A");
		map.put(55 ,"B");
		map.put(88 ,"X");
		map.put(44 ,"M");
		
		System.out.println("Before sorting :\n"+map);
    	
    	System.out.println("-------------------using treemap--------------------");
    	
		TreeMap<Integer,String> treemap = new TreeMap<>(map);
		System.out.println("After sorting :\n"+treemap);
		
		System.out.println("------------------using hashtable--------------------");
		
		Hashtable <Integer,String> htable = new Hashtable<>(map);
		System.out.println("After sorting :\n"+htable);
		
		
		
	}

}
