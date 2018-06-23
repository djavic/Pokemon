package es.djavic.pokemon;

public class PokemonTeam {

	private Pokemon[] pokemons;
	private int next;

	public PokemonTeam(int teamSize) {

		this.pokemons = new Pokemon[teamSize];
		this.next = 0;
	}

	public int getNumPokemon() {
		return this.next;
	}

	public void add(Pokemon newPokemon) throws PokemonExceptions {/** Metodo para aniadir participante **/

		if (newPokemon == null) {

			throw new PokemonExceptions("Pokemon error: It doesnt exits");

		} else if (pokemons.length == this.next) {
			System.out.println("espacio");

			throw new PokemonExceptions("Pokemon Error: No more space in the team left");

		} else if (isSameName(newPokemon.getName()) != null) {

			throw new PokemonExceptions("Add pokemon error: Pokemon " + newPokemon.getName() + " already in the team");

		} else {

			pokemons[this.next++] = new Pokemon(newPokemon);

		}
	}

	public Pokemon isSameName(String name) {
		Pokemon out = null;

		for (int i = 0; i < this.next; i++) {

			if (name.equals(pokemons[i].getName())) {
				out = pokemons[i];
			}
		}
		return out;
	}

	public void remove(Pokemon pokemonToRemove) throws PokemonExceptions {

		int signal = 0;
		int flag = 1;

		if (pokemonToRemove == null) {
			throw new PokemonExceptions("The pokemon is not in the team");
		}

		for (int i = 0; i < this.next; i++) {

			if (pokemonToRemove != null && pokemonToRemove.getName().equals(pokemons[i].getName())) {
				pokemons[i] = null;
				signal = i;
				flag = 0;

			}
		}

		reorder(signal);

	}

	public void reorder(int init) {

		for (int i = init; i < this.next - 1; i++) {
			pokemons[i] = pokemons[i + 1];
		}
		this.next--;
	}

	public String toString() {

		StringBuilder out = new StringBuilder();

		for (int i = 0; i < this.next; i++) {
			out.append(pokemons[i]);
		}
		return out.toString();
	}

}
