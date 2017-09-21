package com.TeamName.StarGame.GameState;

import java.awt.Graphics;

import com.TeamName.StarGame.Game;
import com.TeamName.StarGame.entity.creature.Player;

public class PlayingGameState extends GameState {

	Player player;
	
	public PlayingGameState(Game game) {
		super(game);
		player = new Player(game ,100 , 100 , 64 , 64 , 100 , 3);
	}

	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

}
