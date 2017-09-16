package com.TeamName.GameTitle;

import java.awt.GraphicsEnvironment;

public class Launcher {
	
	private static final float SCALE = 0.9F;

	public static void main(String[] args){
		Game game = new Game("Stargame",
				 Math.round(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width * SCALE) ,
				 Math.round(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height * SCALE));
		
		game.start();
	}
	
}