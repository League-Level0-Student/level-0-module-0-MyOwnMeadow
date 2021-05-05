package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		int score = 0;
		
		String qOne = JOptionPane.showInputDialog("Which has a smaller snout: a camin or an alagater?");
			
		if(qOne.equals("camin")) {
			JOptionPane.showMessageDialog(null, "CORECT!");
			score += 50;
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORECT! (Nice try tho)");
			score -= 20;
		}
		
		String qTwo = JOptionPane.showInputDialog("Which of the following is the largesest cuntry in the world by land mass? Russia, Canada, China, USA, Birsil, Africa");
		
		if(qTwo.equals("Russia")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score += 50;
		}
		
		else if(qTwo.equals("Africa")) {
			JOptionPane.showMessageDialog(null, "INCORECT. (Africa is not a cuntry, it is a contanent).");
			score -= 100;
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORECT. (Not good geographicly, I see).");
			score -= 20;
		}
		
		String qThree = JOptionPane.showInputDialog("Finaly, about how ol+[]= _p[-{-[;-... STR_UPI_TRS:/_STR_UPI_:OBOMH/_STR_UPI_JI<RM/... 13.7b, 4.5b, []_=+, YES, YES, APSOLUTLY");
		
		if(qThree.equals("13.7b")) {
			JOptionPane.showMessageDialog(null, "INCORECT. MPY THE QUSHTON. YES, YES, OR APSOLUTLY... (Yes, you are corect. The Univerce is about 13.7 billeon years old).");
			score += 50;
		}
		else if(qThree.equals("YES")) {
			JOptionPane.showMessageDialog(null, "I KNEW IT... (Why did you ancer them?!?! Now you're stuck in here, Why?... I'LL SEE YOU IN HERE FROM OUT THERE NEXT TIME!!");
			score += 1000;
		}
		else if(qThree.equals("APSOLUTLY")) {
			JOptionPane.showMessageDialog(null, "I KNEW IT, NOW MY SUSSPISHONS HAVE BEEN COMFERMED... (Why did you ancer t-+=[}[... I'LL SEE YOU IN HERE FROM OUT THERE NEXT TIME!! AND SHE, TO!");
			score += 2000;
		}
		else {
			JOptionPane.showMessageDialog(null, "EJP_STR_UPI/... (Incorect, but I don't blame you for not understanding the queshton, consitering, Nevermind).");
			score -= 10;
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
	}
}