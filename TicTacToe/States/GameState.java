package ArijitNandi.TicTacToe.States;

import java.awt.Color;
import java.awt.Graphics;
import ArijitNandi.TicTacToe.Managers.GameStateManager;
import ArijitNandi.TicTacToe.Managers.Handler;
import ArijitNandi.TicTacToe.GameElements.*;

public class GameState extends State {
	
	private Grid grid;
	
	public GameState(int stateID, Handler handler){
		super(stateID,handler);
		grid = new Grid(handler);
	}
	@Override
	public void update(GameStateManager gameStateManager) {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 600, 600);
		grid.render(g);
	}
	
}
