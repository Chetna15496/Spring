package com.deloitte;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.deloitte")//Replaces Bean for MessageSender
public class AppConfig {//replacement for spring.xml

//	@Bean("ms")//<bean id="ms"/>Bean for msgsender
//	public MessageSender getMsBean() {
//		MessageSender ms=new MessageSender();
//		ms.setMmsCharge(5.2f);
//		ms.setSmsCharge(2.5f);
//		return ms;}
	
	@Bean("airtel")
	public AirtelSim getAirtelSimBean() {
		AirtelSim sim= new AirtelSim();
		sim.setCallCharge(1.5f);
		sim.setSpeed(10f);
		//sim.setMs(getMsBean());//Auto wiring
		return sim;
	}
	@Bean("jio")
	public JioSim getJioSimBean() {
		JioSim sim= new JioSim();
		sim.setCallCharge(.85f);
		sim.setSpeed(20f);
		//sim.setMs(getMsBean());//Auto wiring
		return sim;
	}
	
}
