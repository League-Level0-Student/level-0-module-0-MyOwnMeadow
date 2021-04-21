package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int base = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		Robot ninja = new Robot();
		ninja.penDown();
		ninja.setSpeed(100);
		Robot.setWindowSize(800, 800);
		
		int lop = 0;
		
		while(lop < 25) {
			ninja.setPenColor(255, 100, 100);
			ninja.turn(360/8);
			ninja.move(64);
			ninja.turn(-360/8);;
			ninja.move(flameSize);
			ninja.turn(170);
			ninja.move(flameSize);
			ninja.turn(64);
			ninja.setPenColor(100, 100, 120);
			ninja.move(base);
			lop += 1;
		}
		ninja.hide();
	}
}
