package evidencia4;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
	//Atributos
	String tipo;
	String nombre;
	String cedula;
	int edad;
	String estadoCivil;
	float salario;
	String clasificacion;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Empleado> AL = new ArrayList<>();
	//Constructor
	public Empleado(String nombre, String cedula, int edad, String estadoCivil, float salario) {
		this.tipo = "Empleado";
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.salario = salario;
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
	
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	
	public String getCedula() {
		return cedula;
	}

	public String setCedula(String cedula) {
		return this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public int setEdad(int edad) {
		return this.edad = edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String setEstadoCivil(String estadoCivil) {
		return this.estadoCivil = estadoCivil;
	}

	public float getSalario() {
		return salario;
	}

	public float setSalario(float salario) {
		return this.salario = salario;
	}

	public String getClasificacion() {
		return clasificacion;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	Empleado añadirEmpleado() {
		System.out.print("Nombre completo: ");
		String nombre = this.setNombre(sc.nextLine());
		System.out.print("Cedula: ");
		String cedula = this.setCedula(sc.nextLine());
		System.out.print("Edad: ");
		int edad = this.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.print("Estado Civil (S = soltero o C = casado): ");
		String estadoCivil = this.setEstadoCivil(sc.nextLine());
		System.out.print("Salario: ");
		float salario = this.setSalario(Float.parseFloat(sc.nextLine()));
		Empleado e = new Empleado(nombre,cedula,edad,estadoCivil,salario);
		e.asignarClasficacion(edad);
		return e;
	}
	
	public static void imprimir() {
		for(int i=0;i<AL.size();i++) {
			System.out.println("----------Persona #"+(i+1)+"----------");
			Empleado e = AL.get(i);
			System.out.println("Categoría: "+e.getTipo());
			System.out.println("Nombre: "+e.getNombre());
			System.out.println("Cedula: "+e.getCedula());
			System.out.println("Edad: "+e.getEdad()+" años");
			System.out.println("Estado civil: "+e.getEstadoCivil());
			System.out.println("Salario: $"+e.getSalario());
			System.out.println("Clasificación: "+e.getClasificacion());
			if(e.getTipo()=="Programador") {
				Programador p = (Programador) AL.get(i);
				System.out.println("Lineas de codigo por hora: "+p.getLineasDeCodigoPorHora());
				System.out.println("Lenguaje dominante: "+p.getLenguajeDominante());
			}
		}
	}
}
