package es.djavic.pokemon;

import java.io.IOException;

public class MainPokemon {

	public static void main(String[] args) {

		if (args.length != 4) {
			System.out.println("Invalid number of arguments");
		}

		String gameName = args[0];
		int allPokemonSize = Integer.parseInt(args[1]);
		int teamSize = Integer.parseInt(args[2]);
		String playerOneName = args[3];
		String playerTwoName = args[4];
		
       
		Game game = new Game(gameName, teamSize, playerOneName, playerTwoName);
		PokemonArray call = new PokemonArray(100); //Creamos el objeto para crear el .dat
		
		TextUI ui = new TextUI(game,allPokemonSize);
		call.createPokemons();//llamamos para que se cree el .dat
		
		ui.start();
		
	}

}
