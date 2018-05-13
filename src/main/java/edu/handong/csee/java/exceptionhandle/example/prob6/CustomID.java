package edu.handong.csee.java.exceptionhandle.example.prob6;

public class CustomID extends Exception {//this class is expansion of Exception.
	
	//declarations.
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};//puts strings to String arrays. 
	private String name = "";//"name" has null value.
	private int age = 0;//"age" has 0 value.
	private String race = "";//"race" has null value.
	private int state = 0;//"state" has 0 value.

	public void set_name(String str) throws Exception //throws result to Exception.
	{
		if(str.length() < 5) {//condition.
			state = 0;//puts 0 value to "state".
			throw new Exception("Your name is short! Try again!");//Exception message.
		}

		else {//if not,
			this.name = str;//putting value.
			System.out.println("Name is valid");//prints this line.
			System.out.println("Name: " + this.name);//prints this line.
			state++;//plus one to "state"
		}
	}



	public void set_age(int num) throws Exception//throws result to Exception.
	{
		if(num < 18) {//condition.
			state = 1;//puts 1 to "state"
			throw new Exception("You are too young! Try again!");//prints this exception message.
		}
		else {//if not,
			this.age = num;//puts value of "num" to this variable "age"
			System.out.println("Age is valid");//prints this line.
			System.out.println("Age: " + this.age);//prints this line.
			state++;//plus one to "state".
		}
	}

	public void set_race(String race) throws Exception{//throws result to Exceptino.
		for(int i = 0; i < races.length; i++)//loop.
		{
			if(races[i].equals(race)) {//condition.
				this.race = races[i];//puts value of i-th "reces" array to this variable "race"
				System.out.println("Race is valid");//prints this line.
				System.out.println("Race: " + races[i]);//prints this line.
				state = 0;//set "state" to 0.
				return;//returns.
			}
		}
		state = 2;//set "state" to 2
		throw new Exception("Human! Try again.");//prints this exception message.
	}
	public int getState()//a constructor
	{
		return state;//returns "state"
	}

}