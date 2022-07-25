package p3;

import java.util.ArrayList;
import java.util.LinkedList;

//30. Write a java program to convert LinkedList to ArrayList in java
public class Linkedlist_to_Arraylist_30 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
		LinkedList list = new LinkedList();
		list.add("Java");   
		list.add("C");   
		list.add("C++");   
		list.add("SQL");   
		list.add("Advance Java");   
		list.add("Spring"); 
		System.out.println("Linked List is : "+list);
		
		ArrayList alist = new ArrayList();
		alist.addAll(list);
		System.out.println("ArrayList is : "+alist);
		
	}

}
