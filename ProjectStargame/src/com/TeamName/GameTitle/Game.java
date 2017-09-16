package com.TeamName.GameTitle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.text.StyledEditorKit.FontSizeAction;

import com.TeamName.GameTitle.display.Display;

public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init(){
		display = new Display(title, width, height);
	}
	
	private void tick(){
		
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Draw Here!
		{
			
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, width, height);
			g.setColor(Color.GREEN);
			g.setFont(new Font("DialogInput" , 3 , 58));
			g.drawString("WELCOME FELLOW TIME TRAVELLERS", width/5 , height/3);
			
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
