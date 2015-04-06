package com.shangpin.pattern.m01.p02;

public class MailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
