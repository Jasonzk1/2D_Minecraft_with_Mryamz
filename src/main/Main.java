package main;

import javax.swing.JFrame;

/**
 * 
 * @author Teddy Clapp
 * <br>----------------------------</br>
 * <ul>
 *     <li>Details:</li>
 *     <li>This class just creates the Subclass of JPanel and adds it to a JFrame.
 * </ul>
 *
 */
public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.add(new AppPanel());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
