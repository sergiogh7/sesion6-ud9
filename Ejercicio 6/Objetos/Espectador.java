package Objetos;

public class Espectador {
	
//	Atributos
	private String nombre;
	private int edad;
	private double dinero;
	
//	Constructores
//	Defecto
	public Espectador () {
		this("Blank", 18, 0);
	}
	
//	Con atributos
	public Espectador (String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

//	Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
//	Funciones
//	Funcion que recibe un cine y si el usuario tiene el dinero de la entrada retorna true
	public boolean comprarEntradaPelicula (Cine cine){
		boolean comprar;
		
		if ( getDinero() > cine.getPrecioDeEntrada()){
			comprar = true;
		}else {
			comprar = false;
		}
		return comprar;
	}
	
//	Funcion que recibe una pelicula y retorna true en caso de tener la edad minima
	public boolean edadMinimaCorrecta(Pelicula peli){
		boolean correcto = false;
		
		if ( peli.getEdadMinimaPelicula() < getEdad()){
			correcto = true;
        }
		return correcto;
	}
}