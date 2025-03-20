package VetPackage;

// a class that holds details of an appointment for a Rat or a Hamster
// how can it handle either? 

public class VetAppointment<T, U> {
	
	// constructor 
	public VetAppointment() {
		
	}
	
	// pre-generics, this would work for any given animal
	// but super unsafe
	public Object diagnose(Object animal) {
		
		Object diagnosis = new Object();
		
		// some complicated code to decide what is wrong with the given animal
		
		return diagnosis;
				
		
	}
	

}
