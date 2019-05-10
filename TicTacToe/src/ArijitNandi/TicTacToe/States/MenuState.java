package ArijitNandi.TicTacToe.States;
import java.awt.Color;
import java.awt.Graphics;
import ArijitNandi.TicTacToe.Managers.GameStateManager;
import ArijitNandi.TicTacToe.Managers.Handler;

public class MenuState extends State {
	
	public MenuState(int stateID, Handler handler) {
		super(stateID,handler);
	}
	@Override
	public void update(GameStateManager gameStateManager) {
		if(handler.getMouseManager().clicked) {
			handler.getMouseManager().clicked = false;
			gameStateManager.setCurrentState(GameStateManager.GAME_STATE);
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 600, 600);
	}

}
