package edu.handong.csee.java.exceptionhandle.example.prob4;

import java.util.Scanner;

public class Main {//main class
	public static void main(String[] args)//main method
	{
		Scanner keyboard = new Scanner(System.in);//Scanner instance
		int num = 0;//variable declaration
		Boundary arr = new Boundary();//class instance
		boolean repeat = true;//"repeat" has true value.
		while(repeat)//loop. as long as "repeat" has true value, 
		{
			try//try block
			{
				System.out.print("Enter an integer: ");//prints this line.
				num = keyboard.nextInt();//puts next input integer to "num".
				arr.receive(num);//runs receive with "num" in "arr".
			}
			catch(ArrayIndexOutOfBoundsException e)//an exception case.
			{
				System.out.println("Invalid array index access!");//prints this line.
				repeat = false;//changes value of "repeat" to false.
			}
		}
	}

}
