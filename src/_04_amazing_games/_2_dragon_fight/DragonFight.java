package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		
//HP values
		
		int dragonHP = 200;
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
				playerATK = ran.nextInt(25);			//Damage
				JOptionPane.showMessageDialog(null, playerName + " kicks the Dragon.\n" + "Dragon takes " + playerATK + " damege.");
			}
				else if (playerChoise.equals("yell")) {
					playerATK = ran.nextInt(5);			//Damage
					JOptionPane.showMessageDialog(null, playerName + " weekly shouts at the Dragon. It dosn't seem to care that much...\n" + "DRAGON ONLY TAKES " + playerATK + " DAMEGE.\n" + "[Tip: You yelled to weekly]");
				}
				else if (playerChoise.equals("YELL")) {
					playerATK = ran.nextInt(100);		//Damage
					JOptionPane.showMessageDialog(null, playerName + " YELLs at the dragon with the furry of " + playerATK +",000 suns.\n" + "DRAGON TAKES " + playerATK + " DAMEGE.");
				}
				else {
					JOptionPane.showMessageDialog(null, playerName + " is completly confused.\n" + "They stand there idoly, not knowing what to do.\n" + "[Tip: Check your spelling; sometimes capatilization maters to]");
				}
			dragonHP -= playerATK;
			
	// THE DRAGON RETALIATES
			dragonATK = ran.nextInt(35);
			playerHP -= dragonATK;
			
			JOptionPane.showMessageDialog(null,"The Dragon swings its talon at " + playerName + ".\n" + playerName + " TAKES " + dragonATK + " DAMEGE.");

// ASSESS THE DAMAGE
			if (playerHP <= 0) {
				
				playerLost();
			}
				else if (dragonHP <= 0) {
					
					dragonLost();
				}
			JOptionPane.showMessageDialog(null, "The battle contiuns; both " + playerName + " and the Dragon are deturmened for difrent resons...\n" + "DRAGON'S HELTH: " + dragonHP + "\n" + playerName + "'S HELTH: " + playerHP);

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "The Dragon's swipe was fatel to the hero.\n" + "It seems as if they will never have another avencher agin...");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "The ''Hero'' slays the Dragon. After serching its den, they find a grand toltol of 100,000 gold coins!\n" + "They also found a nest of 5 eggs. Now they have some brekfest...");
		System.exit(0);   //This code ends the program
	}

}
