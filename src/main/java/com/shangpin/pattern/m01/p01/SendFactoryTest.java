package com.shangpin.pattern.m01.p01;

public class SendFactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("mail");
		sender.send();
	}

}
