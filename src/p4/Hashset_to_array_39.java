package p4;

import java.util.HashSet;

public class Hashset_to_array_39 {

	public static void main(String[] args) {

     HashSet<String> set = new HashSet<>();
     set.add("Apple");
     set.add("mango");
     set.add("Banana");
     set.add("Chiku");
     set.add("Papaya");
     System.out.println("HashSet is :"+set);
     System.out.println("---------------------------------------------------");
     String [] str=new String[set.size()];
     set.toArray(str);
     System.out.print("Array is :");
     for(int i=0;i<str.length;i++)
     {
    	 System.out.print(str[i]+" ");
     }
     System.out.println("\n---------------------------------------------------");
     String [] str1=new String[set.size()];
     int i=0;
     for(String s:set)
     {
    	 str1[i++]=s;
     }
     System.out.print("Array is :");
     for(String s1:str1)
     {
    	 System.out.print(s1+" ");
     }
     
     
     
     
	}

}
