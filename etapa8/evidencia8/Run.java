package evidencia8;


public class Run extends Electrodomestico{

	public static void main(String[] args) {
		Television t = new Television(1000,"BLANCO",'A',15,20,true);
		Lavadora l = new Lavadora(1000,"Azul",'b',30,5);
		Electrodomestico ele = new Electrodomestico(1000,"rojo",'C',35);
		
		Television t1 = new Television(1000,"NEGRO",'D',40,10,false);
		Lavadora l1 = new Lavadora(1000,"Gris",'e',45,35);
		Electrodomestico ele1 = new Electrodomestico(1000,"blanco",'f',50);
		
		ALE.add(t);
		ALE.add(l);
		ALE.add(ele);
		ALE.add(t1);
		ALE.add(l1);
		ALE.add(ele1);
		
		imprimir();
	}
}
