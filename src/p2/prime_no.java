package p2;

import java.util.Scanner;
// No is prime or not
public class prime_no {

	public prime_no(int num)
	{
		int cnt=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		if(cnt==1) {
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("Given number is Not prime number");
		}
			
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		if(num==0 && num==1)
		{
			System.out.println(" 0 and 1 is not a prime number");
		}
		else {
			prime_no no = new prime_no(num);
		}

	}

}
