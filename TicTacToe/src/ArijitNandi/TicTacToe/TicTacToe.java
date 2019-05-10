package ArijitNandi.TicTacToe;

public class TicTacToe {
	private static final String TITLE = "TicTacToe";
	private static final int WIDTH = 600,
							HEIGHT = 600;
	public static void main(String[] args) {
		Game game = new Game(TITLE,WIDTH,HEIGHT);
		synchronized(game) {
			game.start();
		}
		try {
			game.join();
		} catch(InterruptedException ex) {
			System.out.println("Game_Interrupted!");
		}
	}
}
