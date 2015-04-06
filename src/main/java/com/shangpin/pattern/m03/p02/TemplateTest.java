package com.shangpin.pattern.m03.p02;

/**
 * 验证模板方法<br>
 * 
 * <pre>
 * 
 * 我跟踪下这个小程序的执行过程：
 * 首先将exp和"\\+"做参数，
 * 调用AbstractCalculator类里的calculate(String,String)方法，
 * 在calculate(String,String)里调用同类的split()，
 * 之后再调用calculate(int ,int)方法，从这个方法进入到子类中，
 * 执行完return num1 + num2后，将值返回到AbstractCalculator类，
 * 赋给result，打印出来。正好验证了我们开头的思路。
 * </pre>
 * 
 * @author percy
 *
 */
public class TemplateTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
