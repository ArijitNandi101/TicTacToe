package ArijitNandi.TicTacToe.Managers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	public boolean up, 
				down,
				right,
				left;
	public KeyManager(){
		this.up = false;
		this.down = false;
		this.right = false;
		this.left = false;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP)
			up = true;
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
			down = true;
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			right = true;
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			left = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP)
			up = false;
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
			down = false;
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			right = false;
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			left = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
