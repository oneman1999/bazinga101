package com.TeamName.StarGame;

import java.awt.GraphicsEnvironment;

public class Launcher {
	
	
	public static void main(String[] args){
		Game game = new Game("Stargame",
				 Math.round(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width * Constants.WindowScale) ,
				 Math.round(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height * Constants.WindowScale));
		
		game.start();
	}
	
}