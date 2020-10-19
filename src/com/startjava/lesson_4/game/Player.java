package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
	private final static int ENTERED_NUMS_LENGTH = 10;	// ENTERED_NUMS_LENGTH == GuessNumber.MAX_COUNTS
	private final String name;
	private final int[] enteredNums = new int[ENTERED_NUMS_LENGTH];
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setEnteredNums(int number, int enteredNumIndex) {
		enteredNums[enteredNumIndex] = number;
	}

	public int[] getEnteredNums(int totalCounts) {
		return Arrays.copyOf(enteredNums, totalCounts);
	}
}