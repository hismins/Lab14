package edu.handong.csee.java.exceptionhandle.example.prob3;

public class Powercalc {//a class

	public long power(int n, int p) throws Exception//a method. throws result to Exception
	{
		long result = 0;//variable declaration

		result = (long)Math.pow(n, p);//puts result of equation to long type variable "result"
		if(n < 0 || p < 0)//condition. if n<0 or p<0,
		{
			throw new Exception("n or p should not be negative.");//prints this exception message.
		}
		if(n == 0 && p == 0)//condition. if "n" and "p" are both 0,
		{
			throw new Exception("n and p should not be zero.");//print this exeption message.
		}
		return result;//returns "result"
	}
}

