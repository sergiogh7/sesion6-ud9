package superclase;

public class Electrodomestico {
	
	// Se pueden heredar.
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	// Por defecto.
	private final String COLORDEFAULT = "Blanco";
	private final char CONSUMODEFAULT = 'F';
	private final int PRECIOBASEDEFAULT = 100;
	private final int PESODEFAULT = 5;
	
	// Constructores.
	// Constructor por defecto.
	public Electrodomestico() {
		this.precioBase = PRECIOBASEDEFAULT;
		this.color = COLORDEFAULT;
		this.consumoEnergetico = CONSUMODEFAULT;
		this.peso = PESODEFAULT;
	}
	
	// Con precio y peso, resto por defecto.
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = COLORDEFAULT;
		this.consumoEnergetico = CONSUMODEFAULT;
		this.peso = peso;
	}
	
	// Todos los atributos.
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		// Comprueba que el color.
		if(compruebaColor(color)) {
			this.color = color;
		}else {
			this.color = COLORDEFAULT;
		}
		
		// Comprueba que letra llega de consumo energetico.
		if(compruebaConsumo(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico = CONSUMODEFAULT;
		}
		
		this.peso = peso;
	}
	
	// Funcion que comprueba que el consumo energetico es correcto, devuelve true o false.
	private boolean compruebaConsumo(char caracter) {
		
		boolean esCorrecto;
		
		String consumoEnergetico = ""+caracter;
		
		// Pasa a lower case.
		consumoEnergetico = consumoEnergetico.toLowerCase();
		
		switch (consumoEnergetico) {
		
		case "a":
			esCorrecto = true;
			break;
			
		case "b":
			esCorrecto = true;
			break;
			
		case "c":
			esCorrecto = true;
			break;
			
		case "d":
			esCorrecto = true;
			break;
			
		case "e":
			esCorrecto = true;
			break;
			
		case "f":
			esCorrecto = true;
			break;

		default:
			esCorrecto = false;
			break;
		}
		
		return esCorrecto;
	}

	// Funcion que comprueba si el color es correcto, devuelve true o false.
	private boolean compruebaColor(String color) {
		
		boolean esCorrecto;
		
		// Pasa el string a lower case.
		color = color.toLowerCase();
		
		// Si el color que llega es blanco, negro, rojo, azul o gris devuelve true.
		switch (color) {
		case "blanco":
			esCorrecto = true;	
			break;
					
		case "negro":
			esCorrecto = true;
			break;
			
		case "rojo":
			esCorrecto = true;
			break;
			
		case "azul":
			esCorrecto = true;
			break;
			
		case "gris":
			esCorrecto = true;
			break;

		default:
			esCorrecto = false;
			break;
		}
		
		return esCorrecto;
		
	}
	
	// Segun consumo energetico, aumentara su precio, y segun su tamaño tambien.
	protected int precioFinal() {
		
		int precioBase = this.precioBase;
		
		// Segun consumo sube precio.
		switch (this.consumoEnergetico) {
				
			case 'A':
				precioBase += 100;
				break;
				
			case 'B':
				precioBase += 80;
				break;
				
			case 'C':
				precioBase += 60;
				break;
				
			case 'D':
				precioBase += 50;
				break;
				
			case 'E':
				precioBase += 30;
				break;
				
			case 'F':
				precioBase += 10;
				break;
			}
		
		// Segun tamaño sube precio.
		if(this.peso >= 0 && this.peso <= 19) {
			precioBase += 10;
			
		}else if(this.peso > 19 && this.peso <= 49) {
			precioBase += 50;
			
		}else if(this.peso > 49 && this.peso <= 79) {
			precioBase += 80;
			
		}else if(this.peso > 80) {
			precioBase += 100;
			
		}
		
		return precioBase;

	}
	
	public String toString() {
		return "Precio: " + getPrecioBase()+ "€.\nColor: " + getColor() + 
				".\nConsumo: " + getConsumoEnergetico() + 
				"\nPeso: " + getPeso();
	}
	
	// Getters y setters.
	public int getPrecioFinal() {
		return precioFinal();
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
}
