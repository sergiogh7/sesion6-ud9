package herencia;

import superclase.Electrodomestico;

public class Lavadora extends Electrodomestico{
	
	// Atributo.
	private int carga;
	// Constante, por defecto.
	private final int CARGADEFAULT = 5;
	
	// Constructor por defecto.
	public Lavadora() {
		this.carga = CARGADEFAULT;
	}
	
	// Constructor con precio y peso. Resto por defecto.
	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		this.carga = CARGADEFAULT;
	}
	
	/** Constructor con la carga y el resto de atributos heredados.
	 * precioBase, color, consumoEnergetico, peso heredados de la superclase Electrodomestico.
	 * @param carga Atributo propio para la carga.
	 */
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	// Metodo get de carga
	public int getCarga() {
		return carga;
	}
	
	// Metodo preciofinal.
	protected int precioFinal() {
		int precioBase = super.precioFinal();
		
		if (this.carga > 30) {
		    precioBase += 50;
		}
		
		return precioBase;
	}
	
	public String toString() {
		return super.toString() + "Kg\nCarga: " + getCarga();
	}
	
}
