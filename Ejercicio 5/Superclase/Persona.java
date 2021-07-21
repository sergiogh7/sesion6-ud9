package Superclase;

import java.util.Random;

public abstract class Persona {
	
//	Atributos
	protected char sexo;
	protected int edad;
	protected boolean falta;
	protected String nombre;
	
//	Constructor
	public Persona () {
		this.sexo = generadorSexo();
		
		if (sexo == 'H') {
			this.nombre = generaNombreChico();
		}else {
			this.nombre = generaNombreChica();
		}
	}
	
//	 Metodos
	public abstract int generadorEdades();
	public abstract boolean faltaEnClase();
	
//	Funcion que retorna un nombre de chica aleatorio.
	public String generaNombreChica () {
		String[] mujer = {"Sheila", "Yolanda", "Thais", "Estela", "Carmen"};
		Random rnd = new Random();
		
		return mujer[(int) (rnd.nextDouble() * mujer.length)];
	}
	
//	Funcion que retorna un nombre de chico aleatorio.
	public String generaNombreChico () {
		String[] hombre = {"Daniel", "Sergio", "Juan", "Carlos", "Ruben"};
		Random rnd = new Random();
		
		return hombre[(int) (rnd.nextDouble() * hombre.length)];
	}
	
//	Funcion que genera un sexo aleatoriamente.
	private char generadorSexo() {
		// Array que se utilizara para decidir el sexo.
		char[] sexo = {'H', 'M'};
		
		Random numRandom = new Random();
		
		return sexo[(int) (numRandom.nextDouble() * sexo.length)];
	}

//	Getters y Setters
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isFalta() {
		return falta;
	}
	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}