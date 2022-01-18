package evidencia8;

public class Television extends Electrodomestico{
	int resolucion = 20;
	boolean tdt = false;
	
	public Television() {
	}

	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	@Override
	public int precioFinal(char letra, int peso) {
		int precio = 0;
		int precioR = 0;
		int precioE = super.precioFinal(letra, peso);
		if(this.tdt&&this.resolucion>40) {
			double p = precioE * .3;
			precioR = (int) (p + precioE);
			precio = precioR + 500;
		}else if(this.tdt&&this.resolucion<40) {
			precio = precioE + 500;
		}else if(this.tdt==false&&this.resolucion>40) {
			double p = precioE * .3;
			precioR = (int) (p + precioE);
			precio = precioR;
		}else {
			precio=precioE;
		}
		return precio;
	}
	
	
}
