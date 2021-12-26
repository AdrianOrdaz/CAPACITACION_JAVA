package evidencia2;

import java.util.Scanner;

public class Evidencia_2 {
	
	//Este método nos sirve para calcular la circunferencia de un circulo, para esto, solo pedimos como parámetro el radio de este (entero).
	public static void calcularCircunferencia(int radio) {
		double c; //Variable donde guardaremos el valor de la circunferencia
		c = (Math.PI)*(radio * 2); //Formula para calcular la circunferencia, Math.PI (constante) nos da el valor de PI, a esto le multiplicamos 2 veces el radio (diametro)
		System.out.println(c); //Se imprime el resultado
	}
	
	//Este método nos sirve para calcular el area de un circulo, donde solo pedimos como parámetro el radio de este.
	public static void calcularArea(int radio) {
		double a; //Variable donde se guardará el valor del área.
		a = (Math.PI)*(Math.pow(radio, 2)); //Formula para calcular el área, Se multiplica PI por el radio al cuadraro (Math.pow() calcula potencias)
		System.out.println(a); //Se imprime el resultado
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Entrada de datos
		int radio; //Variable donde se guardará el radio
		
		//Se pide el dato con el que se trabajará
		System.out.println("Ingrese el valor del radio: ");
		radio = sc.nextInt();
		
		System.out.println("Circunferencia:");
		calcularCircunferencia(radio); //Se llama al método con el que se trabajará, se adjunta el parámetro que se pide
		
		System.out.println("Area:");
		calcularArea(radio);//Se llama al método con el que se trabajará, se adjunta el parámetro que se pide
	}

}
