package p1;

import java.util.Scanner;

// Write a Java Program to reverse a string without using String inbuilt functions


public class Reverse_String {
	
	public Reverse_String(String str)
	{
		char[] str1 =str.toCharArray();
		System.out.print("Reverse of given string is : ");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
		
		System.out.println("\n---------------------------------------------");
		// Second Method
		String str2="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			str2+=ch;
		}
		System.out.println("(Method 2)Reverse of given string is : "+str2);
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		Reverse_String s= new Reverse_String(str);

	}

}
