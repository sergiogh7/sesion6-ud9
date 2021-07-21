package Ej5App;

import Clases.Aula;

public class Ej5App {

	public static void main(String[] args) {
		
//		Crea una clase.
		Aula clase1 = new Aula();
		
//		Muestra un mensaje segun resultado.
		if (clase1.hayClase()) {
			System.out.println("Hoy se puede dar clase.");
			
		}else {
			System.out.println("Hoy no se puede dar clase!");
			
		}
	}
}
