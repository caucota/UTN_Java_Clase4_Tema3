package clase4_Tema3;

public class ejercicio2 {

	public static void main(String[] args) {
		String letrasCodificacion = "abcdefghijklmnñopqrstuvwxyz ";
		String texto = "hola que tal";
		int desplazamiento = 2;
		texto = Codificar(texto, letrasCodificacion, desplazamiento);
		System.out.println("Ejercicio2 - Texto Codificado:" + texto);

		texto = Decodificar(texto, letrasCodificacion, desplazamiento);
		System.out.println("Ejercicio2 - Texto Decodificado:" + texto);
		

	}

	public static String Codificar(String cadenaEntrada, String letrasCodif, int cantidadDesplazamientos) {
		String cadenaSalida = "";
		int posicion = 0;
		int totalLetras = letrasCodif.length();
		int desplazamientoCondicional = 0;
		cadenaEntrada = cadenaEntrada.toLowerCase();
		for( int i = 0; i < cadenaEntrada.length(); i++) {
			desplazamientoCondicional = cantidadDesplazamientos;
			posicion = letrasCodif.indexOf(cadenaEntrada.charAt(i));
			if ((posicion + desplazamientoCondicional) >= totalLetras-1) {
				desplazamientoCondicional = (posicion + desplazamientoCondicional) - totalLetras;
				posicion = 0;
			}
			cadenaSalida = cadenaSalida + letrasCodif.charAt(posicion + desplazamientoCondicional );
		}
		return cadenaSalida;
	}

	public static String Decodificar(String cadenaEntrada, String letrasCodif, int cantidadDesplazamientos) {
		String cadenaSalida = "";
		int posicion = 0;
		int totalLetras = letrasCodif.length();
		int desplazamientoCondicional = 0;
		cadenaEntrada = cadenaEntrada.toLowerCase();
		for( int i = 0; i < cadenaEntrada.length(); i++) {
			posicion = letrasCodif.indexOf(cadenaEntrada.charAt(i));
			desplazamientoCondicional = cantidadDesplazamientos;
			if ((posicion - desplazamientoCondicional)  < 0) {
				if ((posicion - desplazamientoCondicional)  < 0) {
					desplazamientoCondicional = desplazamientoCondicional - posicion;
				}
				posicion = totalLetras;
			}
			cadenaSalida = cadenaSalida + letrasCodif.charAt(posicion - desplazamientoCondicional );
		}
		return cadenaSalida;
	}

}
