package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
	private final String name;
	private final int[] enteredNums = new int[10];
	private int attempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEnteredNum(int num) {
		attempts++;
		enteredNums[attempts - 1] = num;
	}

	public int[] getEnteredNums() {
		return Arrays.copyOf(enteredNums, attempts);
	}

	public int getLastEnteredNum() {
		return enteredNums[attempts - 1];
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public int getAttempts() {
		return attempts;
	}
}