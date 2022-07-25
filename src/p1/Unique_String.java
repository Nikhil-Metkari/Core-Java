package p1;

import java.util.HashSet;

//. Write a java program to find out if the given String has all Unique Characters.

public class Unique_String 
{
	boolean uniqueCharacters(String str)
	{
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println("The String  has No all unique characters");
					return false;
					
				}
			}
		}
		System.out.println("The String  has  all unique characters");
		return true;
		
	}
	public static void main(String[] args)
	{
          String str = "abcde";
         
          Unique_String u = new Unique_String();
          u.uniqueCharacters(str);
         System.out.println("-----------------------------------------------");
         
         
          //Method 2
          HashSet set = new HashSet();
          for(char c:str.toCharArray())
          {
        	  set.add(c);
          }
          //System.out.println(set);
          if(str.length()==set.size())
          {
        	  System.out.println("The String  has  all unique characters");
          }
          else {
        	  System.out.println("The String  has No all unique characters");
          }
	}

}
