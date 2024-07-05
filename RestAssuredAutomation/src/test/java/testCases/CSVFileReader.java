package testCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CSVFileReader {

	public static void main(String[] args) throws IOException {

		//Approach using Scanner class
//		
		File file = new File(System.getProperty("user.dir")+"\\data\\example.csv");
		
		Scanner sc =new Scanner(file);
		
		sc.useDelimiter(",");
		
		while(sc.hasNext()) {
			System.out.print(sc.next()+"\t");
		}
		sc.close();
//		
//		
		
		//Approach2: Using Java split() method
		
		String csvFileName = System.getProperty("user.dir")+"\\data\\example.csv"; // from this file we need to read data
		
		FileReader reader = new FileReader(csvFileName); // which file need to read
		
		BufferedReader bfrreader = new BufferedReader(reader); // read data line by line
		
		String line;
		 
		while((line=bfrreader.readLine())!=null) 
		{
			String[] data = line.split(",");
			
			for(String value:data)
			{
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
	}

}
