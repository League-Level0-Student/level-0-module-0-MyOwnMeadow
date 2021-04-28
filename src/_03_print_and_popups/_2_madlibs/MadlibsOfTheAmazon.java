package _03_print_and_popups._2_madlibs;
import javax.swing.JOptionPane;
public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		JOptionPane.showMessageDialog(null, prompt);
		String adj = JOptionPane.showInputDialog("Enter an adjective [type in all caps]...");
		String liquid = JOptionPane.showInputDialog("... Then enter a type of liquid...");
		String bodyPart = JOptionPane.showInputDialog("... Now enter a body part...");
		String verb = JOptionPane.showInputDialog("... Then a verb...");
		String place = JOptionPane.showInputDialog("... And finaly a place.");
		
		String story = 
		"Piranhas are more " + adj +" during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh " + liquid + " and will most\n"  +
		"likely take a bite out of your " + bodyPart + " if you " + verb + ". Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the " + place + " Good luck!";
		
		JOptionPane.showMessageDialog(null, story);
	}
}