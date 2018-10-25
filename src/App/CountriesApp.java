package App;

import java.util.Scanner;

public class CountriesApp {
public static void main(String[] args) {
	 int userChoice;
	 
	 Scanner scan = new Scanner(System.in);
	
	 
	 String directoryFolder = "CountriesTextFile";
		String fileName = "Countries.txt";
		
		
		//CountriesTextFile.createDirectory();
		//CountriesTextFile.createFile(directoryFolder, fileName);
		
	System.out.println("Welcome to the Countries Application.");
	
	do {
	userChoice = Validator.getInt(scan, "1-See List of Countries\n2-Add a Country\n3-exit.", 1, 3);
	
	System.out.println(" ");
	if (userChoice == 1) {
		
		CountriesTextFile.readFromFile(directoryFolder, fileName);
		
	}
	
	 else if (userChoice == 2) {
		 
		 String choice = Validator.getString(scan, "Add a country name.");
		 CountriesTextFile.writeToFile(directoryFolder, fileName, choice);	 
		
	} System.out.println(" ");
	} while (userChoice != 3);
	
	System.out.println("Thank you for using the Countries App.");

}	



}
