package evidencia8;

public class Lavadora extends Electrodomestico{
	int carga = 5;

	public Lavadora() {
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso,int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	@Override
	public int precioFinal(char letra, int peso) {
		int precio = 0;
		if(this.carga>30) {
			precio = super.precioFinal(letra, peso) + 500;
		}else {
			precio = super.precioFinal(letra, peso);
		}
		return precio;
	}
	
	
}
