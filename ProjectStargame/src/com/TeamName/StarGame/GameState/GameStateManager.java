package com.TeamName.StarGame.GameState;

public class GameStateManager {

	private static GameState currentState = null;
	
	public static void setGameState(GameState state) {
		currentState = state;
	}
	
	public static GameState getGameState() {
		return currentState;
	}
	
}
