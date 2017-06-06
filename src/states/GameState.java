package states;

import java.awt.Graphics2D;

/**
 * 
 * @author Teddy Clapp
 * <br>----------------------------</br>
 * <ul>
 *     <li>Details:</li>
 *     <li>This little interface allows for polymorphism of game states.</li>
 * </ul>
 *
 */

public interface GameState {
	
	void draw(Graphics2D g2);
	
	void update();
}
