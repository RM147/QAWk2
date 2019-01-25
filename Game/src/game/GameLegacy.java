package game;

//A record of my nonOOP game in case the OOP doesn't work, just to prove I can do it

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameLegacy {

	public static void main(String[] args) {
		System.out.println("You find yourself in the Infinite Grey Swamp. It is, surprisingly, an infinite grey swamp.");
	    System.out.println("You do not remember how you got there. Presumably one of your many enemies left you here.");
	    System.out.println("Maybe it was one of your few friends, playing a prank?");
	    System.out.println("The only way out is the Exit Stone. It will teleport you to somewhere nicer.");
	    System.out.println("Maybe an infinite swamp with a more exciting colour scheme? Regardless you don’t want to be here.");
	    System.out.println("Luckily your trusty compass lets you know where the Exit Stone is. It will only tell you direction though.");
	    System.out.println("Travel north (input “N”), north (input “S”), east (input “E”) or west (input “W”) to find the Stone.");
	    System.out.println("Good luck, traveller!");
		int xTreasure = ThreadLocalRandom.current().nextInt(0, 3);
		int yTreasure = ThreadLocalRandom.current().nextInt(0, 3);
		int xPlayer = 0;
		int yPlayer = 0;
		double distance = Math.sqrt((Math.abs(xPlayer - xTreasure)) * (Math.abs(xPlayer - xTreasure))
				+ (Math.abs(yPlayer - yTreasure)) * (Math.abs(yPlayer - yTreasure)));
		while (distance > 0) {
			Scanner s = new Scanner(System.in);
			System.out.println("Which direction will you move in? Input:");
			String direction = s.nextLine();
			if (direction.equals("N") || direction.equals("n")) {
				yPlayer+=1;
			}else if (direction.equals("S") || direction.equals("s")) {
				yPlayer-=1;
			}else if (direction.equals("W") || direction.equals("w")) {
				xPlayer-=1;
			}else if (direction.equals("E") || direction.equals("e")) {
				xPlayer+=1;
			}else if (direction.equals("B") || direction.equals("b")) {
				break;
			}else{
				System.out.println("Please enter a valid direction. You can't escape the swamp without moving.");
			}
			distance = Math.sqrt((Math.abs(xPlayer - xTreasure)) * (Math.abs(xPlayer - xTreasure))
					+ (Math.abs(yPlayer - yTreasure)) * (Math.abs(yPlayer - yTreasure)));
			System.out.println("You are " + distance + "m away from your treasure");
			System.out.println(xPlayer + "," + yPlayer);
			System.out.println(xTreasure + "," + yTreasure);	

		}

		System.out.println("You have found your way out of the Infinite Grey Swamp. Now take vengeance on whoever left you here!");

	}

}