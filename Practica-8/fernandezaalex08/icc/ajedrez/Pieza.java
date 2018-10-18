package icc.ajedrez;
 /**
 *Fernandez Aguilar Alex Gerardo
 **/
public abstract class Pieza extends Posicion{

	private Posicion pos;
	private boolean color;

	public Pieza (boolean color){
		this.color=color;
		pos=new Posicion();
	}

	public Pieza(Posicion pos,boolean color){
		this.pos=pos;
		this.color=color;
	}

	public Posicion getPosicion(){
		return pos;
	}
	public void setPosicion(Posicion pos){
		this.pos=pos;
	}

	public boolean getColor(){
		return color;
	}
	public void setColor(boolean color){
		this.color=color;
	}

	//devuelve una lista de posibles movimientos
	abstract String posiblesMovimientos();
	//regresa si es valida la posicion
	abstract Boolean esValida(int renglon, char coumna);
	//regresa donde esta la pieza 
	//abstract String toString();

}