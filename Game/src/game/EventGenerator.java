package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {

	public static void main(String[] args) {
		System.out.println(eventGen(0));

	}

	public static int eventGen(int num) {
		Scanner s = new Scanner(System.in);
		if (num == 0) {
			int event = ThreadLocalRandom.current().nextInt(0, 3);
			if (event == 0) {
				System.out.println("You see a red-brick well. Finally, a splash of colour in this dreary place.");
				String a = s.nextLine();
				System.out.println("Heh, get it splash? It’s a water pun.");
				String b = s.nextLine();
				System.out.println("Drink? (Y/N)");
				String c = s.nextLine();
				if (c.equals("Y") || c.equals("y")) {
					System.out.println("You drink from the well. A feeling of relief.");
					String d = s.nextLine();
					System.out.println("Like eyes didn’t know were watching you are now looking elsewhere.");
					String e = s.nextLine();
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
					return 1;
				} else {
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
				}

			} else if (event == 1) {
				System.out.println("An ancient, gnarled tree comes into sight. Fruit are growing from it.");
				String a = s.nextLine();
				System.out.println("They don’t look fresh but food is food.");
				String b = s.nextLine();
				System.out.println("Eat? (Y/N)");
				String c = s.nextLine();
				if (c.equals("Y") || c.equals("y")) {
					System.out.println("You reach for the fruit but the tree screams.");
					String d = s.nextLine();
					System.out.println("You decide eating fruit from a screaming trees is a bad idea.");
					String e = s.nextLine();
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
					return 2;
				} else {
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
				}

			} else if (event == 2) {
				System.out.println("A hut. A sign says ring this bell if you’re a dick.");
				String a = s.nextLine();
				System.out.println("Are you a dick? (Y/N)");
				String b = s.nextLine();
				if (b.equals("Y") || b.equals("y")) {
					System.out.println("You disturbed a witch’s beauty sleep.");
					String d = s.nextLine();
					System.out.println("She teleports you somewhere else in the swamp.");
					String e = s.nextLine();
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
					return 3;
				} else {
					System.out.println("You continue looking for the Exit Stone.");
					String f = s.nextLine();
				}return 0;

			}
		}return 0;

	}

}
