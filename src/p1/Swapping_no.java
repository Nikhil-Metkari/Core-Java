package p1;

import java.util.Scanner;

public class Swapping_no {

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2=sc.nextInt();
//         
//        //Method 1
//        int temp;
//         temp=num1;
//         num1=num2;
//         num2=temp;
//         
//         System.out.println("Swapped Numbers are : "+num1+" and "+num2);
         
         //Method 2 
         
         num1=num1+num2;
	        num2=num1-num2;
	        num1=num1-num2;
	         
	         System.out.println("Swapped Numbers are : "+num1+" and "+num2);


	}

}
