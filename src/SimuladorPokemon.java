
public class SimuladorPokemon {

	public static void main(String[] args) {
		
		PokemonFuego charizard = new PokemonFuego("Charizard", 48, 48, 33, 100, null, 100, 135.78, 1.95, 821, 500);
		PokemonFuego charmeleon = new PokemonFuego("Charmeleon", 75, 75, 14, 32, charizard, 100, 6.16, 0.88, 846, 325);
		PokemonFuego charmander = new PokemonFuego("Charmander", 26, 26, 10, 13, charmeleon, 100, 14.31, 0.75, 126, 68);
	
		charmander.atacar(charizard);
	}
	

}
