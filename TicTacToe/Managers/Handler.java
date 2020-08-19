package ArijitNandi.TicTacToe.Managers;

import ArijitNandi.TicTacToe.Game;
import ArijitNandi.TicTacToe.Display.Display;

public class Handler {
	private Game game;
	private KeyManager keyManager;
	private MouseManager mouseManager;
	public Handler(Game game,KeyManager keyManager, MouseManager mouseManager){
		this.game = game;
		this.keyManager = keyManager;
		this.mouseManager = mouseManager;
	}
	public Game getGame() {
		return game;
	}
	public Display getDisplay() {
		return game.getDisplay();
	}
	public KeyManager getKeyManager() {
		return keyManager;
	}
	public MouseManager getMouseManager() {
		return mouseManager;
	}
}
