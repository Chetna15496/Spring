//package com.deloitte;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class JioSim implements Sim {
//	private float callCharge;
//	private float speed;
//	@Autowired
//private MessageSender ms;
//	
//	public void sendSms() {
//		ms.sendSms();
//		System.out.println("From Jio");
//	}
//	public void sendMms() {
//		ms.sendMms();
//		System.out.println("From Jio");
//	}
//
//	public MessageSender getMs() {
//		return ms;
//	}
//
//	public void setMs(MessageSender ms) {
//		this.ms = ms;
//	}
//
//	public float getCallCharge() {
//		return callCharge;
//	}
//
//	public void setCallCharge(float callCharge) {
//		this.callCharge = callCharge;
//	}
//
//	public float getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(float speed) {
//		this.speed = speed;
//	}
//	@Override
//	public void browse() {
//		System.out.println("Browsing with Jio...Speed: "+speed+"mbps");
//		
//	}
//
//	@Override
//	public void call() {
//		System.out.println("Calling with Jio...Callcharges: "+callCharge+"per min ");
//		
//		
//	}
//
//}

///////////////////////////////////////////////////////////////////
package com.deloitte;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("jio")

public class JioSim implements Sim {



	@Value("${jio.callCharge}")

	private float callCharge;

	@Value("${jio.speed}")

	private float speed;



	@Autowired

	@Qualifier("ms")

	private MessageSender ms;

	@Value("#{${jio.supportedNets}}")
	//List<String> supportedNets;
	 Map<String,Integer>supportedNets;

	public void sendSms() {

		ms.sendSms();

		System.out.println("From Jio");

	}

	public void sendMms() {

		ms.sendMms();

		System.out.println("From Jio");}

	

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

		System.out.println("Browing with Jio...Speed "+speed+" mb/s");

		//System.out.println("The networks supported are: "+supportedNets);
		supportedNets.forEach((n,y)->System.out.println(n+"-"+y));
	}

	@Override

	public void call() {

		System.out.println("Calling with Jio...Charges "+callCharge+" /min");

		

	}

}
