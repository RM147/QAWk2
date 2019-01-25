package game;

public class Game {

	public static void main(String[] args) {
		Storyteller.storyteller();
		int xTreasure = TreasureMaker.treasureMakerX(10);
		int yTreasure = TreasureMaker.treasureMakerY(10);
		double distance = DistanceCalculator.distance(xTreasure, yTreasure);

		Mover.mover(distance, xTreasure, yTreasure, (xTreasure+yTreasure+3));

	}

}
