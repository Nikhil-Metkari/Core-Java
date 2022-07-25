package p1;

//Write a Java Program to Count number of words in the String

public class Count_No_of_Words {

	public static void main(String[] args) 
	{
        String str = "India is a my country";
        String str1=str.replaceAll(" ","");
        System.out.println(str1);
          int cnt=0;
        for(int i:str1.toCharArray())
        {
        	cnt++;
        }
        System.out.println("Total count of letter in string is : "+cnt);

        int cnt1=1;
        char arr[] = str.toCharArray();
        for (int i=0;i<arr.length;i++)
        {
        	if(arr[i]==' ')
        	cnt1++;
        }
        System.out.println("Total count of words in string is : "+cnt1);
	}

}
