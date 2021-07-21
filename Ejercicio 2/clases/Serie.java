package clases;

import java.util.Iterator;

import Interface.Entregable;

public class Serie implements Entregable{
	// Atributos.
	protected String titulo;
	protected int numeroTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	// Atributos por defecto.
	private final int NUMTEMPORADASDEFAULT=3;
	private final boolean ENTREGADODEFAULT=false;
	
	// Constructores.
	// Por defecto
	public Serie() {
		this.titulo="";
		this.numeroTemporadas = NUMTEMPORADASDEFAULT;
		this.entregado = ENTREGADODEFAULT;
		this.genero="";
		this.creador="";
	}
	// Con titulo y creador, resto por defecto.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = NUMTEMPORADASDEFAULT;
		this.entregado = ENTREGADODEFAULT;
		this.genero="";
		this.creador="";
	}
	// Con todos los atributos excepto el de entregado.
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	// Metodos.
	// Metodo toString()
	public String toString() {
		return "Titulo: "+getTitulo()+ "."
				+ "\nNumero de temporadas: " +getNumeroTemporadas()+ "."
				+ "\nGenero: " +getGenero()+ "."
				+ "\nCreador: " +getCreador()+".\n";
	}
	
	// Metodos de la interface Entregable.
	// Cambia el atributo a true.
	public void entregar() {
		this.entregado = true;
	}
	// Cambia el atributo a false
	public void devolver() {
		this.entregado = false;
	}
	// Devuleve el estado del atributo.
	public boolean isEntregado() {
		return entregado;
	}
	
	// Metodo compareTo
	public void compareTo(Object serieComparar ) {
		if (serieComparar instanceof Serie) {
			System.out.println("La serie tiene " + this.numeroTemporadas + " temporadas "
					+ "y la serie a comparar tiene " + ((Serie) serieComparar).getNumeroTemporadas());
		}
	}
	
	// Getters y Setters.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public boolean getEntregado() {
		return entregado;
	}

}
