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
			System.out.println("Name is valid");
			System.out.println("Name: " + this.name);
			state++;
		}
	}



	public void set_age(int num) throws Exception
	{
		if(num < 18) {
			state = 1;
			throw new Exception("You are too young! Try again!");
		}
		else {
			this.age = num;
			System.out.println("Age is valid");
			System.out.println("Age: " + this.age);
			state++;
		}
	}

	public void set_race(String race) throws Exception{
		for(int i = 0; i < races.length; i++)
		{
			if(races[i].equals(race)) {
				this.race = races[i];
				System.out.println("Race is valid");
				System.out.println("Race: " + races[i]);
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again.");
	}
	public int getState()
	{
		return state;
	}

}