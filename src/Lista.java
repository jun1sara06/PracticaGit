
public class Lista {
	private static String[] ListaPalabras = {
			"Perro",
			"Carro",
			"Manzana",
			"Vaso",
			"Libro",
			"Camisa"
			
	};
	
	private static String[] ListaPalabrasIngles = {
			"Dog",
			"Car",
			"Apple",
			"Glass",
			"Book",
			"Shirt"
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
