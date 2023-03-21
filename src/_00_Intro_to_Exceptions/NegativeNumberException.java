package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{

	 static void scaryPopup() {
		
		 JOptionPane.showMessageDialog(null, "you have a virus on your computer");
		 
		 
	}
	
}
