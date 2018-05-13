package edu.handong.csee.java.exceptionhandle.example.prob3;

import java.util.Scanner;

public class Main {//main class

	public static final Powercalc my_calculator = new Powercalc();//instance of class
	public static final Scanner in = new Scanner(System.in);//instance of Scanner

	public static void main(String[] args) {//main method
		while (in.hasNextInt()) {//loop. as long as hasNextInt() has positive value,
			int n = in.nextInt();//puts input integer to "n"
			int p = in.nextInt();//puts input integer to "p"

			try {//try block
				System.out.println(my_calculator.power(n, p));//prints power of "n" and "p"
			} catch (Exception e) {//an exception case
				System.out.println(e);//prints exception message.
			}
		}
	}

}
