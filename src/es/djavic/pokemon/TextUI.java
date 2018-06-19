package es.djavic.pokemon;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TextUI {

	private Game game;
	private Pokemon allPokemons[];
	Pokemon cinderoar;
	Pokemon tremorok;

	/**
	 * 
	 * @param game
	 * 
	 *            class builder
	 */
	public TextUI(Game game) {
		this.game = game;
		allPokemons = new Pokemon[2];
		cinderoar = new Pokemon("Cinderoar",Atribute.Pyrus,20,5,100);
		tremorok = new Pokemon("Tremorok",Atribute.Subterra,10,30,250);
	}

	public void start() {
		int menu = 0;
		int combatMenu = 0;
		
		allPokemons[0] = cinderoar;
		allPokemons[1] = tremorok;
		
		try {
			System.out.println("adhgasid");
			ObjectOutputStream data = new ObjectOutputStream(new FileOutputStream("../etc/data.dat"));
			data.writeObject(allPokemons);
			data.close(); 
		}catch(Exception e) {
			
		}

		do {

			//try {

				mainMenu();

				menu = Keyboard.readInteger();

				switch (menu) {
				case 1:
					
					for(int i = 0; i <= 1;i++) {
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
						
					}while(0 < combatMenu && combatMenu < 3);
					
					break;
				case 4:
					
					break;
				default:
					System.out.println("Invalid option");
					break;
				}
				/*
			} catch (PokemonExceptions e) {
				System.out.println(e.getMessage());
				
			}
			*/

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
