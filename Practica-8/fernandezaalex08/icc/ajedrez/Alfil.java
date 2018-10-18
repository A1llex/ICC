package icc.ajedrez;
 /**
 *Fernandez Aguilar Alex Gerardo
 **/
public abstract class Alfil extends Pieza {

	Alfil(){}



	String posiblesMovimientos(){

		
	}
	//regresa si es valida la posicion
	abstract Boolean esValida(int renglon, char coumna);
}