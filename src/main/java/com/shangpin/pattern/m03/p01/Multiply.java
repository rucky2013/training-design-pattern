package com.shangpin.pattern.m03.p01;

public class Multiply extends AbstractCalculator implements Calculator {

	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}

}
