package evidencia8;

import java.util.ArrayList;

public class Electrodomestico {
	protected int precioBase = 1000;
	protected String color = "BLANCO";
	protected char consumoEnergetico = 'F';
	protected int peso = 5;
	static ArrayList<Electrodomestico> ALE = new ArrayList<>();
	public Electrodomestico() {
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		if(letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
			this.consumoEnergetico = letra;
		}else {
			letra = this.consumoEnergetico;
		}
		return this.consumoEnergetico;
	}
	
	public String comprobarColor(String color) {
		String col = color.toUpperCase();
		if(col.equals("BLANCO")||col.equals("NEGRO")||col.equals("ROJO")||col.equals("AZUL")||col.equals("GRIS")) {
			this.color = col;
		}else {
			color = this.color;
		}
		return this.color;
	}
	
	public int precioFinal(char letra,int peso) {
		int precio = 0;
		switch(letra) {
			case 'A': precio = this.precioBase + 1000; break;
			case 'B': precio = this.precioBase + 800; break;
			case 'C': precio = this.precioBase + 600; break;
			case 'D': precio = this.precioBase + 500; break;
			case 'E': precio = this.precioBase + 300; break;
			case 'F': precio = this.precioBase + 100; break;
		}
		if(peso<=19) {
			precio += 100;
		}else if(peso>=20&&peso<=49) {
			precio += 500;
		}else if(peso>=50&&peso<=79) {
			precio += 800;
		}else if(peso>=80) {
			precio += 1000;
		}
		return precio;
	}
	
	public static void imprimir() {
		int precioTotal = 0;
		int precio = 0;
		for(int i=0;i<ALE.size();i++) {
			Electrodomestico e = ALE.get(i);
			System.out.println("------------------------------------------------");
			System.out.println("Tipo: "+e.getClass().getSimpleName());
			System.out.println("Color: "+e.color);
			System.out.println("Consumo energético: "+e.consumoEnergetico);
			System.out.println("Peso: "+e.peso+" kg");
			if(e.getClass().getCanonicalName()=="evidencia8.Lavadora") {
				Lavadora l = (Lavadora) ALE.get(i);
				System.out.println("Carga: "+l.carga+" kg");
			}
			if(e.getClass().getCanonicalName()=="evidencia8.Television") {
				Television t = (Television) ALE.get(i);
				System.out.println("Resolucion: "+t.resolucion+" pulgadas");
				System.out.println("Sintonizador TDT: "+t.tdt);
			}
			precio = e.precioFinal(e.consumoEnergetico, e.peso);
			System.out.println("Precio final: $"+precio);
			precioTotal += precio;
		}
		System.out.println("------------------------------------------------");
		System.out.println("Precio Total: $"+precioTotal);
	}
}
