package evidencia7;

public class Piloto implements IProfesion{//Mismos comentarios que en clase Desarrollador.
	String nombre;
	String aniosVolando;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAniosVolando() {
		return aniosVolando;
	}
	public void setAniosVolando(String aniosVolando) {
		this.aniosVolando = aniosVolando;
	}
	@Override
	public void encenderObjeto() {
		System.out.println("Soy el Piloto "+this.getNombre()+", encendí mi nave");
	}
	@Override
	public void maniobrarObjeto() {
		System.out.println("Soy el Piloto "+this.getNombre()+",  y  llevo  más de "+this.getAniosVolando()+" años  volando.");
	}
	@Override
	public void apagarObjeto() {
		System.out.println("Soy el Piloto "+this.getNombre()+",  apagué  mi  nave");
	}
}
