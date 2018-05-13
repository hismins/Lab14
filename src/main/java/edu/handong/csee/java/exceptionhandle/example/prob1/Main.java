package edu.handong.csee.java.exceptionhandle.example.prob1;
import java.util.Scanner;
import java.util.Random;

public class Main{//main class

	public static void main(String[] args) {//main method
		Scanner keyboard = new Scanner(System.in);//instance of scanner 
		Random rand = new Random();//instance of Random

		int limit = 0, speed = 0;//variable declaration

		System.out.print("Set the Speed limit, officer: ");//print this line.
		limit = keyboard.nextInt();//puts next input integer.
		speed = rand.nextInt(101);//puts random under 101.

		SpeedLimitter lim = new SpeedLimitter(limit, speed); //instance of Class

		lim.warnSpeedLimit();//runs "wanrSpeedLimit" in instance "lim"

		keyboard.close();//closes Scanner
	}


}
