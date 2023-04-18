package _06_Hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor {

	public boolean makesHouseCalls() {

		return true;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < getPatients().size(); i++) {
			Patient p = getPatients().get(i);
			p.checkPulse();
		}
	}

	@Override
	public void assignPatient(Patient p) throws Exception {
		// TODO Auto-generated method stub
		if (getPatients().size() < 3) {
			getPatients().add(p);
		}
		else {
			throw new DoctorFullException();
		}
	}

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

}
