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
		
	if(newPokemon == null) {
		System.out.println("null");
		throw new PokemonExceptions("Pokemon error: It doesnt exits");
		
	}else if (pokemons.length == this.next) {
		System.out.println("espacio");
			
			throw new PokemonExceptions("Pokemon Error: No more space in the team left");

		} else if (isSameName(newPokemon.getName()) != null) {
			System.out.println("repe");
		
			throw new PokemonExceptions("Add pokemon error: Pokemon " + newPokemon.getName() + " already in the team");

		} else { 
			System.out.println("OK");
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

	public String toString() {

		StringBuilder out = new StringBuilder();

		for (int i = 0; i < this.next; i++) {
			out.append(pokemons[i]);
		}
		return out.toString();
	}

}
