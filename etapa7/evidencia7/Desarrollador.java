package evidencia7;

public class Desarrollador implements IProfesion{//A nuestras clases les implementaremos la interfaz creada anteriormente, para poder sobreescribir los m�todos.
	//Atributos de la clase.
	String nombre;
	String lineasDeCodigo;
	//M�todos get y set, para el manejo de la clase.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLineasDeCodigo() {
		return lineasDeCodigo;
	}
	public void setLineasDeCodigo(String lineasDeCodigo) {
		this.lineasDeCodigo = lineasDeCodigo;
	}
	//Sobreescribimos los m�todos de la interfaz.
	//Los m�todos imprimen mensajes de las acciones realizadas. 
	@Override
	public void encenderObjeto() {
		System.out.println("Soy el Desarrollador "+this.getNombre()+", encend� mi computadora");
	}
	@Override
	public void maniobrarObjeto() {
		System.out.println("Soy el  Desarrollador " + this.getNombre() + ",  y  llevo  m�s  de "+ this.getLineasDeCodigo() + " l�neas  codificadas");
	}
	@Override
	public void apagarObjeto() {
		System.out.println("Soy el  Desarrollador "+this.getNombre()+", apagu� mi computadora");
	}
	
}
