package p4;

import java.util.HashMap;

//35. Write a java program to remove key value mapping from HashMap.
public class remove_key_value_mapping_35 {

	public static void main(String[] args) {

         HashMap map = new HashMap();
         
         map.put(1,"Nikhl");
         map.put(5,"Amit");
         map.put(3,"Lalit");
         map.put(2,"Omkar");
         map.put(3,"Nihar");
         map.put(9,"Sid");
         
         System.out.println("Hashmap is : "+map);
         System.out.println("---------------------------------------------");
         
         map.remove(2);
         System.out.println("After remove Hashmap is : "+map);
         System.out.println("---------------------------------------------");
         map.put(4, "Cat");
         System.out.println("After add Hashmap is : "+map);
	}

}
