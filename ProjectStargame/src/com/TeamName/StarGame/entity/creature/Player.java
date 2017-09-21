package com.TeamName.StarGame.entity.creature;

import java.awt.Graphics;

import com.TeamName.StarGame.Game;
import com.TeamName.StarGame.display.graphics.Assets;

public class Player extends Creature {

	
	
	public Player(Game game , float x, float y, int width , int height , int health , float speed) {
		super(game, x, y, width , height , health , speed);
		
	}

	@Override
	public void tick() {
		getKeyInput();
		move();
	}
	
	private void getKeyInput() {
		xMove = 0;
		yMove = 0;
		
		if(keyManager.up) yMove = -speed;
		if(keyManager.down) yMove = speed;
		if(keyManager.left) xMove = -speed;
		if(keyManager.right) xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y, width , height, null);
	}

}
