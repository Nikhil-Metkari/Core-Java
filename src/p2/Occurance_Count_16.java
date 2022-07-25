package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Occurance_Count_16 {

	public static void main(String[] args) {

    String str = "Java is Hungry";
    String str1=str.replaceAll(" ", "");
    char [] arr = str1.toCharArray();
    
    ArrayList alist = new ArrayList();
    for(char c:arr)
    {
    	alist.add(c);
    }
    HashSet<Character> set = new HashSet(alist);
    ArrayList a = new ArrayList();
    for(char ch:set)
    {
    	a.add(ch+"="+Collections.frequency(alist, ch));
    }
    System.out.println(a);
    
  
	}

}
