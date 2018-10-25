package App;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {


	public static void readFromFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();
		try {
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);  
		
		String line = reader.readLine();
		
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();	
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		
		} catch (IOException e) {
			System.out.println("Contact customer service.");
		
		}
	}
			
	
public static void writeToFile(String directoryFolder, String fileName, String input) {
		
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();
		String country = input;
		
		try {
			//the true parameters for the FileOutputStream() constructor
			//appends data to the end of the file.
			//false rewrites over the entire file
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
		    outW.println(country);
			outW.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			
		}
}

	public static void createFile(String directoryFolder,
			String fileName) {
				
				Path filePath = Paths.get(directoryFolder, fileName);
				
				if (Files.notExists(filePath)){
					try {
						Files.createFile(filePath);
						System.out.println("File was created succesfully.");
					} catch (IOException e) {
					System.out.println("Something when wrong with file creation.");
					}
				} else {
				 System.out.println("File already exists.");
					
				}
				
			}
			public static void createDirectory() {
				String dirPath = "CountriesTextFile";
				
				Path folder = Paths.get(dirPath);
				if (Files.notExists(folder)) {
					
					try {  //this is an example of a checked exception
						Files.createDirectories(folder);
						System.out.println("Folder was created successfully");
					} catch (IOException e) {
						System.out.println("Something went wrong with folder creation.");
					}
					
				}
			}
			
			
	

}






