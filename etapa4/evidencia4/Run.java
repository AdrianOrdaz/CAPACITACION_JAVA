package evidencia4;

public class Run extends Empleado{//Esta clase es donde nuestro programa cobrará vida, primero se heredó de Empleado para obtener ciertas cosas que se
	//necesitan para correr.
	//Al ser Empleado un constructor y heredar de este, se nos pide escribir un constructor también, sin embargo para esta clase no la ocuparemos.
	public Run(String nombre, String cedula, int edad, String estadoCivil, float salario) {
		super(nombre, cedula, edad, estadoCivil, salario);
	}

	public static void main(String[] args) {
		int res,tipo;//Variables que guardaran respuestas numéricas
		//do-while para correr el algoritmos tantas veces se requieran
		do {
			System.out.println("¿A qué clase pertenece? (0=Empleado o 1=Programador): ");
			tipo = Integer.parseInt(sc.nextLine());//Pregunta para saber a que tipo pertenece y dirijirlo hacia allá.
			if(tipo==0) {//Si escogió Empleado, se le dirijirá hacia el formulario indicado.
				Empleado emp = new Empleado(null, null, 0,null, (float)0.0);//Instancia de un empleado, parámetros vacios debido a que no se ocupará
				//para crear un empleado.
				AL.add(emp.añadirEmpleado());//Aqui el arraylist añadirá el objeto (Empleado) que arroje el método "añadirEmpleado()", para llamarlo
				//se usó de la instancia anterior.
			}else {//Si escogió la segunda opción realizará el mismo proceso, pero llenará otro tipo de información.
				Programador pro = new Programador(null,null, 0, null, (float) 0.0, 0,null);
				AL.add(pro.añadirEmpleado());
			}
			System.out.println("¿Desea agregar otra persona? \n1.-Si\n2.-No");
			res = Integer.parseInt(sc.nextLine());
		}while(res==1);//Pregunta y entrada de datos para ver si continua añadiendo o termina el programa con la impresión del Array.
		imprimir();//LLama al método imprimir() que se encuentra en la clase Empleado.
	}
}
