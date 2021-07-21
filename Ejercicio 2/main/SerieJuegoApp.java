package main;

import java.util.Iterator;

import clases.Serie;
import clases.Videojuego;

public class SerieJuegoApp {

	public static void main(String[] args) {
		
		// Arrays de series y videojuegos.
		Serie series[] = new Serie[5];
		Videojuego juegos[] = new Videojuego[5];
		
		// Rellena array de series.
		series[0] = new Serie("Everybody hates Chris", 4, "Comedia de situacion", "Andrew Orenstein");
		series[1] = new Serie("The Big Bang Theory", 12, "Comedia de situacion", "Steven Molaro.\nMike Collier.\nFaye Oshima Belyeu");
		series[2] = new Serie("The Sopranos", 6, "Drama", "David Chase");
		series[3] = new Serie("The Simpsons", 32, "Comedia de situacion", "Matt Groening");
		series[4] = new Serie("Breaking Bad", 5, "Drama criminal.\nSuspenso.\nNeo-Wéstern.\nHumor negro.\nTragedia", "Vince Gilligan");
		
		// Rellena array de juegos.
		juegos[0] = new Videojuego("Tony Hawk's Pro Skater 2", 28, "Skateboard", "Neversoft");
		juegos[1] = new Videojuego("Road Rash", 20, "Carreras de motos", "Electronic Arts");
		juegos[2] = new Videojuego("Grand Theft Auto V", 32, "Accion", "Rockstar Games");
		juegos[3] = new Videojuego("Fallout 4", 27, "Rol de accion", "Bethesda Game Studios");
		juegos[4] = new Videojuego("Need For Speed Underground", 13, "Carreras callejeras", "Electronic Arts");

		// Entregando algunas series y juegos.
		series[1].entregar();
		series[2].entregar();
		series[4].entregar();
		// ------
		juegos[3].entregar();
		
		System.out.println("Hay " + cuentaSeriesEntregadas(series) + " series entregadas.");
		System.out.println("Hay " + cuentaJuegosEntregados(juegos) + " juegos entregados.");
		
		// No termino de entender como sacar el que mas horas tiene de todo el array.
		juegos[0].compareTo(juegos[1]);
		series[4].compareTo(series[2]);
		
	}
	
	// Cuenta las series entregadas
	public static int cuentaSeriesEntregadas (Serie[] a) {
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].isEntregado()) {
				counter++;
			}
		}
		return counter;
	}
	// Cuenta los juegos entregados.
	public static int cuentaJuegosEntregados (Videojuego[] a) {
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].isEntregado()) {
				counter++;
			}
		}
		return counter;
	}
}
