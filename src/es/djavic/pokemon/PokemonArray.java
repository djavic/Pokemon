package es.djavic.pokemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PokemonArray {

	private Pokemon allPokemons[];

	public PokemonArray(int numberPokemons) {
		allPokemons = new Pokemon[numberPokemons];

		Pokemon cinderoar = new Pokemon("Cinderoar", Atribute.Pyrus, 20, 5, 100);
		allPokemons[0] = cinderoar;
		Pokemon tremorok = new Pokemon("Tremorok", Atribute.Subterra, 10, 30, 250);
		allPokemons[1] = tremorok;
		Pokemon charmander = new Pokemon("Charmander", Atribute.Pyrus, 5, 10, 70);
		allPokemons[2] = charmander;
		Pokemon adsads = new Pokemon("adasd", Atribute.Pyrus, 5, 10, 70);
		allPokemons[3] = adsads;
	}
	/*
	public int pokemonCount() {
		int count = 0;

		for (int i = 0; i < allPokemons.length; i++) {
			if (allPokemons[i] != null) {
				count++;

			}
		}
		return count;
	}
	*/
	

	public void createPokemons() {
		try {

			File directory = new File("data"); // Creamos la carpeta etc si no esta creada
			directory.mkdir();

			ObjectOutputStream data = new ObjectOutputStream(new FileOutputStream("data/data.dat"));

			data.writeObject(allPokemons);
			data.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
