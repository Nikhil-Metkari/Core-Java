package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//33. Write a java program to convert Array to ArrayList(List) in java.
public class Array_to_Arraylist_33 {

	public static void main(String[] args)
	{
	
        String str [] = {"Java","C","SQL","C++","Springboot"};
        System.out.println("Array is :"+Arrays.toString(str));
        ArrayList<String> alist = new ArrayList();
        
        for(String s : str)
        {
        	alist.add(s);
        }
        System.out.println("Arraylist is :"+alist);
        System.out.println("---------------------------------------------");
        String str1 [] = {"Java","C","SQL","C++","Springboot"};
        List<String> al = Arrays.asList(str1);
        System.out.println("Arraylist is :"+al);
        System.out.println("---------------------------------------------");
        String str2 [] = {"Java","C","SQL","C++","Springboot"};
        ArrayList<String> a = new ArrayList<String>();
        Collections.addAll(a, str2);
        System.out.println("Arraylist is :"+a);
        

	}

}
