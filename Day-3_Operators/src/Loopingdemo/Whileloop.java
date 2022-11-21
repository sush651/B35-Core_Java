package Loopingdemo;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();//9
		int i=1;
		/* if u dono the no of iteration then use whileloop*/
		while(i<=num)
		{
			System.out.println("Welcome to java" +i);
			i++;
		}
	}

}
