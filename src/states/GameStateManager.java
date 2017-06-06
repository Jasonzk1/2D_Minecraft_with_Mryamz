package states;

/**
 * 
 * @author Teddy Clapp
 * <br>----------------------------</br>
 * <ul>
 *     <li>Details:</li>
 *     <li>This class is used to change the state of our game.</li>
 * </ul>
 *
 */

public class GameStateManager {
	
	private static GameState gameState;
	
	public static GameState getGameState() {
		return gameState;
	}

	public static void setGameState(GameState gameState) {
		GameStateManager.gameState = gameState;
	}

}
