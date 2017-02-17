import java.util.Random;

public class PokemonFuego extends Pokemon {

	
	public PokemonFuego(String nombre, int saludActual, int saludMax, int nivel, int nivelEvolucion, Pokemon evolucion,
			int nivelMax, double peso, double altura, int poderAtaque, int poderDefensa) {
		super(nombre, saludActual, saludMax, nivel, nivelEvolucion, evolucion, nivelMax, peso, altura, poderAtaque, poderDefensa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar(Pokemon otroPokemon) {
		Random r = new Random();
		
		int poderAtaque = r.nextInt(this.poderAtaque);
		System.out.println("El pokemon " + this.getNombre() + " a atacado a "
				+ otroPokemon.getNombre() + " con un poder de " + poderAtaque);
		
		if(otroPokemon.getClass()==PokemonAgua.class)
		{
			poderAtaque = poderAtaque/2;
		}
		
		if(otroPokemon.getClass()==PokemonElectrico.class)
		{
			poderAtaque = (int) Math.round(poderAtaque*0.75);
		}
		
		int defensaOtroPokemon = otroPokemon.defenderse();
				
		int poderFinalAtaque = poderAtaque - defensaOtroPokemon;
		
		if(poderFinalAtaque>0)
		{
			System.out.println("El poder final de ataque es: " + poderFinalAtaque);
			int saludOtroPokemon = otroPokemon.getSaludActual() - poderFinalAtaque;
			System.out.println("La nueva salud de " + otroPokemon.getNombre() 
				+ " es " + otroPokemon.getSaludActual());
			otroPokemon.setSaludActual(saludOtroPokemon);	
		}else{
			System.out.println("El ataque fue inutil, se le viro la .... ");
		}
		
		return poderFinalAtaque;
	}

	@Override
	public int defenderse() {

			Random r = new Random();
			int poderDefensa = r.nextInt(this.poderDefensa);
			System.out.println(this.getNombre() + " se ha defendido con " 
					+ poderDefensa + " puntos de defensa.");
		return poderDefensa;
	}

	@Override
	public String dibujar() {
		String pokemonADibujar = "Mi Pokemon Fuego";
		
		System.out.println(pokemonADibujar);
		return pokemonADibujar;
	}

}
