package p3;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Array_List_27 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Amazon");
		a.add("Facebook");
		a.add("Google");
		a.add("IBM");
		a.add("Tesla");
		System.out.println("Arraylist before reverse : "+a);
//		Collections.reverse(a);
//		System.out.println("Arraylist after reverse : "+a);

		System.out.println("--------------------------------------------");
		
		ArrayList a1 = new ArrayList();
		for(int i=a.size()-1;i>=0;i--)
		{
			a1.add(a.get(i));
		}
		System.out.println("ArrayList after reverse :");
		System.out.println(a1);
		
	}

}
