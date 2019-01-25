package game;

import java.util.Scanner;

public class Storyteller {

	public static void main(String[] args) {
		storyteller();

	}
	public static void storyteller() {
		Scanner s = new Scanner(System.in);
		System.out.println("Press Enter for next line");
		System.out.println("You find yourself in the Infinite Grey Swamp. It is, surprisingly, an infinite grey swamp.");
		String a = s.nextLine();//brings up next line of text when enter is pressed so console not flooded with lots of prose.		
		System.out.println("You do not remember how you got there. Presumably one of your many enemies left you here.");
		String b = s.nextLine();
	    System.out.println("Maybe it was one of your few friends, playing a prank? Whoever it is, they will pay. Your clothes stink now.");
	    String c = s.nextLine();
	    System.out.println("The only way out is the Exit Stone. It will teleport you to somewhere nicer.");
	    String d = s.nextLine();
	    System.out.println("Maybe an infinite swamp with a more exciting colour scheme? Regardless you don’t want to be here.");
	    String e = s.nextLine();
	    System.out.println("Luckily your trusty compass lets you know where the Exit Stone is. It will only tell you direction though.");
	    String f = s.nextLine();
	    System.out.println("Travel north (input “N”), north (input “S”), east (input “E”) or west (input “W”) to find the Stone.");
	    String g = s.nextLine();
	    System.out.println("Good luck, traveller!");
	    String h = s.nextLine();
	}

}
