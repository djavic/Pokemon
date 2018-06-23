package es.djavic.pokemon;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TextUI {

	private Game game;
	private Pokemon[] allPokemons;
	private int allPokemonSize;

	/**
	 * 
	 * @param game
	 * 
	 *            class builder
	 * @param allPokemonSize
	 */
	public TextUI(Game game, int allPokemonSize) {
		this.game = game;
		this.allPokemonSize = allPokemonSize;

		try {
			ObjectInputStream readData = new ObjectInputStream(new FileInputStream("data/data.dat"));

			allPokemons = (Pokemon[]) readData.readObject();

			readData.close();

		} catch (Exception e) {
			
		}
	}

	public int getAllPokemonSize() {
		return this.allPokemonSize;
	}

	public void start() {
		int menu = 0;
		int combatMenu = 0;

		do {

			try {

				mainMenu();
				System.out.println(game.getPlayerOneName() + "'s team");
				System.out.println(game.showInformation());
				System.out.println(game.getPlayerTwoName() + "'s team");
				String chosenPokemon;
				menu = Keyboard.readInteger();

				switch (menu) {
				case 1:

					for (int i = 0;i < this.allPokemonSize;i++) {
						System.out.println(allPokemons[i].toString());

					}

					chosenPokemon = Keyboard.readString();

					game.add(chosenPokemon);

					System.out.println("\n");
					break;
				case 2:
					String pokemonToRemove;
					game.showInformation();
					pokemonToRemove = Keyboard.readString();
					game.removePokemon(pokemonToRemove);
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

			} catch (PokemonExceptions e) {
				System.out.println(e.getMessage());

			}

		} while (0 < menu && menu <= 4);

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
