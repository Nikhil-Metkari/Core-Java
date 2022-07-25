package p4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//37. Write a java program iterate or loop over HashMap using 1.for-each loop 2.keyset() iterator  3.entrySet() and for loop 
// 4.entrySet() and java iterator
public class HashMap_iterate_37 {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<>();
        
        map.put(1,"Nikhl");
        map.put(53,"Amit");
        map.put(3,"Lalit");
        map.put(22,"Omkar");
        map.put(33,"Nihar");
        map.put(93,"Sid");
        System.out.println("Given hashmap is : "+map);
        
        System.out.println("----------------------------------------------");
        System.out.println("using for-each  :");
        
        map.forEach((k,v)->{
        	System.out.println(k+" = "+v);
        });
        System.out.println("----------------------------------------------");
        System.out.println("using key-set iterator  :");
        
        System.out.println(map.keySet());
        System.out.println("----------------------------------------------");
        
        System.out.println("using Entry Set and Java Iterator  :");
        
        
        for(Map.Entry<Integer,String> set : map.entrySet())
        {
        	System.out.println(set.getKey()+" = "+set.getValue());
        }
        System.out.println("----------------------------------------------");
        System.out.println("using Entry Set and For loop  :");
        Iterator it = map.entrySet().iterator();
        
        while(it.hasNext())
        {
        	Map.Entry<Integer,String> m = (Map.Entry<Integer, String>) it.next();
        	System.out.println(m.getKey()+" = "+m.getValue());
        }

	}

}
