package p2;

//15. Write a java program to find factorial of a given number.
public class Factorial_num {

	//Method 3
	public  int Factorial_no(int n)
	{
		if(n==1)
		{
			return 1 ;
		}
		else {
			int sum1 = (n*Factorial_no(n-1));
			return sum1;
		}
	
	}
	
	public static void main(String[] args)
	{
		//Method 1
		int num=5,sum=1;
		
		Factorial_num fact = new Factorial_num();
		int s =fact.Factorial_no(num);
		System.out.println("Factorial of "+num+" is :"+ s);
		
		System.out.println("-----------------------------------------------");
		for(int i=1;i<=num;i++)
		{
			sum*=i;
		}
		System.out.println("Factorial of "+num+" is :"+sum);
        
		System.out.println("-----------------------------------------------");
		// Method 2 
		int factorial=1,cnt=1;
		while(cnt<=num)
		{
			factorial*=cnt;
			cnt++;
		}
		System.out.println("Factorial of "+num+" is :"+factorial);
	}

}
