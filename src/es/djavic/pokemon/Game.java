package es.djavic.pokemon;

public class Game {

	private String gameName;
	private int teamSize;
	private String playerOneName;
	private String playerTwoName;

	public Game(String gameName, int teamSize, String playerOneName, String playerTwoName) {
		this.gameName = gameName;
		this.teamSize = teamSize;
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
	}

	public String getGameName() {
		return this.gameName;
	}

	public int getTeamSize() {
		return this.teamSize;
	}

	public String getPlayerOneName() {
		return this.playerOneName;
	}

	public String getPlayerTwoName() {
		return this.playerTwoName;
	}
	
	
	public void add(Pokemon pokemon) {
		
	}

}
