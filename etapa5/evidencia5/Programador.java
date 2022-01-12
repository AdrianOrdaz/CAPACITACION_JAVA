package evidencia5;

public class Programador extends Empleado {//Clase hija, hereda de Empleado
	//Atributos únicos.
	int lineasDeCodigoPorHora;
	String lenguajeDominante;
	//Constructor
	public Programador(String nombre, String cedula, int edad, String estadoCivil, float salario, int lineasDeCodigoPorHora, String lenguajeDominante){
		super(nombre, cedula, edad, estadoCivil, salario);
		this.tipo = "Programador";
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	//Getters y setters
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
	@Override //Se utiliza para sobreescribir métodos, en este caso sobreescribiremos añadirEmpleado() para poder añadir cosas propias de un programador
	Programador añadirEmpleado() {
		super.añadirEmpleado();//Primero recorre el método original
		System.out.print("Lineas de código por hora: ");//Se piden los datos propios de la clase.
		int lineasDeCodigoPorHora = this.setLineasDeCodigoPorHora(Integer.parseInt(sc.nextLine()));
		System.out.print("Lenguaje dominante: ");
		String lenguajeDominante = this.setLenguajeDominante(sc.nextLine());
		Programador pro = new Programador(nombre,cedula,edad,"",salario,lineasDeCodigoPorHora,lenguajeDominante);//Instanciamos a un programador donde le
		//pasamos los parámetros conseguidos.
		pro.asignarClasficacion(edad);//También son clasificados según su edad.
		pro.edoCivil(ec);//Y también se detalla su estado civil.
		return pro;//Regresa un objeto de tipo Programador.
	}
}