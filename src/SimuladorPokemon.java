import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimuladorPokemon {

	public static void main(String[] args) {
		
		PokemonFuego charizard = new PokemonFuego("Charizard", 48, 48, 33, 100, null, 100, 135.78, 1.95, 821, 500);
		PokemonFuego charmeleon = new PokemonFuego("Charmeleon", 75, 75, 14, 32, charizard, 100, 6.16, 0.88, 846, 325);
		PokemonFuego charmander = new PokemonFuego("Charmander", 26, 26, 10, 13, charmeleon, 100, 14.31, 0.75, 126, 68);
	
		PokemonAgua	blastoise = new PokemonAgua("blastoise", 100, 100, 34, 100, null, 100, 102.53, 1.54, 731, 610);
		PokemonAgua wartortle = new PokemonAgua("wartortle", 82, 82, 14, 33, blastoise, 100, 29.89, 1.03, 270, 300);
		PokemonAgua squirtle = new PokemonAgua("squirtle", 55, 55, 10, 13, wartortle, 100, 7.6, 0.49, 132, 150);
		
		squirtle.escribirPokemonArchivo();

		
		List<Pokemon> pokemonesManuel = new ArrayList<Pokemon>();
		pokemonesManuel.add(squirtle);
		pokemonesManuel.add(wartortle);
		pokemonesManuel.add(blastoise);
		Entrenador manuel = new Entrenador("Manuel", Genero.ALTERNATIVO, pokemonesManuel);
		
		List<Pokemon> pokemonesPeter = new ArrayList<Pokemon>();
		pokemonesPeter.add(charmander);
		pokemonesPeter.add(charmeleon);
		pokemonesPeter.add(charizard);
		Entrenador peter = new Entrenador("Peter", Genero.MASCULINO, pokemonesPeter);
		
		manuel.batallarContraOtroEntrenador(peter);
		
		squirtle.leerPokemonArchivo();
		squirtle.borrarArchivoPokemon();
	}
	

}
