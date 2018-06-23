package es.djavic.pokemon;

import java.io.IOException;

public class MainPokemon {

	public static void main(String[] args) throws PokemonExceptions {

		if (args.length != 4) {
			throw new PokemonExceptions("Invalid arguments");
		}

		String gameName = args[0];
		
		int teamSize = Integer.parseInt(args[1]);
		String playerOneName = args[2];
		String playerTwoName = args[3];
		int allPokemonSize;
		
		Game game = new Game(gameName, teamSize, playerOneName, playerTwoName);
		PokemonArray call = new PokemonArray(100); // Creamos el objeto para crear el .dat
		
		allPokemonSize = call.pokemonCount(); //Vemos cuantos objetos meteremos en el .dat
		TextUI ui = new TextUI(game, allPokemonSize);
		call.createPokemons();// llamamos para que se cree el .dat

		ui.start();

	}

}
