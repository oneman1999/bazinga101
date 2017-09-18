package com.TeamName.StarGame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.TeamName.StarGame.display.Display;
import com.TeamName.StarGame.display.graphics.Assets;

public class Game implements Runnable {

	private Display display;
	public int ScreenWidth, ScreenHeight;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	public Game(String title, int width, int height){
		this.ScreenWidth = width;
		this.ScreenHeight = height;
		System.out.println(width + " , " + height);
		this.title = title;
	}
	
	private void init(){
		display = new Display(title, ScreenWidth , ScreenHeight);
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
		g.clearRect(0, 0, ScreenWidth, ScreenHeight);
		//Draw Here!
		{
		
			
			
			
		}	
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	
	public void run(){
		
		init();
		
		
		int fps = Constants.fps;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long timer = 0;
		long ticks = 0;
		long lastTime = System.nanoTime();
		
		//GAME LOOP
		while(running){
			now = System.nanoTime();
			delta += (now-lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000) {
				System.out.println("TPS: " + ticks);
				ticks = 0;
				timer = 0;
			}
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
