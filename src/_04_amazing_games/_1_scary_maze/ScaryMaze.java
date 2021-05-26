package _04_amazing_games._1_scary_maze;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	boolean started = false;
	BufferedImage maze;
	final int frameWidth = 500;
	final int frameHeight = 500;

	ScaryMaze() throws Exception {
		
		maze = ImageIO.read(getClass().getResource("Java Flower Maze.png"));
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);	
		
		System.out.println(mouseColor);
		
		int startColor=-12570368;
		int voidColor=-16777216;
		int winColor=-12582912;
		
		if (!started  && mouseColor==startColor) {
			started = true;
		}
		
		if (started) {
			if (mouseColor == voidColor) {
				scare();
			}
			else if (mouseColor == winColor) {
				JOptionPane.showMessageDialog(null, "YOU WON!\n	You get a prety flower!");
			}
			
		}	
	}

	private void scare() {
		System.out.println(")9*78usfUhfUefj!!!");
		
		if (canPlaySounds) {
			playScarySound("62386__fons__eng-1.wav");
		}	
		showScaryImage("Nightmare Flower.jpg");
	}
	
	
	
	
	
	
	
	/**********  DO NOT CHANGE THE CODE BELOW THIS LINE ***************/
	
	private void playScarySound(String soundName) {
		File sound = new File("src/_04_amazing_games/_1_scary_maze/"+soundName);
		if (sound.exists()) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound "+ e.getMessage());
			}
 		}
		else {
			System.out.println("File does not exist");
		}
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Could not find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



