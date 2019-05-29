public class Player {
	
	private int latestGuess;
	private int playerNumber;
	private static int playerCounter = 0;
	
	public Player() {
		playerNumber = playerCounter;
		playerCounter++;
	}
	
	public void guess() {
		latestGuess = (int) (Math.random() * 10);
		System.out.println("[Player " + playerNumber + "] I guessed a number. (" + latestGuess + ")");
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public int getLatestGuess() {
		return latestGuess;
	}
	
	
}