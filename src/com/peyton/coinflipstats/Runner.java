package com.peyton.coinflipstats;

import java.util.Scanner;

public class Runner {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Print opening message
		System.out.println("Coin Flip Statistics! Enter the number of coins you want to flip: ");
		
		//Set some variables:
		int numCoins = 0; //Num of coins to be flipped
		int numHeads = 0; //Num of heads flipped
		int numTails = 0; //Num of tails flipped
		
		//The following is a try-catch statement. It is a fancy way of handling people who do not enter an integer.
		
		try{ //Try to do this
			numCoins = reader.nextInt();
		}
		catch(Exception e){ //If you see any exception whatsoever, do this.
			System.out.println("That is not a number :P");
		}
		
		for(int i = numCoins; i > 0; i--){
			Coin coin = new Coin(); //Make a coin
			String result = coin.flip(); //Flip it and save the result to the result varaible
			System.out.println(result); //Print the Result
			
			if(result.equals("Heads")){
				numHeads++;
			}
			else{
				numTails++;
			}
		}
		//Fancy printout using Escape Sequences.
		System.out.println("Coins Completed: " + numCoins + "\n\tHeads: " + numHeads + "\n\tTails: " + numTails);

	}

}
