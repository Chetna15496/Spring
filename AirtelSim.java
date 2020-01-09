package com.deloitte;

import org.springframework.beans.factory.annotation.Autowired;

public class AirtelSim implements Sim{
	private float callCharge;
	private float speed;
	@Autowired
	private MessageSender ms;
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("From Airtel");
	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("From Airtel");
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
		System.out.println("Browsing with Airtel...Speed: "+speed+"mbps");;
		
	}

	@Override
	public void call() {
		System.out.println("Calling with Airtel...Charges: "+callCharge+"per min");

		
	}

}
