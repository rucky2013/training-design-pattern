package com.shangpin.pattern.m03.p01;

/**
 * 策略模式<br>
 * <pre>
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，
 * 新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 *</pre>
 * @author percy
 *
 */
public class StrategyTest {
	public static void main(String[] args) {
		String exp = "2+8";
		Calculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
