package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//14. Write a java program to check whether two given strings are anagram.
public class Anagram_string {

	public static void main(String[] args)
	{
	 String str ="abcd";
	 String str1="bcdaa";
	 //Method 1
	 ArrayList set = new ArrayList();
	 for(char i:str.toCharArray())
	 {
		 set.add(i);
	 }
	 ArrayList set1 = new ArrayList();
	 for(char i:str1.toCharArray())
	 {
		 set1.add(i);
	 }
	 int cnt=0;
	 if(set.size()==set1.size())
	 {
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=0;j<str.length();j++)
			 if(str.charAt(i)==str1.charAt(j))
			 {
				 cnt++;
			 }
		 }
		 if(cnt==str.length())
		 {
		 System.out.println("Two given strings are anagram.");
		 }
		 else
		 {
			 System.out.println("Two given strings are Not anagram.");
		 }
	 }
	 else
	 {
		 System.out.println("Two given strings are Not anagram.");
	 }
	 
	System.out.println("-----------------------------------------------");
	 // Method 2
	 if(str.length()==str1.length())
	 {
		char arr1[]=str.toCharArray();
		char arr2[]=str1.toCharArray();
		
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);

		 boolean result=Arrays.equals(arr1,arr2);
		 
		 if(result)
		 {
			 System.out.println("Two given strings are anagram.");
		 }
		 else
		 {
			 System.out.println("Two given strings are Not anagram.");
		 }
		 
	 }
	 else {
		 System.out.println("Two given strings are Not anagram.");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
