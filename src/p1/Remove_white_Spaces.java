package p1;

//9. Write a java program to remove all the white-spaces in the String.

public class Remove_white_Spaces {

	// Method 1
	public Remove_white_Spaces(String str)
	{
		String str1=str.replaceAll(" ", "");
		System.out.println(str1);
	}
	
	public static void main(String[] args) 
	{

           String str = "My name is Nikhil";
           System.out.println("Given String is : "+str);
           System.out.print("Given String after removel of whitespaces is : ");
           Remove_white_Spaces s = new Remove_white_Spaces(str);
             System.out.println("-------------------------------------------------------------------");
           // Method 2
           char arr[] = str.toCharArray();
           System.out.print("Given String after removel of whitespaces is : ");
           for(int i=0;i<arr.length;i++)
           {
        	   if(arr[i]!=' ')
        	   {
        		   System.out.print(arr[i]);
        	   }
           }
           
	}

}
