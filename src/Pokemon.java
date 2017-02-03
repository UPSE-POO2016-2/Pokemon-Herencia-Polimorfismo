
/**
 * Esta clase se trata de un Pokemon base
 * Servira para crear otros tipos de pokemon especificos
 * a traves de herencia.
 * Las clases hijas, tendran diferente comportamiento
 * a traves de polimorfismo.
 * @author ivans
 *
 */
public class Pokemon {
	
	protected String nombre;
	protected int saludActual;
	protected int saludMax;
	protected int nivel;
	protected int nivelEvolucion;
	protected Pokemon evolucion;
	protected int nivelMax;
	protected double peso;
	protected double altura;
	
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
	 */
	public Pokemon(String nombre, int saludActual, int saludMax, int nivel, int nivelEvolucion, Pokemon evolucion,
			int nivelMax, double peso, double altura) {
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

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", saludActual=" + saludActual + ", saludMax=" + saludMax + ", nivel="
				+ nivel + ", nivelEvolucion=" + nivelEvolucion + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
