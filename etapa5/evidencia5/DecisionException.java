package evidencia5;

public class DecisionException extends Exception{//Clase para la creaci�n de excepciones de tipo decision

	private static final long serialVersionUID = 1L;
	
	public DecisionException() {//Constructor vacio
		
	}
	
	public DecisionException(String mensaje) {//Agarra el mensaje
		super(mensaje);
	}
	
	public DecisionException(int decisionNumber) throws DecisionException{//Manda a validar la decision
		this.validarDecision(decisionNumber);
	}
	
	public void validarDecision(int decisionNumber) throws DecisionException{//M�todo donde se desarrolla el proceso de validaci�n
		if(decisionNumber!=0 && decisionNumber!=1) {//Condicional de la validaci�n.
			throw new DecisionException("Error al seleccionar. Digite de nuevo (0 o 1): ");//Mensaje que aparecer� en caso de caer en el error.
		}
	}
}
