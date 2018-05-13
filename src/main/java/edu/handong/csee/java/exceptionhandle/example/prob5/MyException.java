package edu.handong.csee.java.exceptionhandle.example.prob5;

public class MyException extends Exception{//this class is an expansion of Exception.

	private String message = null;//variable "message" has null value.

	public MyException() {//constructor of class
		super();//calls parent's elements.
	}

	public MyException(String message) {//a method.
		super(message);//calls parent's "message"
		this.message = message;//puts value of "message" to this.message.
	}

	public MyException(Throwable cause) {//a method.
		super(cause);//class parent's "cause"
	}

	public String toString() {//toString method.
		return message;//returns "message"
	}
}


