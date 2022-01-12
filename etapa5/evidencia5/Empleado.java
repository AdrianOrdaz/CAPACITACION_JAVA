package evidencia5;

import java.util.*;

public class Empleado {//Clase padre
	//Atributos
	String tipo;//Se refiere a que categoría pertenece (empleado o programador).
	String nombre;
	String cedula;
	int edad;
	String estadoCivil;
	float salario;
	String clasificacion;//Varible donde se guarda el resultado del metodo de clasificación.
	int ec;//Variable auxiliar para determinar el estado civil de la persona.
	static Scanner sc = new Scanner(System.in);//Instancia al Scanner para meter datos por medio del teclado.
	static ArrayList<Empleado> AL = new ArrayList<>();//Instancia del ArrayList donde guardaremos los datos de las personas.
	//Constructor
	public Empleado(String nombre, String cedula, int edad, String estadoCivil, float salario) {
		this.tipo = "Empleado";
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.salario = salario;
	}
	
	//Getters y setters, ayudan a ingresar datos específicos al objeto y también a mostrar la información capturada
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
	
	public void asignarClasficacion(int edad) {//Este método asigna una clasificación según la edad de la persona. Tiene como parámetro la edad.
		if(edad<=21) {//Si es menor o tiene 21 años, se considera principiante.
			clasificacion = "Principiante";
		}
		else if(edad>=22&&edad<=35) {
			clasificacion = "Intermedio";
		}
		else if(edad>35) {
			clasificacion = "Senior";
		}
	}
	
	Empleado añadirEmpleado() {//Este método sirve para crear un empleado, nos retorna un objeto de tipo empleado.
		//Entrada de datos.
		int valid = 0;
		System.out.print("Nombre completo: ");
		String nombre = this.setNombre(sc.nextLine());
		System.out.print("Cedula: ");
		String cedula = this.setCedula(sc.nextLine());
		System.out.print("Edad: ");
		//Proceso de manejo de excepciones, si la entrada sigue siendo incorrecta no saldrá del bloque.
		do {
			try {
				int edad = this.setEdad(Integer.parseInt(sc.nextLine()));
				EdadException oEdadEx = new EdadException();
				oEdadEx.validarEdad(edad);
				valid = 0;
			}catch(EdadException exception) {
				System.out.print(exception.getMessage());
				valid = 1;
			}
		}while(valid==1);
		System.out.print("Estado Civil (0 = soltero o 1 = casado): ");
		//Proceso de manejo de excepciones, si la entrada sigue siendo incorrecta no saldrá del bloque.
		do {
			try {
				ec = Integer.parseInt(sc.nextLine());
				DecisionException oDesEx = new DecisionException();
				oDesEx.validarDecision(ec);
				valid = 1;
			}catch(DecisionException exception) {
				System.out.print(exception.getMessage());
				valid = 0;
			}
		}while(valid==0);
		System.out.print("Salario: ");
		float salario = this.setSalario(Float.parseFloat(sc.nextLine()));
		Empleado e = new Empleado(nombre,cedula,edad,"",salario);//Instanciamos un empleado donde ahora sí le pasaremos los parametros que acabamos de
		//ingresar.
		e.asignarClasficacion(edad);//Primero mandamos a que se clasifique mediante el método visto anteriormente.
		e.edoCivil(ec);//También mandamos la respuesta del estado civil del empleado, a que nos arroje una respuesta entendible para el usuario.
		return e;//Retorna al empleado para que sea agregado al array.
	}
	
	public void edoCivil(int stn) {//Este método nos sirve para darle una mejor vista a nuestros resultados.
		if(stn==1) {//Si escoge esta opción, quiere decir que la persona es casada, por tanto sobreescribe su estado a "casado" en vez de un numero no
			//entendible para el usuario.
			estadoCivil = "Casado";
		}else{//Al contrario, si es soltero, se escribirá "Soltero"
			estadoCivil = "Soltero";
		}
	}
	
	public static void imprimir() {//Método que imprimirá los atributos de las personas registradas, sean empleados o programadores.
		for(int i=0;i<AL.size();i++) {//Va de la posición 0 a la última.
			System.out.println("----------Persona #"+(i+1)+"----------");//Detalle visual.
			Empleado e = AL.get(i);//Obtiene a un empleado según su posición.
			//Mediante los getters, logramos obtener los atributos para poder imprimirlos.
			System.out.println("Categoría: "+e.getTipo());
			System.out.println("Nombre: "+e.getNombre());
			System.out.println("Cedula: "+e.getCedula());
			System.out.println("Edad: "+e.getEdad()+" años");
			System.out.println("Estado civil: "+e.getEstadoCivil());
			System.out.println("Salario: $"+e.getSalario());
			System.out.println("Clasificación: "+e.getClasificacion());
			if(e.getTipo()=="Programador") {//Estas son cosas propias del Programador, por tanto, si no es programador no entra en el condicional
				Programador p = (Programador) AL.get(i);//Toma al programador según su posición.
				System.out.println("Lineas de codigo por hora: "+p.getLineasDeCodigoPorHora());
				System.out.println("Lenguaje dominante: "+p.getLenguajeDominante());
			}
		}
	}
}