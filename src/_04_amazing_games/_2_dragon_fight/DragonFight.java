package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	Random ran = new Random();

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		
//HP values
		
		int dragonHP = 250;
		int playerHP = 100;

//ATK values
		int playerATK = 0;
		int dragonATK = 0;
		
		String playerName = JOptionPane.showInputDialog("ENTER NAME OF ''HERO'' HERE:");

//FIGHT BEGENS	
		while (true) {

	// THE PLAYER ATTACKS THE DRAGON
			String playerChoise = JOptionPane.showInputDialog("Do you attack with a kick or a yell?");
			
			if (playerChoise.equalsIgnoreCase("Kick")) {
				playerATK = ran.nextInt(25);
				JOptionPane.showMessageDialog(null, playerName + " kicks the Dragon.\n" + "Dragon takes " + playerATK + " damege.");
			}
				else if (playerChoise.equals("yell")) {
					playerATK = ran.nextInt(5);
					JOptionPane.showMessageDialog(null, playerName + " weekly shouts at the Dragon. It dosn't seem to care that much...\n" + "Dragon takes only " + playerATK + " damege.");
				}
				else if (playerChoise.equals("YELL")) {
					playerATK = ran.nextInt(50);
					JOptionPane.showMessageDialog(null, playerName + " YELLs at the dragon with the furry of " + playerATK +",000 suns.\n" + "Dragon takes " + playerATK + " damege.");
				}
				else {
					JOptionPane.showMessageDialog(null, playerName + " is completly confused.\n" + "They stand there idoly, not knowing what to do.");
				}
			dragonHP -= playerATK;
			
	// THE DRAGON RETALIATES
			dragonATK = ran.nextInt(35);
			playerHP -= dragonATK;
			
			JOptionPane.showMessageDialog(null,"The Dragon swings its talon at " + playerName + ".\n" + playerName + " takes " + dragonATK + " damege.");

// ASSESS THE DAMAGE
			if (playerHP <= 0) {
				
				playerLost();
			}
				else if (dragonHP <= 0) {
					
					dragonLost();
				}
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
	
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method

			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "The Dragon's swipe was fatel to the hero.\n" + "It seems as if they will never have another avencher agin...");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		int reword = ran.nextInt(999);
		JOptionPane.showMessageDialog(null, "The ''Hero'' slays the Dragon. After serching its den, they find a grand toltol of " + reword + " gold coins!");
		System.exit(0);   //This code ends the program
	}

}
