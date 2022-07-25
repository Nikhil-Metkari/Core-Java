package p2;

import java.util.Scanner;

//11.Write program for Armstrong number
public class Armstrong_num {
	
	public Armstrong_num(int num)
	{
		int rem,total=0,n=0,cnt=0;
		int num1 = num;
		//for( ;num1!=0;num1 /= 10,++n);
		//System.out.println(n);
		while(num1!=0)
		{
			num1=num1/10;
			n++;
		}
		num1 = num;
		while(num1!=0)
		{
			rem=num1%10;
			total=(int) (total+Math.pow(rem, n));
			num1=num1/10;
		}
		if(total==num)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is Not  armstrong number");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		 Armstrong_num  n = new  Armstrong_num(num);

	}

}
