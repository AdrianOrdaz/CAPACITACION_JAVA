package evidencia4;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
	//Atributos
	static String nombre;
	static String cedula;
	static int edad;
	static String estadoCivil;
	static float salario;
	String clasificacion;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Empleado> AL = new ArrayList<>();
	//Constructor
	public Empleado(String nombre, String cedula, int edad, String estadoCivil, float salario) {
		super();
		Empleado.nombre = nombre;
		Empleado.cedula = cedula;
		Empleado.edad = edad;
		Empleado.estadoCivil = estadoCivil;
		Empleado.salario = salario;
	}
	
	public void asignarClasficacion(int edad) {
		if(edad<=21) {
			clasificacion = "Principiante";
		}
		else if(edad>=22&&edad<=35) {
			clasificacion = "Intermedio";
		}
		else if(edad>35) {
			clasificacion = "Senior";
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		Empleado.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		Empleado.edad = edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		Empleado.estadoCivil = estadoCivil;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		Empleado.salario = salario;
	}

	public String getClasificacion() {
		return clasificacion;
	}
	
	Empleado añadirEmpleado() {
		System.out.print("Nombre completo: ");
		String nombre = sc.nextLine();
		System.out.print("Cedula: ");
		String cedula = sc.nextLine();
		System.out.print("Edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.print("Estado Civil (S = soltero o C = casado): ");
		String estadoCivil = sc.nextLine();
		System.out.print("Salario: ");
		float salario = Float.parseFloat(sc.nextLine());
		Empleado e = new Empleado(nombre,cedula,edad,estadoCivil,salario);
		e.asignarClasficacion(edad);
		return e;
	}
	
	public void imprimir(ArrayList<Empleado> AL) {
		for(Empleado e: AL) {
			System.out.println("Nombre: "+e.getNombre());
			System.out.println("Cedula: "+e.getCedula());
			System.out.println("Edad: "+e.getEdad());
			System.out.println("Estado civil: "+e.getEstadoCivil());
			System.out.println("Salario: "+e.getSalario());
			System.out.println("Clasificación: "+e.getClasificacion());
		}
	}
	
}
