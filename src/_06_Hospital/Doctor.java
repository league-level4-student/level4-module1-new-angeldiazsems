package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	
	public abstract void doMedicine();
	
	public abstract void holdListOfPatients();
	
	public abstract void assignPatient();
	
	public abstract ArrayList<String> getPatients();
}
