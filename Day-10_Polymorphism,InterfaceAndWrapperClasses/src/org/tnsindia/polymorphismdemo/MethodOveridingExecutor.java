package org.tnsindia.polymorphismdemo;

public class MethodOveridingExecutor {

	public static void main(String[] args) {
		MethodOveridingChild m=new MethodOveridingChild();
		MethodOveridingExample m1=new MethodOveridingChild();
		System.out.println(m.mul(12, 10));//child class method
		System.out.println(m1.mul(10, 20));//parent class method

	}

}