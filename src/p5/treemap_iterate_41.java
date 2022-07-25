package p5;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//41. Write a java program to iterate over TreeMap in java.
public class treemap_iterate_41 {

	public static void main(String[] args) {

       TreeMap<Integer,String> map = new TreeMap<>();
       map.put(1,"Nikhl");
       map.put(53,"Amit");
       map.put(3,"Lalit");
       map.put(26,"Nikhl");
       map.put(22,"Omkar");
       map.put(33,"Nihar");
       map.put(93,"Sid");
       System.out.println("TreeMap is : "+map);
       
       System.out.println("-------------------------------------------");
	   
      // Set<Map.Entry<Integer,String>> s = map.entrySet();  
       System.out.println("Iterate treemap using for loop: ");
       for(Map.Entry<Integer,String> m : map.entrySet() )
       {
    	   System.out.println(m.getKey()+" = "+m.getValue());
       }
       System.out.println("-------------------------------------------");
       System.out.println("Iterate treemap using for iterator : ");
       Iterator i = map.entrySet().iterator();
       while(i.hasNext())
       {
    	   Map.Entry<Integer,String> m = (Map.Entry<Integer, String>) i.next();
    	   System.out.println(m.getKey()+" "+m.getValue());
       }
       

	}

}
