package soo.kevin.TST.percentDice;

import java.util.Random;
import java.util.Scanner;

public class PercentDice {
	private Scanner input;
	private Random random;
	private int valueDouble;
	private int valueSingle;
	private static int counter = 1;
	
	//PercentDice die = new PercentDice();
	
	public PercentDice() {
		input = new Scanner(System.in);
		random = new Random();
	}
	
	public int random10s() {
		int value = 0;
		while(value != 10 &&
				value != 20&&
				value != 30&&
				value != 40&&
				value != 50&&
				value != 60&&
				value != 70&&
				value != 80&&
				value != 90&&
				value != 100) {
		valueDouble = random.nextInt(100) + 1;
		value = valueDouble;
		}
		if(value == 100) {
			value = 00;
		}
		return value;
	}
	
	public int random1s() {
		valueSingle = random.nextInt(10) + 1;
		if(valueSingle == 10) {
			valueSingle = 00;
		}
		return valueSingle;
	}
	
	public void diceRoll() {
		boolean result = true;
		System.out.println("Roll for percent?");		
		while(result) {
			String answer = input.next();
			if(answer.equalsIgnoreCase("yes")) {
				int rollOne = random10s();
				int rollTwo = random1s();
				System.out.println("Round: " + counter);
				counter++;
				System.out.println("First roll: " + rollOne);
				System.out.println("Second roll: " + rollTwo);
				int outCome = rollOne + rollTwo;
				if(rollOne == 0 && rollTwo == 0) {
					outCome = 100;
				}				
				System.out.println("Result: " + outCome + "%");		
				System.out.println();
				if(outCome == 100) {
					System.out.println("Go buy a lottery ticket!");
				}else if(outCome >= 90) {
					System.out.println("Great roll!");
				}else if(outCome <= 10) {
					System.out.println("GG");
				}else if(outCome == 69) {
					System.out.println("Heh.");
				}				
				System.out.println("Roll again?");
				System.out.println();
			}else if(answer.equalsIgnoreCase("no")) {
				result = false;
				System.out.println("Ending Rolls");
			}else {
				System.out.println("Invalid response.");
				System.out.println();
			}
			
		}
	}
}
