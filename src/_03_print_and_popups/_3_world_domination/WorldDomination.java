package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		//king.equals("YES")//for comparison
		//here's an example of what I was saying
		//org.jointheleague.graphical.robot.Robot@55d56113 is an object refrence id
		//we wouldn't be able to say rob == new Robot(), even if they had the same value
		// so .equals for strings
		//Robot rob = new Robot();
		//System.out.println(rob);
		String king = JOptionPane.showInputDialog("Do you know how to code? (YES or NO)");
		if(king.equals("YES")) {
			JOptionPane.showMessageDialog(null, "Now you can RULE THE WORLD!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Then lern codeing with the LEAGE! Like I am! Self-promoshon! Yay!");
		}
	}
}