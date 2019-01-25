package game;

import java.util.concurrent.ThreadLocalRandom;

public class TreasureMaker {

	public static void main(String[] args) {
		System.out.println(treasureMakerX(3) + ", " +treasureMakerY(3));

	}
	public static int treasureMakerX(int min, int max) {
		int xTreasure = ThreadLocalRandom.current().nextInt(min, max+1);
		return xTreasure;
	}
	public static int treasureMakerX( int max) {
		int xTreasure = ThreadLocalRandom.current().nextInt(0, max+1);
		return xTreasure;
	}
	public static int treasureMakerY(int min, int max) {
		int yTreasure = ThreadLocalRandom.current().nextInt(min, max+1);
		return yTreasure;
	}
	public static int treasureMakerY(int max) {
		int yTreasure = ThreadLocalRandom.current().nextInt(0, max+1);
		return yTreasure;
	}
	
}
