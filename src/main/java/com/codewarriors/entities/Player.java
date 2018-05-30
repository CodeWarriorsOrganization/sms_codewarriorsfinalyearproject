package com.codewarriors.entities;


public class Player {
  
	private String playerName;
	private String a = "helloooo";
	
public Player() {
		
	}


	public Player(String playerName) {
		
		this.playerName = playerName;
	}

	
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
