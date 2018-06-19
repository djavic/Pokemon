package es.djavic.pokemon;


public class TextUI {

	private Game game;

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

		do {

			//try {

				mainMenu();

				menu = Keyboard.readInteger();

				switch (menu) {
				case 1:
					
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
