package edu.handong.csee.java.exceptionhandle.example.prob5;

import java.util.Scanner;

public class Main {//main class
	public static void main(String[] args){//main method
		try{//try block
			Scanner keyboard = new Scanner(System.in);//Scanner instance
			String str = keyboard.nextLine();//puts input string to "str".
			Main.myTest(str);//runs method in Main.
		} catch(MyException mae){//an exception case
			System.out.println("Inside catch block: " + mae);//print this line with "str".
		}
	}

	static void myTest(String str) throws MyException{//thorws result to exception.
		if(str.equals("null")){//condition. if "str" had been input nothig, 
			throw new MyException("String val is null");//prints this exception message.
		}
		else//if not,
			System.out.println("String val is:" + str);//prints this line.
	}
}

