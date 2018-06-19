package es.djavic.pokemon;

public class MainPokemon {

	public static void main(String[] args) {
		
		if(args.length != 4) {
			System.out.println("Invalid number of arguments");
		}
		
		String gameName = args[0];
		int teamSize = Integer.parseInt(args[1]);
		String playerOneName = args[2];
		String playerTwoName = args[3];
		
		Game game = new Game(gameName, teamSize, playerOneName, playerTwoName);
		TextUI ui = new TextUI(game);
		ui.start();
	}

}
