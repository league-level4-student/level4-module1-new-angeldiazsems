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
	
	public void assignPatient() throws Exception{
		for(int i = 0; i < doctors.size(); i++) {
			if(doctors.get(i).getPatients().size() < 4) {
					try {
						doctors.get(i).assignPatient(unassignedP.get(0));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				unassignedP.remove(0);
			}
		}
	}
	
	public void assignPatientsToDoctor() throws Exception {
		for(int i = 0; i < doctors.size(); i++) {
			for(int j = unassignedP.size()-1; j >= 0; j--) {
				if(doctors.get(i).getPatients().size() != 3) {
					try {
						doctors.get(i).assignPatient(unassignedP.get(j));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					unassignedP.remove(j);
				}
				else {
					break;
				}
				
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