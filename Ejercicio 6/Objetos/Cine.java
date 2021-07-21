package Objetos;

public class Cine {
	
//	Atributos
	private Pelicula peliculaActiva;
	private double precioDeEntrada;
	
//	Limite
	public Cine() {
		this(new Pelicula(), 10);
	}
	
//	Constructor
	public Cine(Pelicula pelicula, double precio) {
		this.peliculaActiva = pelicula;
		this.precioDeEntrada = precio;
	}
	
//	Getters y Setters.
	public Pelicula getPeliculaActiva() {
		return peliculaActiva;
	}
	public void setPeliculaActiva(Pelicula peliculaActiva) {
		this.peliculaActiva = peliculaActiva;
	}

	public double getPrecioDeEntrada() {
		return precioDeEntrada;
	}
	public void setPrecioDeEntrada(double precioDeEntrada) {
		this.precioDeEntrada = precioDeEntrada;
	}
}