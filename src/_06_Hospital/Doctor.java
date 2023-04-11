package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public abstract void doMedicine();
		
	public abstract void assignPatient(Patient p) throws Exception;
	
	public ArrayList<Patient> getPatients(){
		return patients;
		
	}
}
