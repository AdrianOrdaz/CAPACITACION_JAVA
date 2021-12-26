package evidencia1;

import java.util.Scanner; //Esta librería se importa para poder hacer uso de la entrada de datos por parte del teclado

public class Evidencia_1 {

	public static void main(String[] args) { //Main es donde escribimos nuestro código para que lo trabaje de manera estrcuturada
		
		//Variables
		Scanner sc = new Scanner(System.in);//Hacemos una instancia a Scanner para poder darle entrada de datos a nuestro programa
		String name; //Variable donde guardaremos el nombre del usuario, de tipo cadena
		int ne; //Variable donde guardaremos el numero entero que se le pide al usuario
		double nd,sum; //Variables donde guardaremos el numero decimal que se le pide al usuario y también otra donde se guardará la suma de
					   //las variables anteriores
		
		//En esta parte se imprime el mensaje de lo que se le pide al usuario y se captura en su respectiva variable
		System.out.print("Ingrese su nombre: ");
		name = sc.nextLine();
		System.out.print("Ingrese un numero entero: ");
		ne = sc.nextInt();
		System.out.print("Ingrese un numero decimal: ");
		nd = sc.nextDouble();
		
		sum = ne + nd; //Se realiza la suma de los numeros pedidos anteriormente
		
		System.out.println("Hola "+name+", el resultado de la suma entre "+ne+" y "+nd+" es: "+sum); //Se imprime el mensaje que se solicitó
	}

}
