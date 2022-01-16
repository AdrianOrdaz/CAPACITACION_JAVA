package evidencia7;

public class InterfacesAOR {
	//Desde este programa hacemos llamadas a las clases para correr los métodos.
	public static void main(String[] args) {
		//Primero instanciamos las clases que ocuparemos.
		Desarrollador des = new Desarrollador();
		Piloto pil = new Piloto();
		Cocinero coc = new Cocinero();
		
		//Estos pasos es darles entrada a cada clase e iniciar los metodos.
		des.setNombre("Adrian");
		des.setLineasDeCodigo("1000");
		des.encenderObjeto();
		des.maniobrarObjeto();
		des.apagarObjeto();
		System.out.println("-----------------------------------------");
		
		pil.setNombre("Javier");
		pil.setAniosVolando("10");
		pil.encenderObjeto();
		pil.maniobrarObjeto();
		pil.apagarObjeto();
		System.out.println("-----------------------------------------");
	
		coc.setNombre("Juan");
		coc.setHorasEnEstufa("10");
		coc.encenderObjeto();
		coc.maniobrarObjeto();
		coc.apagarObjeto();
		System.out.println("-----------------------------------------");
	}

}
