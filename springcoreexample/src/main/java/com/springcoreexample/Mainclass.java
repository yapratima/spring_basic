package com.springcoreexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainclass {
	 
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Hellobean hellobean=(Hellobean) context.getBean("Hellobean");
		
		hellobean.getName();
		hellobean.getSSN();
		
	}

}
