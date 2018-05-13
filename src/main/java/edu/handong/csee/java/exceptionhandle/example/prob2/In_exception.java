package edu.handong.csee.java.exceptionhandle.example.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {//a class

	private int x = 0, y = 0;//private integer variables

	public In_exception()//constructor
	{}
	public void error_det() {//a method

		try {//before exception, runs this.
			Scanner keyboard = new Scanner(System.in);//Scanner instance
			System.out.print("x: ");//prints this line.
			x = keyboard.nextInt();//puts input integer to "x"
			System.out.print("y: ");//prints this line.
			y = keyboard.nextInt();//puts input integer to "y"
			System.out.println(this.x/this.y);//prints this line.
		} catch(ArithmeticException e) {//an exception case
			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
			//prints exception message.
		} catch(InputMismatchException e) {//an exception case
			System.out.println("java.util.InputMismatchException");
			//prints exception message.
		} catch(Exception e) {//an exception case
			System.out.println("Some other exception has occurred: " + e.getMessage());
			//prints exception message.
		}

	}
}
