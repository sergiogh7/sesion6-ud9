package app;

import libro.Libro;

public class LibroApp{
	
	public static void main(String[] args) {
		
		// Instanciando 2 libros.
		Libro libro1 = new Libro("1935794618526", "El mensaje de otros mundos", "Eduardo Pons Prades", 273);
		Libro libro2 = new Libro("7419438517648", "Roswell Secreto de Estado", "Javier Sierra", 320);
		
		// Info de los 2 libros.
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		// Muestra el libro con mas paginas.
		libroConMasPaginas(libro1, libro2);
	}
	
	// Recibe dos libros, muestra cual tiene mas paginas de los dos.
	public static void libroConMasPaginas(Libro libro1, Libro libro2) {
		if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println("El libro con mas paginas es: " + libro1.getTitulo() + " con " + libro1.getNumeroPaginas() + " paginas.");
		}else {
			System.out.println("El libro con mas paginas es " + libro2.getTitulo() + " con " + libro2.getNumeroPaginas() + " paginas.");
		}
	}
}
