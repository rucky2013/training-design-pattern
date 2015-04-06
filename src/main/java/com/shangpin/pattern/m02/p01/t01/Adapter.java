package com.shangpin.pattern.m02.p01.t01;

/**
 * 这样Targetable接口的实现类就具有了Source类的功能。
 * 
 * @author percy
 *
 */
public class Adapter extends Source implements Targetable{

	public void method2() {
		System.out.println("this is the targetable method!");  		
	}

}
