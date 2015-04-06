package com.shangpin.pattern.m01.p01;

/**
 * 创建工厂
 * 
 * @author percy
 *
 */
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("Please input true eype!");
			return null;
		}
	}

}
