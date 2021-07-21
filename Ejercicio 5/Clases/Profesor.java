package Clases;

import java.util.Random;

import Superclase.Persona;

public class Profesor extends Persona {

//	 Atributos 
	private String materia;

//	 Constructor
	public Profesor () {
		this.edad = generadorEdades();
		this.falta = faltaEnClase();
		this.materia = creaMateria();
	}
	
	// Metodos
//	Funcion que crea una materia aleatoriamente
	private String creaMateria() {
		Random numRandom = new Random();
		String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
		return nombreMateria[(int) (numRandom.nextDouble() * nombreMateria.length)];
	}
	
//	Funcion que genera un numero aleatorio entre 1 y 10 y si es mayor a 8 (20% de falta) 
//	el profesor faltara en clase retornando true.
	public boolean faltaEnClase() {
		boolean sinProfe = false;
		Random numRandom = new Random();
		
		if ((int) (numRandom.nextDouble() * 10 + 1) > 8){
			sinProfe = true;
		}
		return sinProfe;
	}
	
//	Funcion que genera la edad aleatoriamente
	public int generadorEdades() {
		Random numRandom = new Random();
		return (int) (numRandom.nextDouble() * 30 + 20); // De 20 a 50
		
	}

//	Metodo toString
		public String toString() {
			return "Profesor: \n materia: " + materia + 
					"\nNombre: " + nombre + 
					"\nEdad: " + edad + 
					"\nSexo: " + sexo + 
					"\nFalta: " + falta;
		}
		
//	 Getters y Setters
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
}