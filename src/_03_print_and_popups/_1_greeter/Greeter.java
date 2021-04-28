package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("HELLOW OUT THERE, LIVEING BEING!");
		String in = JOptionPane.showInputDialog("How is the wether out there?");
		JOptionPane.showMessageDialog(null, "The wether is " + in);
	}
}