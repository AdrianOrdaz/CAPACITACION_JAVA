package evidencia5;

public class Run extends Empleado{//Esta clase es donde nuestro programa cobrar� vida, primero se hered� de Empleado para obtener ciertas cosas que se
	//necesitan para correr.
	//Al ser Empleado un constructor y heredar de este, se nos pide escribir un constructor tambi�n, sin embargo para esta clase no la ocuparemos.
	public Run(String nombre, String cedula, int edad, String estadoCivil, float salario) {
		super(nombre, cedula, edad, estadoCivil, salario);
	}

	public static void main(String[] args) {
		int res = 0,tipo = 0,valid=0;//Variables que guardaran respuestas num�ricas
		//do-while para correr el algoritmos tantas veces se requieran
		do {
			System.out.println("�A qu� clase pertenece? (0=Empleado o 1=Programador): ");
			//Proceso de manejo de excepciones, si la entrada sigue siendo incorrecta no saldr� del bloque.
			do {
				try {
					tipo = Integer.parseInt(sc.nextLine());//Pregunta para saber a que tipo pertenece y dirijirlo hacia all�.
					DecisionException oDesEx = new DecisionException();
					oDesEx.validarDecision(tipo);
					valid=0;
				}catch(DecisionException ex) {
					System.out.print(ex.getMessage());
					valid=1;
				}
			}while(valid==1);
			if(tipo==0) {//Si escogi� Empleado, se le dirijir� hacia el formulario indicado.
				Empleado emp = new Empleado(null, null, 0,null, (float)0.0);//Instancia de un empleado, par�metros vacios debido a que no se ocupar�
				//para crear un empleado.
				AL.add(emp.a�adirEmpleado());//Aqui el arraylist a�adir� el objeto (Empleado) que arroje el m�todo "a�adirEmpleado()", para llamarlo
				//se us� de la instancia anterior.
			}else {//Si escogi� la segunda opci�n realizar� el mismo proceso, pero llenar� otro tipo de informaci�n.
				Programador pro = new Programador(null,null, 0, null, (float) 0.0, 0,null);
				AL.add(pro.a�adirEmpleado());
			}
			System.out.println("�Desea agregar otra persona? \n0.-Si\n1.-No");
			//Proceso de manejo de excepciones, si la entrada sigue siendo incorrecta no saldr� del bloque.
			do {
				try {
					res = Integer.parseInt(sc.nextLine());
					DecisionException oDesEx = new DecisionException();
					oDesEx.validarDecision(res);
					valid=1;
				}catch(DecisionException ex) {
					System.out.print(ex.getMessage());
					valid=0;
				}
			}while(valid==0);		
		}while(res==0);//Pregunta y entrada de datos para ver si continua a�adiendo o termina el programa con la impresi�n del Array.
		imprimir();//LLama al m�todo imprimir() que se encuentra en la clase Empleado.
	}
}
