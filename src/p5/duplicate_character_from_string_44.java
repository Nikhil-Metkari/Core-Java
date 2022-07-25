package p5;

// To find out duplicate character from string
public class duplicate_character_from_string_44 {

	public static void main(String[] args) {

     String str = "Good Opportunity is there";
     String str1=str.replaceAll(" ","");
     char arr[]=str1.toCharArray();
    
     for(int i=0;i<str1.length();i++)
     {
    	 int cnt=0;
    	 for(int j=i+1;j<str1.length();j++)
    	 {
    		 if(arr[i]==arr[j])
    		 {
    			 cnt++;
    	    //Set arr[j] to 0 to avoid printing visited character  
                 arr[j] = '0';  
    		 }
    	 }
    	 if(cnt>0 && arr[i]!='0')
         {
        	 System.out.println(arr[i]);
         }

     }
     System.out.println("----------------------------------------------------------");
//     for(int i=0;i<str1.length();i++)
//     {
//    	 
//    	 for(int j=i+1;j<str1.length();j++)
//    	 {
//    		 if(arr[i]==arr[j])
//    		 {
//    		System.out.println(arr[j]);  
//    		break;
//    		 }
//    	 }
//     }
     
    

	}

}
