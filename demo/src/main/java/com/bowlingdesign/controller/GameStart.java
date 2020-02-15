package com.bowlingdesign.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameStart {
	
	@RequestMapping(value = "/start",method = RequestMethod.POST)
	public HttpStatus getGameId(@RequestParam int noOfBowlers,List<String>nameOfBowlers)
	{
		
		
		
	}
}
