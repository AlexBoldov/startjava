package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
	private final String name;
	private final int[] enteredNums = new int[10];
	private int playerAttempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEnteredNum(int num) {
		enteredNums[playerAttempts - 1] = num;
	}

	public int[] getEnteredNums() {
		return Arrays.copyOf(enteredNums, playerAttempts);
	}

	public int getLastEnteredNum() {
		return enteredNums[playerAttempts - 1];
	}

	public void setPlayerAttempts(int playerAttempts) {
		this.playerAttempts = playerAttempts;
	}

	public int getPlayerAttempts() {
		return playerAttempts;
	}
}