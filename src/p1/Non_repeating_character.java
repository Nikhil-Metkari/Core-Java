package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Non_repeating_character {

	public static void main(String[] args) 
	{
		String str= "provaptosoft";
		char [] str1 = str.toCharArray();
		
		for(char i:str1)
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println(i);
				break;
			}
		}
 
	     
	     // Method 2 
		
	     for (int i=0;i<str1.length;i++)
	     {
	    	 int cnt=0;
	    	 for (int j=0;j<str1.length;j++)
	    	 {
	    		 if(str1[i]==str1[j])
	    		 {
	    			cnt++;
	    		 }
	    		
	    	 }
	    	 if(cnt==1)
	    	 {
	    		 System.out.println("First Non-repeated character is : ");
	    	 System.out.println(str1[i]);
	    	 break;
	    	 }
	    	
	     }
	}

}
