package com.TeamName.StarGame.display.graphics;

import java.awt.image.BufferedImage;

public class Assets {

	//Declaring the sprites
	public static BufferedImage sprite0;
	public static BufferedImage sprite1;
	
	//test code
	public static BufferedImage player;
	
	
	public static void loadImages() {
		loadSpriteSheets();
		player = ImageLoader.loadImage("/textures/test.png");
	}
	
	
	
	public static void loadSpriteSheets(){
		/**
		//First spritesheet
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("") , 4 , 4);
		
		//Initializing the images for the first spritesheet
		sprite0 = sheet.getSpriteWithCoords(1, 1);
		sprite1 = sheet.getSpriteWithCoords(2, 1);
		**/
	}
	
	
}
