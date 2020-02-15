/**
 * 
 */
package com.bowling.entity;

public class Frame {

	Long id;
	
	Long gameId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public int getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(int frameNo) {
		this.frameNo = frameNo;
	}

	public int getRollOne() {
		return rollOne;
	}

	public void setRollOne(int rollOne) {
		this.rollOne = rollOne;
	}

	public int getRollTwo() {
		return rollTwo;
	}

	public void setRollTwo(int rollTwo) {
		this.rollTwo = rollTwo;
	}

	public FrameType getFrameType() {
		return frameType;
	}

	public void setFrameType(FrameType frameType) {
		this.frameType = frameType;
	}

	int frameNo;
	
	int rollOne;
	
	int rollTwo;
	
	FrameType frameType;
	
	public Frame(Long id, int rollOne, int rollTwo, FrameType frameType, int frameNumber, Long gameId) {
        this.id = id;
        this.rollOne = rollOne;
        this.rollTwo = rollTwo;
        this.frameType = frameType;
        this.frameNo = frameNumber;
        this.gameId = gameId;
    }
}
