package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class GenerateCSV {

	public static void generateCSVReport() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy_HHmmss");

		String csvFile = "output" + dtf.format(LocalDateTime.now()) + ".csv";

		List<String> headers = Arrays.asList("Name", "Age", "Country");
		List<List<String>> data = Arrays.asList(Arrays.asList("Alice", "30", "USA"), Arrays.asList("Bob", "25", "UK"),
				Arrays.asList("Charlie", "35", "Canada"));

		try (FileWriter writer = new FileWriter(csvFile);
				CSVPrinter csvPrinter = new CSVPrinter(writer,
						CSVFormat.DEFAULT.withHeader(headers.toArray(new String[0])))) {

			for (List<String> record : data) {
				csvPrinter.printRecord(record);
			}

			System.out.println("CSV file is created successfully!");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("hello World");
		}
	}

}
