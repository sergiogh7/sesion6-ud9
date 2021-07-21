package libro;

public class Libro {
	
	// Atributos.
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	// Constructor.
	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	// Metodo toString.
	public String toString() {
		return "El libro " +getTitulo()+ " con ISBN " +getisbn()+ ",\ncreado por el autor " 
				+getAutor()+ " tiene " +getNumeroPaginas()+ " paginas.\n";
	}
	
	// Getters y Setters.
	public String getisbn() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
}
