
/**
 * Esta clase se trata de un Pokemon base
 * Servira para crear otros tipos de pokemon especificos
 * a traves de herencia.
 * Las clases hijas, tendran diferente comportamiento
 * a traves de polimorfismo.
 * @author ivans
 *
 */
public abstract class Pokemon {
	
	protected String nombre;
	protected int saludActual;
	protected int saludMax;
	protected int nivel;
	protected int nivelEvolucion;
	protected Pokemon evolucion;
	protected int nivelMax;
	protected double peso;
	protected double altura;
	protected int poderAtaque;
	protected int poderDefensa;
	
	/**
	 * Este es el constructor completo del pokemon
	 * @param nombre : Nombre del Pokemon
	 * @param saludActual : Salud del pokemon al momento de crearse
	 * @param saludMax : Salud Maxima del pokemon en este nivel
	 * @param nivel : Nivel actual del pokemon
	 * @param nivelEvolucion : Nivel en el que el pokemon pasa a otro pokemon
	 * @param evolucion : Pokemon en el que se convertir al llegar al nivelEvolucion
	 * @param nivelMax : Maximon nivel al que puede llegar el pokemon
	 * @param peso : Peso duh!
	 * @param altura : Altura duh>
	 * @param poderAtaque: El poder maximo con el que este pokemon puede atacar
	 * @param poderDefensa: El poder maximo con el que este pokemon se puede defender
	 */
	public Pokemon(String nombre, int saludActual, int saludMax, int nivel, int nivelEvolucion, Pokemon evolucion,
			int nivelMax, double peso, double altura, int poderAtaque, int poderDefensa) {
		super();
		this.nombre = nombre;
		this.saludActual = saludActual;
		this.saludMax = saludMax;
		this.nivel = nivel;
		this.nivelEvolucion = nivelEvolucion;
		this.evolucion = evolucion;
		this.nivelMax = nivelMax;
		this.peso = peso;
		this.altura = altura;
		this.poderAtaque = poderAtaque;
		this.poderDefensa = poderDefensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaludActual() {
		return saludActual;
	}

	public void setSaludActual(int saludActual) {
		this.saludActual = saludActual;
		if(saludActual<=0)
		{
			System.out.println("RIP: " + this.getNombre() + " ha muerto. " + 
					"Buen trabajo, eres un entrenador pesimo!");
		}
	}

	public int getSaludMax() {
		return saludMax;
	}

	public void setSaludMax(int saludMax) {
		this.saludMax = saludMax;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getNivelEvolucion() {
		return nivelEvolucion;
	}

	public void setNivelEvolucion(int nivelEvolucion) {
		this.nivelEvolucion = nivelEvolucion;
	}

	public Pokemon getEvolucion() {
		return evolucion;
	}

	public void setEvolucion(Pokemon evolucion) {
		this.evolucion = evolucion;
	}

	public int getNivelMax() {
		return nivelMax;
	}

	public void setNivelMax(int nivelMax) {
		this.nivelMax = nivelMax;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	
	public int getPoderDefensa() {
		return poderDefensa;
	}

	public void setPoderDefensa(int poderDefensa) {
		this.poderDefensa = poderDefensa;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", poderAtaque= " + poderAtaque + ", saludActual=" + saludActual + ", saludMax=" + saludMax + ", nivel="
				+ nivel + ", nivelEvolucion=" + nivelEvolucion + ", peso=" + peso + ", altura=" + altura +
				", poderDefensa" + poderDefensa + "]";
	}
	
	public void evolucionar(){
		if(this.nivel>=this.nivelEvolucion && this.evolucion!=null)
		{
			this.nombre=evolucion.getNombre();
			this.altura = evolucion.getAltura();
			this.nivelEvolucion = evolucion.getNivelEvolucion();
			this.saludActual = evolucion.getSaludMax();
			this.saludMax = evolucion.getSaludMax();
			this.evolucion = evolucion.getEvolucion();
			this.peso = evolucion.getPeso();
			this.poderAtaque = evolucion.getPoderAtaque();
			this.poderDefensa = evolucion.getPoderDefensa();
		}else{
			System.out.println("Pokemon no listo para evolucion, entrenalo mas!");
		}
	}
	
	public abstract int atacar(Pokemon otroPokemon);
	
	public abstract int defenderse();
}
