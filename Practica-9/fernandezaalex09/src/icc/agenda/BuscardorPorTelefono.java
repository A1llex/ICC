/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.agenda;
import icc.util.*;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscardorPorTelefono implements IBuscador {

	/* Nombre que se busca */
	private String telefonoBuscado;

	/**
	 * Construye al buscador con el nombre que
	 * va a buscar.
	 * @param nombre es el nombre que se buscara 
	 */
	public BuscardorPorTelefono (String telefono) {
		telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @return si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(RegistroAgenda reg) {
		if (reg.getTelefono().contains(telefonoBuscado)) {
			return true;
		}else{
			return false;
		}
	}

}
