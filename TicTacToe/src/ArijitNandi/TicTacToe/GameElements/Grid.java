package ArijitNandi.TicTacToe.GameElements;

import java.awt.Graphics;
import ArijitNandi.TicTacToe.Managers.Handler;

public class Grid {
	private Cell[][] grid;
	private Handler handler;
	private int cellWidth, cellHeight;
	public Grid(Handler handler){
		this.handler = handler;
		this.cellWidth = handler.getGame().getWidth()/3;
		this.cellHeight = handler.getGame().getHeight()/3;
		grid = new Cell[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				grid[i][j] = new Cell(i*cellWidth,j*cellHeight,cellWidth,cellHeight);
	}
	public void update() {
		
	}
	public void render(Graphics g) {
		g.setColor(Cell.BORDER_COLOR);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				grid[i][j].render(g);
	}

}
