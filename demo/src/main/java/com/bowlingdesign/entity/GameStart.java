package com.bowling.entity;

import java.util.List;

public class GameStart {

	/*ID to start the game*/
	Long Id;
	
	/*NoOfPlayer required to start the game*/
	Long NoOfPlayer;
	
	/*Name of Players*/
	List<String>NameOfPlayers;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getNoOfPlayer() {
		return NoOfPlayer;
	}

	public void setNoOfPlayer(Long noOfPlayer) {
		NoOfPlayer = noOfPlayer;
	}

	public List<String> getNameOfPlayers() {
		return NameOfPlayers;
	}

	public void setNameOfPlayers(List<String> nameOfPlayers) {
		NameOfPlayers = nameOfPlayers;
	}
	
}
