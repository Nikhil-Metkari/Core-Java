package p4;

import java.util.ArrayList;
import java.util.Collections;

//34. Write a java program to sort ArrayList in Descending order in java
public class Arraylist_descending_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> alist = new ArrayList<>();
		alist.add("BMW");
		alist.add("Suzuki");
		alist.add("Audi");
		alist.add("Ferrari");
		alist.add("Tata");
		alist.add("Ford");
		 
		System.out.println("Before sorting : "+alist);
		
		Collections.sort(alist, Collections.reverseOrder());
		System.out.println("\nArraylist in descending order : "+alist);
	}

}
