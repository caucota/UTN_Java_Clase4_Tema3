package clase4_Tema3;
//import java.util.Arrays;       
//import java.util.Collections;  

public class ejercicio1 {

	public static void main(String[] args) {
		int cant = 0;                                                                              
        
		/// EJERCICIO 1                                                                            
		cant = ContarApariciones( "Nos estamos preparando para mejorar nuestras habilitades", 'A');
		System.out.println("Ejercicio 1 - Cantidad apariciones: " + cant);                           
		                                                                                           
		//// EJERCICIO 2                                                                           
		int vectorIntOrdenado[] = new int[3];                                                      
		vectorIntOrdenado = OrdenarVector(5,3,8, false);                                           
		System.out.println("Ejercicio 2 - Vector ordenado :");                                      
		for(int i=0; i < vectorIntOrdenado.length; i++ ) {                                         
			System.out.println( "Valor " + i +":  " + vectorIntOrdenado[i]);                       
		}                                                                                          
		                                                                                           
		/// EJERCICIO 3                                                                            
		double vectorDouble[] = {45.2, 12.3, 5, 18.6, 3};  
		double nroBase = 12.3;
		double totalMayoresXNro = SumarNumeros(vectorDouble, nroBase);                                
		System.out.println("Ejercicio 3- Suma Nros mayores a " + 12.3 + ": " + totalMayoresXNro);            
                                                                                                   
	}                                                                                              
	                                                                                               
	private static int ContarApariciones(String texto, char letra) {                               
		int cantidad = 0;                                                                          
		                                                                                           
		texto = texto.toUpperCase();                                                               
		if(Character.isLowerCase(letra)) {                                                         
			letra = Character.toUpperCase(letra);	                                               
		}                                                                                          
		for( int i = 0; i < texto.length(); i++ ) {                                                
			if (texto.charAt(i) == letra) {                                                        
				cantidad ++;				                                                       
			}                                                                                      
		}                                                                                          
		return cantidad;                                                                           
	}                                                                                              
                                                                                                   
	private static int[] OrdenarVector(int nro1, int nro2, int nro3, boolean ordenAscendente) {    
		int vectorInt[] = new int[3];                                                              
		vectorInt[0] = nro1;                                                                       
		vectorInt[1] = nro2;                                                                       
		vectorInt[2] = nro3;                                                                       
		int auxInt = 0;                                                                            
		                                                                                           
		for(int i = 0; i < vectorInt.length-1; i++ ) {                                             
			if( ordenAscendente) {                                                                 
				for(int j = i; j < vectorInt.length; j++) {                                        
					if (vectorInt[i] > vectorInt[j]) {                                             
						auxInt = vectorInt[i];                                                     
						vectorInt[i] = vectorInt[j];                                               
						vectorInt[j] = auxInt;					                                   
					}                                                                              
				}                                                                                  
				//Arrays.sort(vectorInt);                                                          
			}                                                                                      
			else {                                                                                 
				for(int j = i; j < vectorInt.length; j++) {                                        
					if (vectorInt[i] < vectorInt[j]) {                                             
						auxInt = vectorInt[i];                                                     
						vectorInt[i] = vectorInt[j];                                               
						vectorInt[j] = auxInt;					                                   
					}                                                                              
				                                                                                   
				}                                                                                  
				//Arrays.sort(vectorInt, Collections.reverseOrder());                                
			}                                                                                      
		}                                                                                          
		                                                                                           
		return vectorInt;                                                                          
	}                                                                                              
	                                                                                               
	                                                                                               
	private static double SumarNumeros(double vectorNros[], double nro) {                          
		double total = 0;                                                                          
		for (int i = 0; i < vectorNros.length ; i++) {                                             
			if (vectorNros[i] >= nro) {                                                            
				total = total + vectorNros[i];                                                     
			}                                                                                      
		}                                                                                          
		return total;                                                                              
	}                                                                                              
		                                                                                           
}
