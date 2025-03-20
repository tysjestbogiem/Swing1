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
		
//		VetAppointment<Rat, RatDiagnosis> = new VetAppointment<Rat, RatDiagnosis>;
		
		if(response == 1) {
			VetAppointment<Rat, RatDiagnosis> myAppointment = new VetAppointment<Rat, RatDiagnosis>();
			RatDiagnosis  newDiagnosis = myAppointment.diagnose(new Rat( "Timy"));
			System.out.println("Your rat has " + newDiagnosis.getRatDisease());
		
		}
		else if(response == 2) {
			VetAppointment<Hamster, HamsterDiagnosis> myAppointment = new VetAppointment<Hamster, HamsterDiagnosis>();
			HamsterDiagnosis  newDiagnosis = myAppointment.diagnose(new Hamster( "Rob"));
			System.out.println("Your hamster has " + newDiagnosis.getHamsterDisease());

			
		} else {
			System.out.println("invalid input");
		}
	}

}
