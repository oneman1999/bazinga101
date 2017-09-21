package com.TeamName.StarGame.display.graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage sheet;
	
	private int width , height , imageWidth , imageHeight , spriteWidth , spriteHeight;
	
	
	public SpriteSheet(BufferedImage SpriteSheet , int SpritesPerLine , int SpritesPerColumn) {
		this.sheet = SpriteSheet;
		this.width = SpritesPerLine;
		this.height = SpritesPerColumn;
		this.imageWidth = sheet.getWidth();
		this.imageHeight = sheet.getHeight();
		this.spriteWidth = imageWidth / width;
		this.spriteHeight = imageHeight / height;
	}
	
	/**
	 * 
	 * @param Line the sprite is in
	 * @param Column the sprite is in
	 * @return The specified sprite as a BufferedImage
	 */
	public BufferedImage getSpriteWithCoords(int Line , int Column) {	
		return sheet.getSubimage(spriteWidth*(Line - 1) , spriteHeight*(Column - 1), spriteWidth , spriteHeight);
	}
	
	/**
	 * Crops a subimage directly from coordinates given
	 * @param x : the x coordinate of the upper left corner of the sprite (in pixels)
	 * @param y : the y coordinate of the upper left corner of the sprite (in pixels)
	 * @return the subimage croped from the coordinates given in pixels
	 */
	public BufferedImage getSpriteDirectly(int x , int y) {
		return sheet.getSubimage(x, y, spriteWidth, spriteHeight);
	}
	
	
	public BufferedImage getSpriteSheetAsBufferedImage() {
		return sheet;
	}
	
	
	/**
	 * 
	 * @return The number of Lines in the SpriteSheet
	 */
	public int getSheetWidth() {
		return width;
	}
	
	/**
	 * 
	 * @return The number of Columns in the SpriteSheet
	 */
	public int getSheetHeight() {
		return height;
	}
	
	/**
	 * 
	 * @return The width of the SpriteSheet in pixels
	 */
	public int getImageWidth() {
		return imageWidth;
	}
	
	/**
	 * 
	 * @return The height of the SpriteSheet in pixels
	 */
	public int getImageHeight() {
		return imageHeight;
	}
	
	/**
	 * 
	 * @return The width of a single sprite in pixels
	 */
	public int getSpriteWidth() {
		return spriteWidth;
	}
	
	/**
	 * 
	 * @return The height of a single sprite in pixels
	 */
	public int getSpriteHeight() {
		return spriteHeight;
	}
	
	
	
	
}
