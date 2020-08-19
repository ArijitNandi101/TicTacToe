package ArijitNandi.TicTacToe.GameElements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cell {
	
	private Rectangle cell;
	private boolean marked;
	
	private static final int BORDER = 2;
	public static final Color BORDER_COLOR = Color.BLACK;
	
	Cell(int x, int y, int width, int height){
		this.cell = new Rectangle(x,y,width,height);
		this.marked = false;
	}
	public void update() {
		
	}
	public void render(Graphics g) {
		g.drawRect(cell.x+BORDER,cell.y+BORDER,cell.width-2*BORDER,cell.height-2*BORDER);
	}
}
