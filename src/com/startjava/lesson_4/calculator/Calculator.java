package com.startjava.lesson_4.calculator;

public class Calculator {
	private String srcMathExp;

	public void setMathExpression(String srcMathExp) {
		this.srcMathExp = srcMathExp;
	}

	public int calculate() {
		String[] splitMathExp = srcMathExp.split(" ", 3);
		switch (splitMathExp[1]) {
			case "+" :
				return Integer.parseInt(splitMathExp[0]) + Integer.parseInt(splitMathExp[2]);
			case "-" :
				return Integer.parseInt(splitMathExp[0]) - Integer.parseInt(splitMathExp[2]);
			case "*" :
				return Integer.parseInt(splitMathExp[0]) * Integer.parseInt(splitMathExp[2]);
			case "/" :
				return Integer.parseInt(splitMathExp[0]) / Integer.parseInt(splitMathExp[2]);
			case "^" :
				return (int) Math.pow(Integer.parseInt(splitMathExp[0]), Integer.parseInt(splitMathExp[2]));
			case "%" :
				return Integer.parseInt(splitMathExp[0]) % Integer.parseInt(splitMathExp[2]);
			default : {
				System.out.println("Ошибка! Недопустимый знак математической операции. Операция не выполнена.");
				return 0;
			}
		}
	}
}