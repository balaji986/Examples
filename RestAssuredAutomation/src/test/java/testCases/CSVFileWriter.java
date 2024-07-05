package testCases;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {

	public static void main(String[] args) throws IOException {

		String csvFileName =System.getProperty("user.dir")+"\\data\\example.csv";
		
		FileWriter writer =new FileWriter(csvFileName);
		
		writer.append("Name,Age,Email \n"); //(header) add data to csv file
		
		writer.append("balaji,24,balaji@gmail.com \n ");
		writer.append("balaji2,25,balaji2@gmail.com \n ");
		writer.append("balaji3,26,balaji3@gmail.com \n ");
		writer.append("balaji4,27,balaji4@gmail.com \n ");
		
		writer.close();
		
		System.out.println("CSV file created at:" + csvFileName);
		
	}

}
