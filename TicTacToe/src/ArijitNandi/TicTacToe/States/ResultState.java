package ArijitNandi.TicTacToe.States;
import java.awt.Graphics;
import java.awt.Color;
import ArijitNandi.TicTacToe.Managers.GameStateManager;
import ArijitNandi.TicTacToe.Managers.Handler;

public class ResultState extends State {

	public ResultState(int stateID, Handler handler) {
		super(stateID,handler);
	}
	@Override
	public void update(GameStateManager gameStateManager) {
		if(handler.getMouseManager().clicked) {
			handler.getMouseManager().clicked = false;
			gameStateManager.setCurrentState(GameStateManager.MENU_STATE);
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 600, 600);
	}

}
