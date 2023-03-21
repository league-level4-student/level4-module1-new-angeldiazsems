package _03_Text_Funkifier;

public class testClassLol implements TextFunkifier{

	private String unfunkifiedText;
	
	public testClassLol(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}
	
	
	
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub		
		return unfunkifiedText.toLowerCase();
	}

}
