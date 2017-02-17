
public class PokemonAgua extends Pokemon{

	public PokemonAgua(String nombre, int saludActual, int saludMax, int nivel, int nivelEvolucion, Pokemon evolucion,
			int nivelMax, double peso, double altura, int poderAtaque, int poderDefensa) {
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
		String pokemonADibujar = "*****Squirtle*****\n"
+"				   ,........__	\n"
+"	            ,-'            \"`-.\n"
+"	            ,'                   `-.\n"
+"	          ,'                        \\n"
+"	        ,'                           .\n"
+"	        .'\\               ,\"\".       `\n"
+"	       ._.'|             / |  `       \\n"
+"	       |   |            `-.'  ||       `.\n"
+"	       |   |            '-._,'||       | \\n"
+"	       .`.,'             `..,'.'       , |`-.\n"
+"	       l                       .'`.  _/  |   `.\n"
+"	       `-.._'-   ,          _ _'   -\\\" \\\\  .     `\n"
+"	  `.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n"
+"	  .'        `\"-..___      __,'\\          \\  \\     \\\n"
+"	  \\_ .          |   `\"\"\"\"'    `.           . \\     \\n"
+"	    `.          |              `.          |  .     L\n"
+"	      `.        |`--...________.'.        j   |     |\n"
+"	        `._    .'      |          `.     .|   ,     |\n"
+"	           `--,\\       .            `7\"\"' |  ,      |\n"
+"	              ` `      `            /     |  |      |    _,-'\"\"\"`-.\n"
+"	               \\ `.     .          /      |  '      |  ,'          `.\n"
+"	                \\  v.__  .        '       .   \\    /| /              \\n"
+"	                 \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n"
+"	                  `        .        `._ ___,j.  `/ .-       ,---.     |\n"
+"	                  ,`-.      \\         .\"     `.  |/        j     `    |\n"
+"	                 /    `.     \\       /         \\ /         |     /    j\n"
+"	                |       `-.   7-.._ .          |\"          '         /\n"
+"	                |          `./_    `|          |            .     _,'\n"
+"	                `.           / `----|          |-............`---'\n"
+"	                  \\          \\      |          |\n"
+"	                 ,'           )     `.         |\n"
+"	                  7____,,..--'      /          |\n"
+"	                                    `---.__,--.'mh\n"
+"		\n";
		
		System.out.println(pokemonADibujar);
		return pokemonADibujar;
	}

}
