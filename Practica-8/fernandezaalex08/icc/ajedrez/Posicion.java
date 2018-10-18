package icc.ajedrez;
 /**
 *Fernandez Aguilar Alex Gerardo
 **/

public class Posicion {

	private char columna;
	private int renglon;

	public void setPosicion(char columna,int renglon){
		this.columna=columna;
		this.renglon=renglon;
	}

	public void setColumna(char columna) {
		renglon=Character.toLowerCase(renglon);
		if ((columna>='a')&&(columna<='h')) {
			this.columna=columna;
		}else{
			throw new IllegalArgumentException("debe ser un renglon valido");
		}
	}
	public char getColumna() {
 		return columna;
	}
	public void setRenglon(int renglon) {
 		if ((renglon>=1)&&(renglon<=8)) {
			this.renglon=renglon;
		}else{
			throw new IllegalArgumentException("Deba ser una columna valida");
		}
	}
	public int getRenglon() {
 		return renglon;
	}

}