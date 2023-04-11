package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedP = new ArrayList<Patient>();
	
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public void addPatient(Patient p) {
		unassignedP.add(p);
	}
	
	public void assignPatient() {
		for(int i = 0; i < doctors.size(); i++) {
			if(doctors.get(i).getPatients().size() < 4) {
				try {
					doctors.get(i).assignPatient(
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				unassignedP.remove(0);
			}
		}
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public ArrayList<Patient> getPatients(){
		return unassignedP;
	}
	
}
