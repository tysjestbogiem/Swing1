package VetPackage;

import java.util.Scanner;

// Creates vet appointments

public class VetController {
	
	// for demonstration we'll create both types of appointment in the constructor
	
	public VetController() {
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Vet App");
		System.out.println("Which type of animal do you want to create an appointment for? \n1 for Rat, 2 for Hamster");
		int response = myInput.nextInt();
		
		if(response == 1) {
			
			
		}
		else if(response == 2) {
			

			
		} else {
			System.out.println("invalid input");
		}
	}

}
