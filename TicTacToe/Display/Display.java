package ArijitNandi.TicTacToe.Display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Display {
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		frame = new JFrame(title);
		frame.setSize(width,  height);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setFocusable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(true);
		
		frame.add(canvas);
		frame.pack();
	}
	//GETTERS
	public Canvas getCanvas() {
		return canvas;
	}
}
