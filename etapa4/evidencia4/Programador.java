package evidencia4;

public class Programador extends Empleado {
	int lineasDeCodigoPorHora;
	String lenguajeDominante;
	
	public Programador(String nombre, String cedula, int edad, String estadoCivil, float salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, cedula, edad, estadoCivil, salario);
		this.tipo = "Programador";
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}

	public int setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		return this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public String setLenguajeDominante(String lenguajeDominante) {
		return this.lenguajeDominante = lenguajeDominante;
	}
	
	@Override
	Programador añadirEmpleado() {
		super.añadirEmpleado();
		System.out.print("Lineas de código por hora: ");
		int lineasDeCodigoPorHora = this.setLineasDeCodigoPorHora(Integer.parseInt(sc.nextLine()));
		System.out.print("Lenguaje dominante: ");
		String lenguajeDominante = this.setLenguajeDominante(sc.nextLine());
		Programador pro = new Programador(nombre,cedula,edad,estadoCivil,salario,lineasDeCodigoPorHora,lenguajeDominante);
		pro.asignarClasficacion(edad);
		return pro;
	}

	public static void main(String[] args) {
		int res,tipo;
		Empleado emp = null;
		Programador pro = null;
		do {	
			System.out.println("¿A qué clase pertenece? (0=Empleado o 1=Programador): ");
			tipo = Integer.parseInt(sc.nextLine());
			if(tipo==0) {
				emp = new Empleado(null, null, 0, null, (float)0.0);
				AL.add(emp.añadirEmpleado());
			}else {
				pro = new Programador(null,null, 0, null, (float) 0.0, 0,null);
				AL.add(pro.añadirEmpleado());
			}
			System.out.println("¿Desea agregar otra persona? \n1.-Si\n2.-No");
			res = Integer.parseInt(sc.nextLine());
		}while(res==1);
		imprimir();
	}
}