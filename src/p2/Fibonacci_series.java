package p2;

import java.util.Scanner;

//. Write a program to print Fibonacci Series.

public class Fibonacci_series {

	public static void main(String[] args)
	{
		int num1=0,num2=1,num3 = 0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ragne for Fibonacci series : ");
		n=sc.nextInt();
		System.out.println("The Fibonacci series is : ");
		
		//Method 1
//       for(int i=1;i<=n;i++)
//       {
//    	   System.out.print(num1+" ");
//    	   num3=num1+num2;
//    	  // System.out.print(" "+num3);
//    	   num1=num2;
//    	   num2=num3;  
//       }
		System.out.println("--------------------------------------------");
		//Method 2
		int i=1;
		while(i<=n)
		{
			System.out.print(num1+" ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
		}
		System.out.println("\n--------------------------------------------");
		//Method 3
		int arr[]=new int [n+2];
		arr[0]=0;
		arr[1]=1;
		for(int j=2;j<=n;j++)
		{
			arr[j]=arr[j-1]+arr[j-2];
		}
		System.out.println("The Fibonacci series is : ");
		for (int k=0;k<=n-1;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
      
	}

}
