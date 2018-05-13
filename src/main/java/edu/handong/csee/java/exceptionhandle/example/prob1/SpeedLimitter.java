package edu.handong.csee.java.exceptionhandle.example.prob1;

public class SpeedLimitter {//a Class
	private int speed = 0;//integer variable
	private int limit = 0;//integer variable

	public SpeedLimitter(int limit, int speed)//a method
	{
		this.limit = limit;//puts parameter in "this.limit"
		this.speed = speed;//puts parameter in "this.speed"
	}

	public void warnSpeedLimit()//a method
	{
		try { //here is first. 
			if(this.speed > this.limit)//a condition
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");//puts this in Exception
			}
			System.out.println("You are a law abiding citizen!");//print this line.
		} catch(Exception e) {// catches e from try block
			System.out.println(e.getMessage());//print Exception.
			System.out.println("You are being fined.");//print this line.
		}
		System.out.println("Your current speed: " +this.speed);//print this line.

	}
}

