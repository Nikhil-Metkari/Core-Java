package p3;

import java.util.ArrayList;
import java.util.Iterator;

//29. Write a java program to iterate over ArrayList in java using for loop, for
// each loop, While loop, Iterator and Collection's stream() util .

public class Itereate_ArrayList_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList();
		list.add("Java");   
		list.add("C");   
		list.add("C++");   
		list.add("SQL");   
		list.add("Advance Java");   
		list.add("Spring");   
		
		System.out.println("ArrayList is : "+list);
		System.out.println("-----------------------------------------");
		System.out.println("ArrayList using For Loop :");
		for(int i=0;i<list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------");
		System.out.println("ArrayList using For Each Loop :");
		for(String k:list)
		{
			System.out.println(k);
		}
		System.out.println("-----------------------------------------");
		System.out.println("ArrayList using while Loop :");
		int i=0;
		while(i<list.size())
		{
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("-----------------------------------------");
		System.out.println("ArrayList using Iterator :");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------------------------------------");
		System.out.println("ArrayList using Collections stream() :");

		list.forEach(list1-> {
			System.out.println(list1);
		}
				);
	}

}
