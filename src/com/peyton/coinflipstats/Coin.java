package com.peyton.coinflipstats;

import java.util.Random;

public class Coin {
	//Fields
	Random random = new Random();
	//Constructor
	public Coin(){}
	
	//Methods
	public String flip(){
		String flipResult;
		int randomint = random.nextInt(2);
		if(randomint == 0){
			flipResult = "Tails";
		}
		else{
			flipResult = "Heads";
		}
		return flipResult;
	}
}
