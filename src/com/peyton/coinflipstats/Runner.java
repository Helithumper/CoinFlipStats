package com.peyton.coinflipstats;

import java.util.Scanner;

public class Runner {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Coin Flip Statistics! Enter the number of coins you want to flip: ");
		int numCoins = 0;
		int numHeads = 0;
		int numTails = 0;
		try{
			numCoins = reader.nextInt();
		}
		catch(Exception e){
			System.out.println("That is not a number :P");
		}
		for(int i = numCoins; i > 0; i--){
			Coin coin = new Coin();
			String result = coin.flip();
			System.out.println(result);
			if(result.equals("Heads")){
				numHeads++;
			}
			else{
				numTails++;
			}
		}
		System.out.println("Coins Completed: " + numCoins + "\n\tHeads: " + numHeads + "\n\tTails: " + numTails);

	}

}
