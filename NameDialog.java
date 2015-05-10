// NameDialog.java
// Using JOptionPane to take user input from DialogBox
import javax.swing.JOptionPane;

public class NameDialog{

	// main method start execution of Java applications 
	public static void main(String[] args){

		// Prompt user to input name
		String name = JOptionPane.showInputDialog("What is your name?");

		// create the message 
		String message = String.format("Welcome, %s, to Java Programming!", name);

		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);

	}// end of main method

}// end of class NameDialog