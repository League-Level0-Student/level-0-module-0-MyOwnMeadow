package _02_code_flow._2_robot_spiral;
import org.jointheleague.graphical.robot.Robot;
public class RobotSpiral {

	public static void main(String[] args) {
		

		Robot wallE = new Robot();
			wallE.penDown();
			wallE.setSpeed(150);
			wallE.setRandomPenColor();
		
		int spirl = 0;
		while(spirl < 100) {
			wallE.setRandomPenColor();
			wallE.move(5*spirl);
			wallE.turn(360/7);
			spirl += 1;
		}
	}
}
