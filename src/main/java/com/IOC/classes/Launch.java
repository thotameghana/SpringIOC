package com.IOC.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.IOC.interfaces.Customer;

public class Launch {
	public static void main(String[] args) {
		
//		((GoldCustomer)(gc)).setName("Virat");
//		((GoldCustomer)(gc)).setType("Gold customer");
//		
//		((PlatinumCustomer) pc).setName("Kshithij");
//		((PlatinumCustomer) pc).setType("Platinum Customer");
//		
//		System.out.println(gc.getCustomerType());
//		System.out.println(pc.getCustomerType());
		
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer gc=(GoldCustomer)cpx.getBean("gc");
		Customer pc=(PlatinumCustomer)cpx.getBean("pc");
		
		System.out.println(gc.getCustomerType());
		System.out.println(pc.getCustomerType());
		
	}
}
