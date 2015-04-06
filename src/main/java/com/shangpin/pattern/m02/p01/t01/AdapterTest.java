package com.shangpin.pattern.m02.p01.t01;

public class AdapterTest {
	public static void main(String[] args) {
        Targetable target = new Adapter();  
        target.method1();  
        target.method2(); 
	}
}
