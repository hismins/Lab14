package edu.handong.csee.java.exceptionhandle.example.prob6;

import java.util.Scanner;

public class Main {//main class
	public static void main(String[] args)//main method
	{
		//declarations.
		String name, race;//"name" and "race"
		int age = 0;//"age" has 0 value.
		boolean repeat = true;//"repeat" has true value.
		
		CustomID obj = new CustomID();//class instance
		Scanner keyboard = new Scanner(System.in);//Scanner instance
		while(repeat)//repeats as long as "repeat" is true.
		{
			try {//try block
				if(obj.getState() == 0) {//condition.
					System.out.print("Enter your name: ");//prints this line.
					name = keyboard.nextLine();//puts input string to "name".
					obj.set_name(name);//set "name" in obj with "name".
				}
				else if(obj.getState() == 1) {//another condition.
					System.out.print("Enter your age: ");//prints this line.
					age = keyboard.nextInt();//puts input integer to "age".
					keyboard.nextLine();//inputs string.
					obj.set_age(age);//set "age" in obj with "age".
				}
				else if(obj.getState() == 2) {//another condition.
					System.out.print("Enter your race: ");//prints this line.
					race = keyboard.nextLine();//puts input string to "race"
					obj.set_race(race);//set "race" in obj with "age".
				}
			}
			catch(Exception e){//an exception case.
				System.out.println(e.getMessage());//prints exception message.
				continue;//keeps continue.
			}
		}
	}
}

