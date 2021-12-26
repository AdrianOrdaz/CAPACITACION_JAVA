package evidencia4;

import java.util.ArrayList;

public class Programador extends Empleado {
	static int lineasDeCodigoPorHora;
	static String lenguajeDominante;
	
	public Programador(String nombre, String cedula, int edad, String estadoCivil, float salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, cedula, edad, estadoCivil, salario);
		Programador.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		Programador.lenguajeDominante = lenguajeDominante;
	}

	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}

	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		Programador.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		Programador.lenguajeDominante = lenguajeDominante;
	}
	
	@Override
	Empleado añadirEmpleado() {	
		super.añadirEmpleado();
		System.out.print("Lineas de código por hora: ");
		int lineasDeCodigoPorHora = Integer.parseInt(sc.nextLine());
		System.out.print("Lenguaje dominante: ");
		String lenguajeDominante = sc.nextLine();
		Programador pro = new Programador(nombre,cedula,edad,estadoCivil,salario,lineasDeCodigoPorHora,lenguajeDominante);
		pro.asignarClasficacion(edad);
		return pro;
	}

	@Override
	public void imprimir(ArrayList<Empleado> AL) {
		super.imprimir(AL);
		for(int i=0;i<AL.size();i++) {
			System.out.println("Lineas de codigo por hora: "+this.getLineasDeCodigoPorHora());
			System.out.println("Lenguaje dominante: "+this.getLenguajeDominante());
		}
	}

	public static void main(String[] args) {
		int res;
		do {	
			System.out.println("¿A qué clase pertenece? (0=Empleado o 1=Programador): ");
			int tipo = Integer.parseInt(sc.nextLine());
			if(tipo==0) {
				Empleado emp = new Empleado(nombre, cedula, edad, estadoCivil, salario);
				AL.add(emp.añadirEmpleado());
			}else {
				Programador pro = new Programador(nombre, cedula, edad, estadoCivil, salario,lineasDeCodigoPorHora,lenguajeDominante);
				AL.add(pro.añadirEmpleado());
			}
			System.out.println("¿Desea agregar otra persona? \n1.-Si\n2.-No");
			res = Integer.parseInt(sc.nextLine());
		}while(res==1);
		//imprimir();
	}

}
