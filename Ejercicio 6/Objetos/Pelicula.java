package Objetos;

public class Pelicula {

	// Atributos
	private String titulo;
	private String nombreDirector;
	private int duracion;
	private int edadMinimaPelicula;
	
//	Constructores
	
//	Defecto
	public Pelicula () {
		this.titulo = "";
		this.edadMinimaPelicula = 0;
		this.duracion = 0;
		this.nombreDirector = "";
	}
	
//	Con atributos
	public Pelicula(String titulo, int duracion, int edadMinima, String nombreDirector) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinimaPelicula = edadMinima;
		this.nombreDirector = nombreDirector;
	}
	
	//	Metodo toString
	public String toString() {
		return "Titulo:" + titulo + 
				"\nDuracion:" + duracion + 
				"\nEdad minima:" + edadMinimaPelicula + 
				"\nDirector:" + nombreDirector;
	}
	
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNombreDirector() {
		return nombreDirector;
	}
	public void setNombreDirector(String director) {
		this.nombreDirector = director;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinimaPelicula() {
		return edadMinimaPelicula;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinimaPelicula = edadMinima;
	}
}