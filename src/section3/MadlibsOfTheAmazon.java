package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective=JOptionPane.showInputDialog("what do you think?");
		// Get the user to enter a type of liquid
		String typeofliquid = JOptionPane.showInputDialog("What type of liquid do you drink? ");
		// Get the user to enter a body part
		String bodypart = JOptionPane.showInputDialog("What do you use to look at something? ");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("What do you do on your freetime? ");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Whats your favorite place? ");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showInputDialog("Jack,");
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

