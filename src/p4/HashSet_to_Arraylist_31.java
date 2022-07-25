package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//31. Write a java program to convert HashSet to ArrayList(List) in java.
//32. Write a java program to convert ArrayList to String array in java
public class HashSet_to_Arraylist_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet();
		set.add("BMW");
		set.add("Suzuki");
		set.add("Audi");
		set.add("Ferrari");
		set.add("Tata");
		set.add("Ford");
		
		System.out.println("Hashset is : "+set);
		ArrayList<String> a= new ArrayList();
		a.addAll(set);
		System.out.println("ArrayList is : "+a);
		
		System.out.println("-----------------------------------------------");
		String str;
		str=a.toString();
		System.out.println("ArrayList to string  : "+str);
		System.out.println("-----------------------------------------------");
		String s[]=new String[a.size()];
		for(int i=0;i<a.size();i++)
		{
			s[i]=a.get(i);
		}
		System.out.println("ArrayList to string : " +Arrays.toString(s));
		System.out.println("-----------------------------------------------");
	
	}

}
