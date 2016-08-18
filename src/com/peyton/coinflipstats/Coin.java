package com.peyton.coinflipstats;

import java.util.Random;

public class Coin {
	
	
	//Fields
	Random random = new Random();
	String facing = "";
	
	
	//Constructor
	public Coin(){}
	
	
	
	//Methods
	
	//Returns the result of a flip based on 50/50 odds
	public String flip(){
		String flipResult;
		int randomint = random.nextInt(2); //Returns a random number, either 0 or 1 because the paramer of random.nextInt is an integer in the range of [0,n)
		if(randomint == 0){
			flipResult = "Tails";
		}
		else{
			flipResult = "Heads";
		}
		//Shorthand for the previous conditional using ternary:
		//flipResult=(randomint==0)?"Tails":"Heads";
		
		facing = flipResult;
		return flipResult;
	}
}
