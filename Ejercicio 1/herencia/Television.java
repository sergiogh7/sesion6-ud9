package herencia;

import superclase.Electrodomestico;

public class Television extends Electrodomestico{
	// Atributos
	private int resolucion;
	private boolean TDT;
	// Defaults
	final private int RESOLUCIONDEFAUT = 20;
	final private boolean TDTDEFAUT = false;
	
	// Constructores
	// Por defecto
	public Television() {
		this.resolucion = RESOLUCIONDEFAUT;
		this.TDT = TDTDEFAUT;
	}
	
	// Precio base y peso, resto default.
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCIONDEFAUT;
		this.TDT = TDTDEFAUT;
	}
	
	// Resolucion, TDT y resto atributos.
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean TDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.TDT = TDT;
	}

	// Getters de resolucion y tDT.
	public int getResolucion() {
		return resolucion;
	}
	
	public boolean getTDT() {
		return TDT;
	}

	// Metodo preciofinal.
	protected int precioFinal() {
		int precioBase = super.precioFinal();
		
		if (this.resolucion > 40) {
			double subida = precioBase * 0.3;
		    precioBase += subida;
		}
		
		if(this.TDT == true) {
			precioBase += 50;
		}
		
		return precioBase;
	}
	
	public String toString() {
		return super.toString() + "Kg\nResolucion: " + getResolucion() + " pulgadas\nTDT: " + getTDT() + ".";
	}
	
}
