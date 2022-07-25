package p1;

//10. Write a java program to remove all the white-spaces in the String.
public class Without_Using_replace {

	public static void main(String[] args)
	{
	    String str = "My name is Nikhil";
        System.out.println("Given String is : "+str);
          System.out.println("-------------------------------------------------------------------");
      
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
