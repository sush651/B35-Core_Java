package org.tnsindia.com;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
				Scanner s=new Scanner(System.in);
				
				System.out.println("Enter the number: ");
				int x=s.nextInt();
				
				System.out.println("Enter the number: ");
				float y=s.nextFloat();
				
				System.out.println("Enter the char: ");
				char c=s.next().charAt(0);//"Sushmitha"//s
				//char c=s.next().charAt(1);//h

				
				
				System.out.println("The output is: ");
				System.out.println("The integer is: "+x);
				System.out.println("The decimal is: "+y);
				System.out.println("The character is: "+c);
				s.close();

	}

}