package es.djavic.pokemon;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TextUI {

	private Game game;

	Pokemon cinderoar;
	Pokemon tremorok;
	Pokemon charmander;

	/**
	 * 
	 * @param game
	 * 
	 *            class builder
	 */
	public TextUI(Game game) {
		this.game = game;

	}

	public void start() {
		int menu = 0;
		int combatMenu = 0;
		PokemonArray call;
		

	
		try {
			call = new PokemonArray(100);
			
			call.createPokemons();
			ObjectInputStream readData = new ObjectInputStream(new FileInputStream("etc/data.dat"));

			Pokemon[] allPokemons = (Pokemon[]) readData.readObject();

			readData.close();

			do {

				// try {

				mainMenu();
				
				menu = Keyboard.readInteger();

				switch (menu) {
				case 1:

					for (int i = 0; i < call.pokemonCount(); i++) {
						System.out.println(allPokemons[i].toString());

					}

					System.out.println("\n");
					break;
				case 2:

					break;
				case 3:

					do {
						combatMenu();
						combatMenu = Keyboard.readInteger();

					} while (0 < combatMenu && combatMenu < 3);

					break;
				case 4:

					break;
				default:
					System.out.println("Invalid option");
					break;
				}
				/*
				 * } catch (PokemonExceptions e) { System.out.println(e.getMessage());
				 * 
				 * }
				 */

			} while (0 < menu && menu <= 4);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void mainMenu() {

		System.out.println("Chose an option");
		System.out.println("1-Chose Pokemon");
		System.out.println("2-Delete Pokemon");
		System.out.println("3-Start combat");
		System.out.println("4-End game");

	}

	private void combatMenu() {

		System.out.println("Chose an option");
		System.out.println("1-Atack");
		System.out.println("2-Change");
		System.out.println("3-Surrender");

	}

}
