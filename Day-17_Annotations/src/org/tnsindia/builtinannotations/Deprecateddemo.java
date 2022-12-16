package org.tnsindia.builtinannotations;


import java.util.Scanner;

public class Deprecateddemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//A program element annotated @Deprecated is one that programmersare discouraged from using.
		@Deprecated
		int x=s.nextInt();
		System.out.println(x);

	}

}
