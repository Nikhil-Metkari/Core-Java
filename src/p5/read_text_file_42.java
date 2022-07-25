package p5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_text_file_42 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
       
		try {
			 FileReader fr = new FileReader("F:\\Java\\file1.txt");
		
    System.out.println("Content of file is :");
        int i;
           while((i=fr.read())!=-1)
           {
        	   System.out.print((char) i);
           }
		} 
           catch (FileNotFoundException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
		System.out.println("\n---------------------------------------");
		
		File file = new File("F:\\Java\\file1.txt");
		
		BufferedReader br= new BufferedReader(new FileReader(file));
		
		int k ;
		while((k=br.read())!= -1)
		{
			System.out.print((char)k);
		}
		 
    }
		
	}


