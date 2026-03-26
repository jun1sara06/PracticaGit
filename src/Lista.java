
public class Lista {
	private static String[] ListaPalabras = {
			"Perro",
			"Carro",
			"Manzana",
			"Gato" , //Nueva palabra Carol
			"Casa",//Nueva palabra Carol
	};
	
	private static String[] ListaPalabrasIngles = {
			"Dog",
			"Car",
			"Apple",
			"Cat",
			"Home",
	};
	
	public static String getPalabraIngles(int indice) {
		if (indice >= 0 && indice<ListaPalabrasIngles.length) {
			return ListaPalabrasIngles[indice];
		}
		
		return null;
	}

	public static String getPalabra(int indice) {
		if (indice >= 0 && indice<ListaPalabras.length) {
			return ListaPalabras[indice];
		}
		
		return null;
	}

	public static String[] getListaPalabras() {
		return ListaPalabras;
	}
}

