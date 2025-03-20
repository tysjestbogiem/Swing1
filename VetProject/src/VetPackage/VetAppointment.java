package VetPackage;

// a class that holds details of an appointment for a Rat or a Hamster
// how can it handle either? 

public class VetAppointment<T, U> {
	
	
	// generic member variables
	private T animal;
	private U diagnosis;
	
	
	// constructor 
	public VetAppointment() {
		
	}
	
	// generic method
	public U diagnose(T theAnimal) {
		
		RatDiagnosis sickRat;
		HamsterDiagnosis sickHamster;
		
		if (theAnimal instanceof Rat) {
			System.out.println("Hi Rat.");
			sickRat = new RatDiagnosis();
			return (U) sickRat;
			
		} else if (theAnimal instanceof Hamster) {
			System.out.println("Hi Hamster");
			sickHamster = new HamsterDiagnosis();
			return (U) sickHamster;
			
		} else {
			System.out.println("Not found.");
		}
		
		return diagnosis;
	}
	

}
