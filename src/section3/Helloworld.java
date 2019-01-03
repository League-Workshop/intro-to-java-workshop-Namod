package section3;

import javax.swing.JOptionPane;

public class Helloworld {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Hello World!");
		String sentence = JOptionPane.showInputDialog("Type a sentence ");
		speak(sentence); 
	}

	private static void speak(String sentence) {
		// TODO Auto-generated method stub
	
	}
}
