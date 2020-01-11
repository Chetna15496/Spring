//package com.deloitte;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class AirtelSim implements Sim{
//	private float callCharge;
//	private float speed;
//	@Autowired
//	private MessageSender ms;
//	
//	public void sendSms() {
//		ms.sendSms();
//		System.out.println("From Airtel");
//	}
//	public void sendMms() {
//		ms.sendMms();
//		System.out.println("From Airtel");
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
//
//	@Override
//	public void browse() {
//		System.out.println("Browsing with Airtel...Speed: "+speed+"mbps");;
//		
//	}
//
//	@Override
//	public void call() {
//		System.out.println("Calling with Airtel...Charges: "+callCharge+"per min");
//
//		
//	}
//
//}


/////////////////////////////////////////////////////////////////////////////////////////////


   

package com.deloitte;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;



@Component("airtel")

public class AirtelSim implements Sim {



	@Value("${airtel.callCharge}")

	private float callCharge;

	@Value("${airtel.speed}")

	private float speed;

	@Autowired

	@Qualifier("alternateMS")

	private MessageSender ms;
	
	@Value("#{${airtel.supportedNets}}")
	
	//List<String> supportedNets;
	
    Map<String,Integer>supportedNets;
	
	public void sendSms() {

		ms.sendSms();

		System.out.println("From Airtel");

	}

	public void sendMms() {

		ms.sendMms();

		System.out.println("From Airtel");

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

		System.out.println("Browsing with Airtel...Speed "+speed+" mb/s");

		
	//	System.out.println("The networks supported are: "+supportedNets);
	  supportedNets.forEach((n,y)->System.out.println(n+"-"+y));
	}


	

	@Override

	public void call() {

		System.out.println("Calling with Airtel...Charges "+callCharge+" /min");

		

	}

}

