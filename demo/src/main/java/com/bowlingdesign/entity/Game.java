package com.bowling.entity;

import java.util.List;

public class Game {

	Long id;
	
	Long bowlerId;
	
	List<Frame> frames;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBowlerId() {
		return bowlerId;
	}

	public void setBowlerId(Long bowlerId) {
		this.bowlerId = bowlerId;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
}
