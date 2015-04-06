package com.shangpin.pattern.m01.p02;

public class SmsFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
