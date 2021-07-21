package main;

import java.util.Random;

import javax.swing.JOptionPane;

import Objetos.Cine;
import Objetos.Espectador;
import Objetos.Pelicula;

public class CineApp {

	public static void main(String[] args) {
		
//		Creando los objetos cine y pelicula
		Pelicula pelicula = new Pelicula("HOLA", 80, 18, "Yo");
		Cine cineCentro = new Cine (pelicula, 8);
		
//		Constante para determinar las filas y columnas del cine
		final int FILA = 8;
		final int COL = 9;
		
//		Variables
		int fila;
		int col; 
		int numTotalAsientos = FILA * COL;
		boolean crearEspectador;
		String pregunta;

//		Declara la sala de cine en char
		char[][] sala = new char[FILA][COL];

//		Llama a la funcion que rellena la matriz
		llenarMatriz(sala);
		
//		Bucle que no termina hasta que no se quiera crear mas espectadores 
//		o que el numero de asientos sea 0
		do {
			
			crearEspectador = false;
			
//			Genera un espectador con edad y dinero aleatorios.
			Espectador espectador = new Espectador ("NombreUsuario", edadRandom(), dineroRandom());
			
//			Si puede entrar al cine.
			if (espectador.comprarEntradaPelicula(cineCentro) && (espectador.edadMinimaCorrecta(pelicula))) {
				boolean asiento = false; // Condicion de parada para el bucle (Puesto = true --> usuario puesto)
				
//				Bucle que no termina hasta que el espectador tenga asiento
				while (!asiento) {
					
//					Genera un numero de asiento y de fila aleatorios
					fila = asientoRandom(FILA);
					col = asientoRandom(COL);
					
//					Si el asiento esta vacio lo ocupa con una O
					if (sala[fila][col] == '-') {
						sala[fila][col] = 'O'; 
//						Mensaje
						System.out.println("Asiento adquirido por " +espectador.getNombre()+ ".\n");
						
//						Cambia a true si ha adquirido un asiento
						asiento = true;
						
//						Resta 1 al numero total de asientos
						numTotalAsientos--;
					}
				}
			}
			
//			Si el espectador no puede entrar...
			else {
//				Muestra un mensaje con el dinero que dispone el espectador, la edad minima de entrada y el precio de la entrada del cine.
				System.out.println("**");
				System.out.println("* No puede entrar " + espectador.getNombre() + ":");
				System.out.println("* Su edad es " + espectador.getEdad() + ", la edad minima de la pelicula es " + pelicula.getEdadMinimaPelicula());
				System.out.println("* Su dinero es " + espectador.getDinero() + ", el precio de la entrada es "+ cineCentro.getPrecioDeEntrada());
				System.out.println("**");
			}
			
//			Pregunta si quiere dejar entrar mas espectadores
			pregunta = JOptionPane.showInputDialog("¿Entrar mas espectadores?\n(S / N)");
			pregunta.toLowerCase();
			
//			En caso afirmativo el boolean principal sigue en true
			if (pregunta.equals("s")) {
				crearEspectador = true;
			}
			
		} while (crearEspectador && numTotalAsientos != 0);
		
//		Printa la sala
		mostrarCine(sala);
		
	}
	
//	Funcion que rellena la matriz representando los asientos libres.
	public static void llenarMatriz (char[][] salaCine) {
		for (int i = 0; i < salaCine.length; i++) {
			
			for (int j = 0; j < salaCine[i].length; j++) {
				salaCine[i][j] = '-';
				
			}
		}
	}
	
//	Funcion que genera un numero de fila y columna segun el numero maximo que se le pasa por parametro.
	public static int asientoRandom (int maximoFilaColumna) {
		Random numRandom = new Random();
		return (int)(numRandom.nextDouble() * maximoFilaColumna);
	}
	
//	Funcion que genera los datos random del espectador con la edad entre 1 y 95 años.
	public static int edadRandom () {
		Random numRandom = new Random();
		return (int)(numRandom.nextDouble()* 95 + 1);
	}
	
//	Funcion que genera una cantidad aleatoria de dinero.
	public static int dineroRandom () {
		Random numRandom = new Random();
		return (int)(numRandom.nextDouble()*120 + 1);
	}
	
//	Printa la sala del cine
	public static void mostrarCine(char[][] sala) {
		System.out.println("* * * SALA * * *");
		System.out.println("- : Asiento libre \nO : Asiento ocupado");
		
		int maximo = sala.length;
//		Aqui se guardan las letras de los asientos
		int caracter;
//		Guarda el valor de la letra A en ascii
		final int CARACTER = 65;

		for (int i = 0; i < sala.length; i++, maximo--) {
//			Representan las letras de los asientos
			caracter = CARACTER;
			
			for (int j = 0; j < sala[i].length; j++, caracter++) {
				System.out.print(maximo + "" + (char)caracter + "" + sala[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}