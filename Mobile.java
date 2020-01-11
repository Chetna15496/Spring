//package com.deloitte;
//
//import java.util.Scanner;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Mobile {
//
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//IoC container context is created.it loads the classes from spring.xml
//		//Sim sim=new JioSim();//loose coupling
//		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
//		String simName;
//		System.out.println("Insert a sim : ");
//		simName=in.nextLine();
//		Sim sim=(Sim)context.getBean(simName);
//		sim.browse();
//		sim.call();
//		sim.sendMms();
//		sim.sendSms();
//		
//	}
//
//}

//////////////////////////////////////////////////////////////////
package com.deloitte;



import java.util.Scanner;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Component;


//sim is singleton by default
@SuppressWarnings("unused")
@Component("mobile")
//@Scope("prototype")//it creates a new object everytime.

public class Mobile {

	@Autowired

	@Qualifier("airtel")

	Sim sim;

	

	public void call() {

		sim.call();

	}

	public void browse() {

		sim.browse();

	}

	public void sendSms() {

		sim.sendSms();

	}

	public void sendMms() {

		sim.sendMms();

	}

	

	



}