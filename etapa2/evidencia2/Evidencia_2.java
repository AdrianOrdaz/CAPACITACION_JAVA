package evidencia2;

import java.util.Scanner;

public class Evidencia_2 {
	
	//Este m�todo nos sirve para calcular la circunferencia de un circulo, para esto, solo pedimos como par�metro el radio de este (entero).
	public static void calcularCircunferencia(int radio) {
		double c; //Variable donde guardaremos el valor de la circunferencia
		c = (Math.PI)*(radio * 2); //Formula para calcular la circunferencia, Math.PI (constante) nos da el valor de PI, a esto le multiplicamos 2 veces el radio (diametro)
		System.out.println(c); //Se imprime el resultado
	}
	
	//Este m�todo nos sirve para calcular el area de un circulo, donde solo pedimos como par�metro el radio de este.
	public static void calcularArea(int radio) {
		double a; //Variable donde se guardar� el valor del �rea.
		a = (Math.PI)*(Math.pow(radio, 2)); //Formula para calcular el �rea, Se multiplica PI por el radio al cuadraro (Math.pow() calcula potencias)
		System.out.println(a); //Se imprime el resultado
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Entrada de datos
		int radio; //Variable donde se guardar� el radio
		
		//Se pide el dato con el que se trabajar�
		System.out.println("Ingrese el valor del radio: ");
		radio = sc.nextInt();
		
		System.out.println("Circunferencia:");
		calcularCircunferencia(radio); //Se llama al m�todo con el que se trabajar�, se adjunta el par�metro que se pide
		
		System.out.println("Area:");
		calcularArea(radio);//Se llama al m�todo con el que se trabajar�, se adjunta el par�metro que se pide
	}

}
