package es.djavic.pokemon;

import java.io.Serializable;

public class Pokemon implements Serializable {

	/**
	 * @author djavic
	 */
	private String name;
	private Atribute atribute;
	private int atack;
	private int defense;
	private int lifePoints;

	/**
	 * 
	 * @param name
	 * @param atribute
	 * @param atack
	 * @param defense
	 * @param lifeppoints
	 * 
	 *            Class Builder
	 */
	public Pokemon(String name, Atribute atribute, int atack, int defense, int lifeppoints) {

		this.name = name;
		this.atribute = atribute;
		this.atack = atack;
		this.defense = defense;
		this.lifePoints = lifeppoints;
	}

	/**
	 * 
	 * @param pokemon
	 * 
	 *            Class copy builder
	 */

	public Pokemon(Pokemon pokemon) {
		this.name = pokemon.getName();
		this.atribute = pokemon.getAtribute();
		this.atack = pokemon.getAtack();
		this.defense = pokemon.getDefense();
		this.lifePoints = pokemon.getLifePoints();
	}

	public String getName() {
		return this.name;
	}

	public Atribute getAtribute() {
		return this.atribute;
	}

	public int getAtack() {
		return this.atack;
	}

	public int getDefense() {
		return this.defense;
	}

	public int getLifePoints() {
		return this.lifePoints;
	}

	public void setLifePoints(int value) throws PokemonExceptions {
		if (value < 0) {
			throw new PokemonExceptions("Life point might be more than zero");
		} else {
			this.lifePoints = value;
		}
	}
	
	
	public String toString() {
		
		return getName() + ": " + getAtribute();
	}


}
