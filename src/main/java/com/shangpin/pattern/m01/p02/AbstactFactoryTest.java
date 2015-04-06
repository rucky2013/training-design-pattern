package com.shangpin.pattern.m01.p02;

public class AbstactFactoryTest {
	public static void main(String[] args) {
		Provider provider = new MailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
