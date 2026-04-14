package com.TeamHunter;
import java.util.Random;
import java.util.Scanner;
public class Roulette {
	public static void roulette() {
	int[] numberWheel = {6,3,1,9,4,2,3,3,1,4,7,4,2,5,8,5,6,1,6,10,7,4,7,8,8,5,9,9,2,6,10,20};//size 32
	
	int bet;
	
	Scanner userChoiceNum = new Scanner(System.in);
	Scanner userBet = new Scanner(System.in);
	Random rand = new Random();
	for(int number :numberWheel)
		System.out.print(number+",");
	System.out.println("");
	System.out.print("select a number: ");
	
	while(!userChoiceNum.hasNextInt()) {
		System.out.println("invalid input. Please use numbers only.");
		userChoiceNum.next();
	}
	int userNum = userChoiceNum.nextInt();
	
	System.out.print("Place your bet: ");
	
	while(!userBet.hasNextInt()) {
		System.out.println("invalid input. Please use numbers only.");
		userChoiceNum.next();
	}
	
	bet = userBet.nextInt();
	
	int randomIndex = rand.nextInt(numberWheel.length);
	int winningNumber = numberWheel[randomIndex];
	
	System.out.println("The wheel has landed on: "+ winningNumber);
	
	if (userNum == winningNumber) {
		System.out.println("You win");
		if(winningNumber == 20) {
			int winnings = bet * 2;
			System.out.println("prize: "+winnings);
		} else {
			double winnings = bet * 1.5;
			System.out.println("prize: "+winnings);
		}
	} else {
		System.out.println("you lose");
	}
	
	userChoiceNum.close();
	userBet.close();
	}
	public static void rules() {
		System.out.println("1. place a bet amount on a number");
		System.out.println("2. if your number lost lose what you bet");
		System.out.println("3. betting on numbers 1-10 will return 1.5x your bet,");
		System.out.println("betting on number 20 will return 2x your bet");
	}
	
}
	/*while(loop == 0){
		
		
		System.out.println(numberWheel);
		try {
			
			if
			
		}
		catch(Exception e) {
			System.out.println("An Error has occured: "+ e.getMessage());
		}
		finally {
			userChoiceNum.close();
		}
		int max = ;
		int min = 1;
		int randomInt = rand.nextInt((max - min)+1)+min;
		int i = randomInt -= 1;
		for(int number: numberWheel) {
			if(i == number) {
				return number;
				if (userNum == number) {
					
				}
		}
		}
		
		
		}
	return 0;
	}
}*/
