package p1;

import java.util.Scanner;

public class Swapping_No_without_third_variable {
	
	
	public static void Swapno1(int num1,int num2)
	{
		   num1=num1+num2;
	        num2=num1-num2;
	        num1=num1-num2;
	         
	         System.out.println("Swapped Numbers are : "+num1+" and "+num2);
	}
	
	//Method 2
	public static void Swapno2(int num1,int num2)
	{
		   num1=num1^num2;
	        num2=num1^num2;
	        num1=num1^num2;
	         
	         System.out.println("Swapped Numbers are : "+num1+" and "+num2);
	}
	
	
	public static void main(String[] args) 
	{
		{
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter first Number : ");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second Number : ");
	        int num2=sc.nextInt();
	         
	        Swapno1(num1,num2);
	        Swapno2(num1,num2);


		}

	}

}
