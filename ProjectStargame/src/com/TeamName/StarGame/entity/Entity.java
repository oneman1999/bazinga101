package com.TeamName.StarGame.entity;

import java.awt.Graphics;

import com.TeamName.StarGame.Game;
import com.TeamName.StarGame.input.KeyManager;

public abstract class Entity {

	protected float x,y;
	protected Game game;
	protected KeyManager keyManager;
	protected int width, height;
	protected float speed;
	
	public Entity(Game game , float x , float y , int width , int height , float speed) {
		this.x = x;
		this.y = y;
		this.game = game;
		keyManager = game.getKeyManager();
		this.width = width;
		this.height = height;
		this.speed = speed;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public float getSpeed() {
		return speed;
	}
}
