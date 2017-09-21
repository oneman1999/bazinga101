package com.TeamName.StarGame.GameState;

import java.awt.Graphics;

import com.TeamName.StarGame.Game;

public abstract class GameState {

	protected Game game;
	
	public GameState(Game game) {
		this.game = game;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
