package com.deloitte;

import org.springframework.beans.factory.annotation.Autowired;

public class JioSim implements Sim {
	private float callCharge;
	private float speed;
	@Autowired
private MessageSender ms;
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("From Jio");
	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("From Jio");
	}

	public MessageSender getMs() {
		return ms;
	}

	public void setMs(MessageSender ms) {
		this.ms = ms;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	@Override
	public void browse() {
		System.out.println("Browsing with Jio...Speed: "+speed+"mbps");
		
	}

	@Override
	public void call() {
		System.out.println("Calling with Jio...Callcharges: "+callCharge+"per min ");
		
		
	}

}
