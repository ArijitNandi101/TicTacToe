package ArijitNandi.TicTacToe;

import ArijitNandi.TicTacToe.Managers.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;

import ArijitNandi.TicTacToe.Display.*;

public class Game extends Thread {
	private Display display;
	private boolean running;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private String title;
	private int width, height;
	
	private KeyManager keyManager;
	private MouseManager mouseManager;
	private Handler handler;
	private GameStateManager gameStateManager;
	
	private static final int FPS = 60;
	
	Game(String title, int width, int height){
		this.title = title; 
		this.width = width;
		this.height = height;
		this.display = null;
		this.running = false;
		this.keyManager = null;
		this.mouseManager = null;
		this.handler = null;
		this.gameStateManager = null;
	}
	public void run() {
		initialize();
		
		//GAME LOOP
		long time_per_frame = 1_000_000_000/FPS,
				lastTime = System.nanoTime(), 
				now = 0,
				delta_time = 0;
		while(running) {
			running = Thread.currentThread().isAlive();
			if(delta_time>=time_per_frame) {
				delta_time = 0;
				update();
				render();
			}
			now = System.nanoTime();
			delta_time += (now - lastTime);
			lastTime = now;
		}
	}
	private void initialize() {
		display = new Display(title,width,height);
		running = true;
		
		keyManager = new KeyManager();
		display.getCanvas().addKeyListener(keyManager);
		
		mouseManager = new MouseManager();
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		
		handler = new Handler(this,keyManager,mouseManager);
		
		gameStateManager = new GameStateManager(handler);
	}
	private void update() {
		gameStateManager.update();
	}
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs==null) {
			display.getCanvas().createBufferStrategy(3);
		} else {
			g = bs.getDrawGraphics();
			g.clearRect(0, 0, width, height);
			//DRAWING CODE BEGINS
			gameStateManager.render(g);
			//DRAWING CODE ENDS
			bs.show();
			g.dispose();
		}
	}
	//GETTERS
	public Display getDisplay() {
		return display;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
