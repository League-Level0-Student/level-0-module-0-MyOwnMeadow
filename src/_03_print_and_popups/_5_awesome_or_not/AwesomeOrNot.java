package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;
import javax.swing.JOptionPane;

public class AwesomeOrNot {
	
	public static void main(String[] args) {
		
		Random ran = new Random();    //This will be used below to make a random number. 
		int dom = ran.nextInt(4);
		
		System.out.println(dom);
		
		JOptionPane.showInputDialog("Tell us something that you think is awsom!");
			if(dom == 0) {
				JOptionPane.showMessageDialog(null, "That is apsuoluly AWSOM!!!");
			}
			else if(dom == 1) {
				JOptionPane.showMessageDialog(null, "That is prety good.");
			}
			else if(dom == 2) {
				JOptionPane.showMessageDialog(null, "...Huh? We all fell aslep... That was vary boring...");
			}
			else if(dom == 3) {
				JOptionPane.showMessageDialog(null, "That is... BETER THEN EVERYTHING WE'VE EVER HEARD BEFORE!!!");
			}
			else {
				JOptionPane.showMessageDialog(null,"...Huh? It seems as if the code is broken... This shouldn't even be happening!");
			}
	}
}
