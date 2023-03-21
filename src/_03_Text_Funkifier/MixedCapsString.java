package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		char[] c = new char[unfunkifiedText.length()];
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(i%2 == 0) {
				c[i] = unfunkifiedText.toLowerCase().charAt(i);
			}
			else {
				c[i] = unfunkifiedText.toUpperCase().charAt(i);
			}
		}

		String result = String.valueOf(c);
		return result;
	}

}
