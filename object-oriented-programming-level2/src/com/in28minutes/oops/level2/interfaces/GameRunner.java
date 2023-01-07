package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole[] games = {new MarioGame(), new ChessGame()};
		
		for(GamingConsole game:games) {
		//GamingConsole game = new ChessGame();
		//GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		}
	}

}
