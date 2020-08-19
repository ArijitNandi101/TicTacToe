package ArijitNandi.TicTacToe.Managers;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

public class MouseManager implements MouseInputListener {
	public int xPos, yPos;
	public boolean clicked;
	public MouseManager() {
		xPos = -1;
		yPos = -1;
		clicked = false;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		xPos = e.getX();
		yPos = e.getY();
		clicked = true;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		xPos = e.getX();
		yPos = e.getY();
		clicked = true;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
