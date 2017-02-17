import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entrenador implements GraficosJuego {
	
	private String nombre;
	private Genero genero;
	private int numeroMedallas;
	private List<Pokemon> listaPokemon = new ArrayList<Pokemon>();
	private int nivel;
	private int batallasGanadas;
	private int batallasPerdidas;
	
	public Entrenador(String nombre, Genero genero, List<Pokemon> listaPokemon) {
		this.nombre = nombre;
		this.genero = genero;
		this.listaPokemon = listaPokemon;
		this.numeroMedallas = 0;
		this.nivel = 1;
		this.batallasGanadas = 0;
		this.batallasPerdidas = 0;
	}

	public Entrenador(String nombre, Genero genero, int numeroMedallas, List<Pokemon> listaPokemon, int nivel,
			int batallasGanadas, int batallasPerdidas) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.numeroMedallas = numeroMedallas;
		this.listaPokemon = listaPokemon;
		this.nivel = nivel;
		this.batallasGanadas = batallasGanadas;
		this.batallasPerdidas = batallasPerdidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getNumeroMedallas() {
		return numeroMedallas;
	}

	public void setNumeroMedallas(int numeroMedallas) {
		this.numeroMedallas = numeroMedallas;
	}

	public List<Pokemon> getListaPokemon() {
		return listaPokemon;
	}

	public void setListaPokemon(List<Pokemon> listaPokemon) {
		this.listaPokemon = listaPokemon;
	}

	public int getNivel() {
		return nivel;
	}

	public int getBatallasGanadas() {
		return batallasGanadas;
	}

	public int getBatallasPerdidas() {
		return batallasPerdidas;
	}
	
	
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setBatallasGanadas(int batallasGanadas) {
		this.batallasGanadas = batallasGanadas;
	}

	public void setBatallasPerdidas(int batallasPerdidas) {
		this.batallasPerdidas = batallasPerdidas;
	}

	public boolean atraparPokemon(Pokemon p)
	{
		Random r = new Random();
		int azar = r.nextInt(2);
		
		if(azar==1)
		{
			listaPokemon.add(p);
			System.out.println("Te atrape maldito! " + p.getNombre());
			return true;
		}else{
			System.out.println("Se escapo el desgraciado!");
			return false;
		}
	}
	
	public void batallarContraOtroEntrenador(Entrenador elOtro)
	{
		
		if(this.listaPokemon.size()==elOtro.getListaPokemon().size())
		{
			
			System.out.println(this.getNombre() + " va a comenzar la batalla");
			
			do{
				Pokemon pokemonElegidoEntrenador = elegirPokemonVivo(this);
				Pokemon pokemonElegidoElOtro = elegirPokemonVivo(elOtro);
				
				if(pokemonElegidoElOtro==null || pokemonElegidoEntrenador==null)
				{
					if(pokemonElegidoElOtro==null)
					{
						this.batallasGanadas++;
						elOtro.setBatallasPerdidas(elOtro.getBatallasPerdidas()+1);
						System.out.println("El ganador es : " + this.getNombre());
						System.out.println("El LOOOOOOOOSEEEEEEER es: " + elOtro.getNombre());
					}
					
					if(pokemonElegidoEntrenador==null)
					{
						this.batallasPerdidas++;
						elOtro.setBatallasGanadas(elOtro.getBatallasGanadas()+1);

						System.out.println("El ganador es : " + elOtro.getNombre());
						System.out.println("El LOOOOOOOOSEEEEEEER es: " + this.getNombre());
					}
					break;
				}

				do{
					pokemonElegidoElOtro.atacar(pokemonElegidoEntrenador);
					pokemonElegidoEntrenador.atacar(pokemonElegidoElOtro);
				}while(pokemonElegidoEntrenador.getSaludActual()>0 &&
						pokemonElegidoElOtro.getSaludActual()>0);
				
							}
			while(true);
		}else{
			System.out.println("Batalla injusta, sape!");
		}	
		
	}
	
	private Pokemon elegirPokemonVivo(Entrenador e)
	{
		Random suertePokemon = new Random();
		List<Pokemon> pokemonVivosEntrenador = new ArrayList<Pokemon>();
		for (Pokemon pokemon : e.getListaPokemon()) {
			if(pokemon.getSaludActual()>0)
			{
				pokemonVivosEntrenador.add(pokemon);
			}
		}
		
		Pokemon pokemonElegido = null;
		if(!pokemonVivosEntrenador.isEmpty())
		{
			pokemonElegido = pokemonVivosEntrenador.get(suertePokemon.nextInt(pokemonVivosEntrenador.size()));
			System.out.println(pokemonElegido.getNombre() + " yo te elijo!!!");
			
		}
		return pokemonElegido;
	}

	@Override
	public String dibujar() {
		String entrenadorADibujar = "";
		
		System.out.println(entrenadorADibujar);
		return entrenadorADibujar;
	}
	
}
