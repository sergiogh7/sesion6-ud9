package Clases;

import java.util.Random;

import Superclase.Persona;

public class Estudiante extends Persona {

//	Atributos
	private int nota;

//	Constructor
	public Estudiante () {
		this.edad = generadorEdades();
		this.nota = generadorNotas();
		this.falta = faltaEnClase();
	}

//	Metodos	
//	Funcion que genera una edad al azar
	public int generadorEdades() {
		Random numRandom = new Random();
		return (int) (numRandom.nextDouble() * 5 + 12);
	}
	
//	Funcion que genera una nota al azar de 0 a 10.
	public int generadorNotas() {
		Random numRandom = new Random();
		return (int) (numRandom.nextDouble() * 11);
	}
	
//	Funcion que genera un numero random y si es mayor a 5 el alumno falta a clase.
	public boolean faltaEnClase() {
		
		boolean ausente = false;
		
		Random numRandom = new Random();
//		Castea el resultado a integer
		if ((int) (numRandom.nextDouble() * 10 + 1) > 5) {
			ausente = true;
			
		}
		
		return ausente;
	}

//	Metodo toString
	public String toString() {
		return "Estudiante:\n Nota: " + nota + 
				"\n Nombre: " + nombre + 
				"\n Edad: " + edad + 
				"\n Sexo: " + sexo + 
				"\n Ausente en clase: " + falta + ".";
	}
	
//	Getters y Setters
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}