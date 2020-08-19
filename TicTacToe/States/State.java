package ArijitNandi.TicTacToe.States;
import java.awt.Graphics;
import ArijitNandi.TicTacToe.Managers.GameStateManager;
import ArijitNandi.TicTacToe.Managers.Handler;

public abstract class State {
	protected int stateID;
	protected Handler handler;
	
	State(int stateID, Handler handler) {
		this.stateID = stateID;
		this.handler = handler;
	}
	public abstract void update(GameStateManager gameStateManager);
	
	public abstract void render(Graphics g);
	
	//GETTERS
	public int getID() {
		return stateID;
	}
}
