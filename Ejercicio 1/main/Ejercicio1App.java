package main;

import herencia.Lavadora;
import herencia.Television;
import superclase.Electrodomestico;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		// Array de 10 posiciones de electrodomesticos.
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		
		Lavadora lavadora1 = new Lavadora(150, "rojo", 'E', 50, 24);
		Lavadora lavadora2 = new Lavadora(526, "negro", 'A', 35, 45);
		Lavadora lavadora3 = new Lavadora(217, "verde", 'C', 42, 30);
		Lavadora lavadora4 = new Lavadora(437, "azul", 'B', 40, 38);
		Lavadora lavadora5 = new Lavadora(102, "blanco", 'F', 56, 15);
		Television tele1 = new Television(1350, "negro", 'A', 20, 75, true);
		Television tele2 = new Television(1000, "negro", 'B', 17, 65, true);
		Television tele3 = new Television(850, "blanco", 'C', 13, 50, true);
		Television tele4 = new Television(600, "rojo", 'E', 11, 43, true);
		Television tele5 = new Television(350, "azul", 'F', 8, 32, true);
		
		// Guardando los objetos en el array de electrodomesticos.
		electrodomesticos[0] = lavadora1;
		electrodomesticos[1] = lavadora2;
		electrodomesticos[2] = lavadora3;
		electrodomesticos[3] = lavadora4;
		electrodomesticos[4] = lavadora5;
		electrodomesticos[5] = tele1;
		electrodomesticos[6] = tele2;
		electrodomesticos[7] = tele3;
		electrodomesticos[8] = tele4;
		electrodomesticos[9] = tele5;
		
		// Llama a la funcion que muestra los datos.
		printaDatos(electrodomesticos);

	}
	
	// Funcion a la que se le pasa un array de electrodomesticos
	// Calcula el coste total de los electrodomesticos
	// el coste total en lavadoras y el de televisiones por separado.
	public static void printaDatos(Electrodomestico electrodomesticos[]) {
		
		int sumaLavadora = 0;
		int sumaTele = 0;
		int sumaTotal = 0;
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			// Si el electrodomestico en la posicion actual del array es una lavadora.
			if(electrodomesticos[i] instanceof Lavadora) {
				// suma el coste de la lavadora.
				sumaLavadora += electrodomesticos[i].getPrecioFinal();
			// Si es una television.
			}else if(electrodomesticos[i] instanceof Television){
				// Suma el coste de la tele
				sumaTele += electrodomesticos[i].getPrecioFinal();
			}
			// Suma el total de todos los electrodomesticos.
			sumaTotal = sumaLavadora + sumaTele;
		}
		// Printa
		System.out.println("Coste total de todos los electrodomesticos: " + sumaTotal + "€."
							+ "\nCoste total de las lavadoras: " + sumaLavadora + "€"
							+ "\nCoste total de las televisiones: " + sumaTele + "€.");
	}

}
