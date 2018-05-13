package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary {//a class
	private static int [] arr = new int[5];//5 arrays
	private static int cnt = 0;//static variable declaration.
	public void receive(int num) throws ArrayIndexOutOfBoundsException//input is integer and will throw to Exception.
	{
		int i = cnt;//puts value of static integer variable to local integer variable.
		arr[i] = num;//puts input "num" to i-th array of 5 arrays. 
		cnt++;//plus one to "cnt"
		System.out.printf("arr[%d] <- %d\n", i, num);//prints this line.
	}

}
