package clases;

import Interface.Entregable;

public class Videojuego implements Entregable{
	// Atributos.
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String companyia;
	// Atributos por defecto.
	protected final int HORASESTIMADASDEFAULT=10;
	protected final boolean ENTREGADODEFAULT=false;
	
	// Constructores.
	// Por defecto.
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORASESTIMADASDEFAULT;
		this.genero = "";
		this.companyia = "";
	}
	// Con titulo y horas estimadas .Resto por defecto
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.companyia = "";
	}
	// Con todos los atributos excepto entregado.
	public Videojuego(String titulo, int horasEstimadas, String genero, String companyia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.companyia = companyia;
	}
	
	// Metodos.
	// Metodo toString()
	public String toString() {
		return "Titulo: " +getTitulo()+ "."
				+ "\nHoras estimadas: " +getHorasEstimadas()+ "."
				+ "\nGenero: " +getGenero()+ "."
				+ "\nCompañia: " +getCompanyia()+ ".\n";
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
	public void compareTo(Object juegoComparar) {
		if (juegoComparar instanceof Videojuego) {
			System.out.println("El videojuego " + this.horasEstimadas + " horas "
					+ "y el videojuego a comparar tiene " + ((Videojuego) juegoComparar).getHorasEstimadas());
		}
	}
	
	// Getters y Setters.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompanyia() {
		return companyia;
	}
	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}
	public boolean getEntregado() {
		return entregado;
	}
	
}
