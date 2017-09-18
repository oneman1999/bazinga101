package com.TeamName.GameTitle;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.TeamName.GameTitle.display.Display;
import com.TeamName.GameTitle.display.graphics.Assets;

public class Game implements Runnable {

	private Display display;
	public int ScreenWidth, ScreenHeight;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	public Game(String title, int width, int height){
		this.ScreenHeight = width;
		this.ScreenHeight = height;
		this.title = title;
	}
	
	private void init(){
		display = new Display(title, ScreenHeight, ScreenHeight);
		Assets.loadSpriteSheets();
	}
	
	/**
	 * GAME UPDATE METHOD
	 */
	private void tick(){
		
	}
	
	/**
	 * MAIN RENDER METHOD
	 */
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear
		g.clearRect(0, 0, ScreenHeight, ScreenHeight);
		//Draw Here!
		{
		
			
			
			
		}	
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	
	public void run(){
		
		init();
		
		//Game Loop
		while(running){
			tick();
			render();
		}
		
		stop();
		
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
