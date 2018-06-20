package es.djavic.pokemon;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Game {

	private String gameName;
	private int teamSize;
	private String playerOneName;
	private String playerTwoName;
	private Pokemon[] allPokemons;
	
	private PokemonTeam pokemonTeam;

	public Game(String gameName, int teamSize, String playerOneName, String playerTwoName) {
		this.gameName = gameName;
		this.teamSize = teamSize;
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
		this.pokemonTeam = new PokemonTeam(teamSize);

		try {
			ObjectInputStream readData = new ObjectInputStream(new FileInputStream("data/data.dat"));

			allPokemons = (Pokemon[]) readData.readObject();

			readData.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
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

	public void add(String pokemon) throws PokemonExceptions {
		Pokemon chosenPokemon = null;
		for(int i = 0; i < pokemonCount(); i++) {
			
			if(pokemon.equals(allPokemons[i].getName()) && allPokemons[i] != null) {
				
				chosenPokemon = allPokemons[i];
			}
		}
		
		pokemonTeam.add(chosenPokemon);
	}
	
	public int pokemonCount() {
		int count = 0;

		for (int i = 0; i < allPokemons.length; i++) {
			if (allPokemons[i] != null) {
				count++;

			}
		}
		return count;
	}

}
