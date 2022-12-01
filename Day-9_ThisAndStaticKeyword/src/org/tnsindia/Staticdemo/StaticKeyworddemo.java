package org.tnsindia.Staticdemo;
//Demo on static variable
public class StaticKeyworddemo {
	
	//static variable
	static int a;
	float b;
	
	//static method
	public static  void accept()
	{
		System.out.println("Welcome to Java Full Stack Program");
	}
	//static block is used to initialize static data members
	static
	{
		a=45;
		//we can't use non static variable inside static block
		//b=89;
	}

}
