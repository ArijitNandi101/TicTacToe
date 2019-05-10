package ArijitNandi.TicTacToe.Managers;

import ArijitNandi.TicTacToe.States.*;

import java.awt.Graphics;

public class GameStateManager {
	public static final int MENU_STATE = 0,
							GAME_STATE = 1,
							RESULT_STATE = 2;
	private Handler handler;
	private int currentState;
	private State[] stateList; 
	
	public GameStateManager(Handler handler) {
		setCurrentState(MENU_STATE);
		stateList = new State[3];
		stateList[0] = new MenuState(MENU_STATE,handler);
		stateList[1] = new GameState(GAME_STATE,handler);
		stateList[2] = new ResultState(RESULT_STATE,handler);
	}
	
	public void update() {
		stateList[currentState].update(this);
	}
	public void render(Graphics g) {
		stateList[currentState].render(g);
	}
	public State getCurrentState() {
		return stateList[currentState];
	}
	public void setCurrentState(int stateID) {
		currentState = stateID;
	}
}
