package evidencia7;

public class Cocinero implements IProfesion{//Mismos comentarios que en clase Desarrollador.
	String nombre;
	String horasEnEstufa;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorasEnEstufa() {
		return horasEnEstufa;
	}
	public void setHorasEnEstufa(String horasEnEstufa) {
		this.horasEnEstufa = horasEnEstufa;
	}
	@Override
	public void encenderObjeto() {
		System.out.println("Soy el Cocinero "+this.getNombre()+", encend� mi estufa");
	}
	@Override
	public void maniobrarObjeto() {
		System.out.println("Soy el Cocinero "+this.getNombre()+", y llevo m�s de "+this.getHorasEnEstufa()+" horas en la estufa");
	}
	@Override
	public void apagarObjeto() {
		System.out.println("Soy el Cocinero "+this.getNombre()+", apagu� mi estufa");
	}
}
