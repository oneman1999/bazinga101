package com.TeamName.StarGame.entity.creature;

import com.TeamName.StarGame.Game;
import com.TeamName.StarGame.entity.Entity;


public abstract class Creature extends Entity {

	protected int maxHealth;
	protected int heatlh;
	
	protected float xMove , yMove;
	
	
	public Creature(Game game , float x, float y , int width , int height , int health , float speed) {
		super(game, x, y , width , height , speed);
		this.maxHealth = health;
		this.heatlh = health;
		xMove = 0;
		yMove = 0;
	}
	
	public void move() {
		x += xMove;
		y += yMove;
	}


	public int getMaxHealth() {
		return maxHealth;
	}


	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}


	public int getHeatlh() {
		return heatlh;
	}


	public void setHeatlh(int heatlh) {
		this.heatlh = heatlh;
	}

}
