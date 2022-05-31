package com.bridgelabz.addressbooksystem_day_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookSystemUC14 {
	public static void main(String [] args) {
		File file = new File("C:\\Users\\Ramesh\\Desktop\\AddressBookSystem\\AddressBookSystem.csv");
		try {
			boolean create = file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write("First Name");
			bWriter.write(',');
			bWriter.write("Last Name");
			bWriter.write(',');
			bWriter.write("Address");
			bWriter.write(',');
			bWriter.write("City");
			bWriter.write(',');
			bWriter.write("Zip");
			bWriter.write(',');
			bWriter.write("Phone Number");
			bWriter.write(',');
			bWriter.write("Email");
			bWriter.write('\n');
			bWriter.write("Ramesh");
			bWriter.write(',');
			bWriter.write("Ramasami");
			bWriter.write(',');
			bWriter.write("Perambalur");
			bWriter.write(',');
			bWriter.write("S.Aduthurai");
			bWriter.write(',');
			bWriter.write("621108");
			bWriter.write(',');
			bWriter.write("9629789619");
			bWriter.write(',');
			bWriter.write("softramesh29@gmail.com");
			bWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fileReader);
			String line = bReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bReader.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
