package _06_Hospital;

public class Patient {

	boolean checked = false;
	
	public boolean feelsCaredFor() {
		if(checked == false) {
			return false;
		}
		return true;
	}
	
	public void checkPulse() {
		checked = true;
	}
}
