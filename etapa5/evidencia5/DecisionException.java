package evidencia5;

public class DecisionException extends Exception{//Clase para la creación de excepciones de tipo decision

	private static final long serialVersionUID = 1L;
	
	public DecisionException() {//Constructor vacio
		
	}
	
	public DecisionException(String mensaje) {//Agarra el mensaje
		super(mensaje);
	}
	
	public DecisionException(int decisionNumber) throws DecisionException{//Manda a validar la decision
		this.validarDecision(decisionNumber);
	}
	
	public void validarDecision(int decisionNumber) throws DecisionException{//Método donde se desarrolla el proceso de validación
		if(decisionNumber!=0 && decisionNumber!=1) {//Condicional de la validación.
			throw new DecisionException("Error al seleccionar. Digite de nuevo (0 o 1): ");//Mensaje que aparecerá en caso de caer en el error.
		}
	}
}
