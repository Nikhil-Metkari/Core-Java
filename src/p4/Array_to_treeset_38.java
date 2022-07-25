package p4;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

//38.Write program to convert Array to Treeset
public class Array_to_treeset_38 {

	public static void main(String[] args) {

		  String str [] = {"Java","C","C","SQL","C++","Springboot"};
	        System.out.println("Array is :"+Arrays.toString(str));
	        
	        TreeSet<String> t = new TreeSet<>();
	        for(String s:str)
	        	{
	        	t.add(s);
	        	}
	        System.out.println("TreeSet is :" +t);
	        
	        System.out.println("----------------------------------------------------");
	        TreeSet<String> t1 = new TreeSet<>();
	        t1.addAll(Arrays.asList(str));
	        System.out.println("TreeSet using Arrays.aslist is :" +t1);
	        System.out.println("----------------------------------------------------");
	        TreeSet<String> t2 = new TreeSet<>();
	        Collections.addAll(t2, str);
	        System.out.println("TreeSet using Collections.addall is :" +t2);
	        
	}

}
