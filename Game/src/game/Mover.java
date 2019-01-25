package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Mover {

	public static void main(String[] args) {
		mover(3, 1, 1,100);

	}

	public static void mover(double distance, int x, int y, int z) {
		int death = z;
		int event = 5;
		while (distance > 0) {
			death--;
			event--;
			Scanner s = new Scanner(System.in);
			System.out.println("Which direction will you move in? Input:");
			String direction = s.nextLine();
			if (direction.equals("N") || direction.equals("n")) {
				y++;
			} else if (direction.equals("S") || direction.equals("s")) {
				y--;
			} else if (direction.equals("W") || direction.equals("w")) {
				x--;
			} else if (direction.equals("E") || direction.equals("e")) {
				x++;
			} else {
				System.out.println(
						"You have attempted to move in a direction that doesn't exist. The swamp diapproves. Your body explodes.");
				break;
			}
			IDC.inexplicableDeathCounter(death);
			int a =	EventGenerator.eventGen(event);
			if(death==0) {
				break;
			}
			if (a==1) {
				death+=3;
				event+=5;
			}else if (a==2) {
				death-=3;
				event+=5;
			}else if(a==3) {
				y+= ThreadLocalRandom.current().nextInt(-2, 2);
				x+= ThreadLocalRandom.current().nextInt(-2, 2);
				event+=5;
			}
			distance = DistanceCalculator.distance(x, y);
			
		}
		if (distance == 0) {
			System.out.println(
					"You have found your way out of the Infinite Grey Swamp. Now take vengeance on whoever left you here!");
		} else {
			System.out.println(
					"Technically you are not in the swamp anymore, as you're dead. You Win?");
		}
	}

}
