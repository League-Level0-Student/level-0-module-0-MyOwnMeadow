package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		int score = 0;
		// Create a variable to hold the user's score. Set it equal to zero. 
		String qOne = JOptionPane.showInputDialog("Which has a smaller snout: a camin or an alagater?");

			if(qOne.equals("camin")) {
				JOptionPane.showMessageDialog(null, "CORECT!");
				score += 50;
			}
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
