package p3;

import java.util.ArrayList;
import java.util.Collections;

//Write a java program sort an ArrayList in java
public class Sort_arraylist_28 {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList();
		list.add("Data Science");   
		list.add("Testing");   
		list.add("C#");   
		list.add("Basic Language");   
		list.add("UML");   
		list.add("Algorithms ");   
		list.add("Computer Networks");  
		list.add("Python");
		
		System.out.println("Before sorting ArrayList is : "+list);
		Collections.sort(list);
		System.out.println("After sorting ArrayList is : "+list);
	}

}
