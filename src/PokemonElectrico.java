
public class PokemonElectrico extends Pokemon {

	public PokemonElectrico(String nombre, int saludActual, int saludMax, int nivel, int nivelEvolucion,
			Pokemon evolucion, int nivelMax, double peso, double altura, int poderAtaque, int poderDefensa) {
		super(nombre, saludActual, saludMax, nivel, nivelEvolucion, evolucion, nivelMax, peso, altura, poderAtaque,
				poderDefensa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar(Pokemon otroPokemon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defenderse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String dibujar() {
		String pokemonADibujar = "Mi Pokemon Electrico";
		
		System.out.println(pokemonADibujar);
		return pokemonADibujar;
	}

}
