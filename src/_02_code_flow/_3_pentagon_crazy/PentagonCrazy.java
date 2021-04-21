package _02_code_flow._3_pentagon_crazy;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	public static void main(String[] args) {
		Robot penta = new Robot();
		
		penta.penDown();
		penta.setSpeed(100);
		penta.setPenColor(0, 170, 170);
		
		int sidea = 5;
		int turnA = 360/sidea;
		int lop = 0;
		
		while(lop < sidea*50) {
			penta.move(lop);
			penta.turn(turnA+1);
			lop += 1;
		}
		penta.hide();
	}
}
