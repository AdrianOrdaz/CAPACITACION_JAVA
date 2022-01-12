package evidencia5;

public class EdadException extends Exception{//Clase para la creaci�n de excepciones de tipo fuera de rango

	private static final long serialVersionUID = 1L;
	
	public EdadException() {//Constructor vacio
		
	}

	public EdadException(String mensaje) {//Detecta el mensaje
		super(mensaje);
	}
	
	public EdadException(int edad) throws EdadException{//Manda a validar la entrada
		this.validarEdad(edad);
	}
	
	public void validarEdad(int edad) throws EdadException{//Metodo donde se desarrolla la validaci�n
		if(!(edad>=18 && edad <=45)) {//Condicional de la validaci�n.
			throw new EdadException("La edad capturada no pertenece al rango permitido (18 a 45 a�os), dig�te otra edad: ");
			//Mensaje que aparecer� en caso de salirse del rango.
		}
	}
}
