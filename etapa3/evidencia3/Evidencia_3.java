package evidencia3;

import java.util.*; //Esta libreria importa todos lo que ocuparemos para desarrollar el programa.

public class Evidencia_3 {

	public static void main(String[] args) {
		ArrayList<Persona> ALP = new ArrayList<>();//En un ArrayList guardaremos a las personas registradas.
		Scanner sc = new Scanner(System.in);
		int c=1,res,sum=0;//Variables

		//Ciclo do-while para repetir el proceso de registro de una persona.
		do {
			System.out.println("Ingrese la información de la persona #"+c);//Mensaje que muestra la posición de la persona agregada.
			//Proceso de entrada de datos
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Edad: ");
			int edad = Integer.parseInt(sc.nextLine());
			System.out.print("Estado Civil (0= soltero o 1= casado): ");
			int ec = Integer.parseInt(sc.nextLine());
			System.out.print("Sexo (0= masculino o 1= femenino): ");
			int sexo = Integer.parseInt(sc.nextLine());
			
			Persona Psn = new Persona(nombre,edad,ec,sexo);//Instancia a la clase persona para añadir una nueva, pasandole como parámetros, los
			//datos anteriormente pedidos.
			ALP.add(Psn);//Se agrega el objeto persona recién creado al ArrayList
			
			//Pregunta para agregar una nueva persona o terminar el proceso y mostrar resultados
			System.out.println("¿Desea agregar otra persona? \n1.-Si\n2.-No");
			res = Integer.parseInt(sc.nextLine());
			c++;//Contador del ciclo
		}while(res==1);	
		
		int n=ALP.size();//Se guarda en una variable el tamaño del arraylist.
		System.out.println("Total de personas: "+n);//Se imprime el resultado mediante el tamaño del array.
		
		float s = 0,m = 0,ca=0,so=0,ca1=0,so1=0;//Variables contadoras para realizar los calculos correspondientes.
		
		//Ciclo for donde obtendremos los datos sobre los resultados que se nos piden
		for(int i = 0; i < n; i++) {//Va desde 0 hasta el final del arraylist.
			Persona p = ALP.get(i);//Obtiene un objeto (una persona) según la posición (index) en la que se encuentre el ciclo.
			sum += p.age_p;//Suma las edades de las personas del arreglo, una por una.
			//Este condicional manda al programa hacia el conteo de hombres o mujeres (según sea el caso) del arreglo.
			if(p.sex_p==0) {//Si es hombre, toma este camino.
				s++;//Conteo de los hombres de la lista.
				//Este condicional dirije el conteo según el estado civil del hombre.
				if(p.ec_p==0) {//Si es soltero, toma este camino.
					so++;//Conteo de hombres solteros.
				}else {//Si es casado, toma este camino.
					ca++;//Conteo de los hombres casados. 
				}
			}else {//Si es mujer, toma este camino.
				//Mismo algoritmo que arriba.
				m++;
				if(p.ec_p==0) {
					so1++;
				}else {
					ca1++;
				}
			}
		}
		//Impresión de resultados
		System.out.println("Promedio de edad de las personas registradas: "+(sum/n));//Suma de todas las edades entre el total de personas de la lista. (Promedio)
		System.out.println("Porcentaje de hombres registrados: "+((s/n)*100));//Conteo de hombres entre el total de personas por 100.(%)
		System.out.println("Porcentaje de mujeres registradas: "+((m/n)*100));
		System.out.println("Porcentaje de hombres solteros registrados: "+((so/s)*100));//Conteo de hombres solteros entre el total de hombres (%)
		System.out.println("Porcentaje de mujeres solteras registradas: "+((so1/m)*100));
		System.out.println("Porcentaje de hombres casados registrados: "+((ca/s)*100));//Conteo de hombres casados entre el total de hombres. (%)
		System.out.println("Porcentaje de mujeres casadas registradas: "+((ca1/m)*100));
	}
}