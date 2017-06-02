package main;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import states.GameStateManager;
import states.PlayState;

/**
 * 
 * @author Teddy Clapp <br>
 *         ----------------------------</br>
 *         <ul>
 *         <li>Details:</li>
 *         <li>This class contains the GameLoop and updates the current game's
 *         state</li>
 *         </ul>
 *
 */

public class AppPanel extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	// the dimensions to the JFrame
	public static final int WIDTH = 800;
	public static final int HEIGHT = 650;

	// used for drawing to the screen
	private BufferedImage img;
	private Graphics2D g2;
	private Thread thread;

	// simple way to sync for ~60 fps
	private long timer = System.nanoTime();
	private int delay = (int) (1000f / 60f);

	public AppPanel() {
		img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g2 = img.createGraphics();

		thread = new Thread(this, "GameLoop Thread");
		thread.start();
		
		// set in constructor to ensure it'll be not null
		GameStateManager.setGameState(new PlayState());

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	@Override
	public void run() {
		// the meat of the game loop
		while (true) {
			// convert nano seconds to millis
			long elapsedTime = (System.nanoTime() - timer) / 1_000_000;
			if (elapsedTime > delay) {
				// update our game
				GameStateManager.getGameState().update();
				GameStateManager.getGameState().draw(g2);
				if (getGraphics() != null)
					getGraphics().drawImage(img, 0, 0, WIDTH, HEIGHT, null);
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
