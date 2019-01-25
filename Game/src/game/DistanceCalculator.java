package game;

public class DistanceCalculator {

	public static void main(String[] args) {
		distance(3, 4);

	}

	public static double distance(int xCo, int yCo) {

		double distance = Math.sqrt((xCo) * (xCo) + (yCo) * (yCo));
		System.out.println("You are " + distance + "m away from your treasure.");
		return distance;
	}

}
