package game;

import java.util.Scanner;

public class IDC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void inexplicableDeathCounter(int num) {
		Scanner s = new Scanner(System.in);
		if (num == 3) {
			System.out.println("You feel like you're being watched");
			String a = s.nextLine();
		}else if (num==0) {
			System.out.println("You thought you were safe. The swamp is so flat you can see anything coming.");
			String a = s.nextLine();
			System.out.println("You were wrong.");
			String b = s.nextLine();
			System.out.println("Something attacks you. Your blood is used to feed the swamp. You die.");
			String c = s.nextLine();
			System.out.println("Feel hard done by? Remember, swamps are cruel.");
			String d = s.nextLine();
			
		}
	}

}
