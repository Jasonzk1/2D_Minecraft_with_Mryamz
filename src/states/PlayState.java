package states;

import java.awt.Font;
import java.awt.Graphics2D;

/**
 * 
 * @author Teddy Clapp
 * <br>----------------------------</br>
 * <ul>
 *     <li>Details:</li>
 *     <li>The world, player and everything fun shall be in this class</li>
 * </ul>
 *
 */

public class PlayState implements GameState {

	@Override
	public void draw(Graphics2D g2) {
		g2.setFont(new Font("Arial", Font.PLAIN, 65));
		g2.drawString("What's up", 50, 200);
	}

	@Override
	public void update() {
		
	}

}
