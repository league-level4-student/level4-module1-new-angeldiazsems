package _06_Hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {

	public boolean performsSurgery() {

		return true;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignPatient(Patient p) throws Exception {
		// TODO Auto-generated method stub
		if (getPatients().size() < 4) {
			getPatients().add(p);
		}
		else {
			throw new DoctorFullException();
		}
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

}
