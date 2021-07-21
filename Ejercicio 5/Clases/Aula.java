package Clases;

import java.util.Random;

public class Aula {

//	Atributos
	private int id;
	private String materia;
	private Estudiante[] estudiante;
	private Profesor profesor;
	
//	Constante para el maximo.
	private final int NUM_MAX = 30;
	
//	Constructor
	public Aula () {
		this.id = 1;
		this.materia = creadorMaterias();
		this.estudiante = new Estudiante[NUM_MAX];
		this.profesor = new Profesor();
		creadorDeEstudiantes();
	}
	
//	Crea un estudiante
	private void creadorDeEstudiantes() {
		for (int i = 0; i < estudiante.length; i++) {
			estudiante[i] = new Estudiante();
			
		}
	}
	
//	Funcion que cuenta los alumnos que faltan
	private boolean pasarListaAlumnos() {
		int numeroAlumnos = 0;
		
		for (int i = 0; i < estudiante.length; i++) {
			if (estudiante[i].isFalta()) {
				numeroAlumnos++;
			}
		}
		
		System.out.println("Faltan " + numeroAlumnos + " alumnos.");
		
		// Retorna true si falta la mitad de clase o mas.
		return numeroAlumnos >= ((int) (estudiante.length / 2));
	}
	
//	Funcion que crea una materia al azar
	private String creadorMaterias() {
		Random numRandom = new Random();

		// Array con las materias
		String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
		
		// Crea un numero al azar que se retorna dentro del array de materias.
		return nombreMateria[(int) (numRandom.nextDouble() * nombreMateria.length)];
	}
	
//	Funcion que retorna true si hay clase o no
	public boolean hayClase() {
		boolean tocaClase = true;
		
		if (profesor.isFalta()) {
			System.out.println("Falta el profesor.");
			tocaClase = false;
			
		}else if (pasarListaAlumnos()) {
			System.out.println("Falta mas del 50% de la clase!");
			tocaClase = false;
			
		}else if (!profesor.getMateria().equals(materia)) {
			System.out.println("Las materias del profesor y del aula no son iguales!");
			tocaClase = false;
			
		}
		return tocaClase;
	}
	
//	Metodo toString
	public String toString() {
		return "Aula: \nID: " + id + 
				"\n Materia: " + materia;
	}
	
//	Getters setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
}