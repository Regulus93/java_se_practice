public class GuessGame {
	
	private Player[] players;
	private int numberOfPlayers;
	private int targetNumber;
	private Player winner;
	
	public GuessGame(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
		players = new Player[numberOfPlayers];
	}
	
	private boolean isWinnerAnybody() {
		for(int i = 0;i<numberOfPlayers;i++) {
			if(players[i].getLatestGuess() == targetNumber) {
				winner = players[i];
				return true;
			}
		}
		return false;
	}
	
	private void guessEverybody() {
		for(int i = 0;i<numberOfPlayers;i++) {
			players[i].guess();
		}
	}
	
	public void initPlayers() {
		for(int i = 0;i<numberOfPlayers;i++) {
			players[i] = new Player();
		}
	} 
	
	public void startGame() {
		initPlayers();
		targetNumber = (int) (Math.random() * 10);
		System.out.println("[GuessGame] Target number is: " + targetNumber);
		do {
			guessEverybody();
		} while (!isWinnerAnybody());
		System.out.println("[GuessGame] Winner is .. Player" + winner.getPlayerNumber());
	}
	
}