package com.bowling.main;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bowlingdesign.logic.Bowling;

@RestController
@RequestMapping("/api/game")
public class GameStart {
	@Autowired
	Bowling bowling;
	
	@RequestMapping(value = "/start",method = RequestMethod.GET)
	  public String getAllUsers(@RequestParam int id,int noofplayer,List<String>names) {
		Random gameid = new Random();
		gameid.nextInt();
		if(noofplayer>1)
		{
			return "game started";
		}
		else
		{
			return "more players";
		}
	  }
	
	public int getScore(@RequestParam String rollsAsString)
	{
		return bowling.scoreOf(rollsAsString);
	}
}
