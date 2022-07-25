package p2;

public class Palindrome_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Anna";
		String str1="";
		
		System.out.println("Guven String is : "+str);
		
		str=str.toLowerCase();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		
         if(str.equals(str1))
         {
        	 System.out.println("\nGiven String is Palindome");
         }
         else {
        	 System.out.println("\nGiven String is Not Palindome");
     }
         //Method 2
//         StringBuffer str2 = new StringBuffer(str);
//         str2.reverse();
//         String s = str2;
////         System.out.println(str2);
////         System.out.println(str);
//         
//         if(str.equals(str2))
//         {
//        	 System.out.println("\nGiven String is Palindome");
//         }
//         else
//         {
//        	 System.out.println("\nGiven String is Not Palindome");
//         }
         
         
	}

}
