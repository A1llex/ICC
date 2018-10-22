	/* -*- jde -*- */
/* <ListaAgenda.java> */

package icc.util;
import icc.agenda.*;

/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class Lista {

	/**
	 * Registro almacenado.
	 */
	private Object elemento;

	/**
	 * Lista siguiente.
	 */
	private Lista siguiente;

	/**
	 * Construye una lista con un único elemento.
	 * @param elemento: el elemento a almacenar.
	 *        Debe ser distinto de <code>null</code>.
	 */
	Lista(Object elemento) {
		this.elemento = elemento;
	}

	/**
	 * Devuelve el elemento almacenado en esta lista.
	 * @return si <code>elemento</code> tiene ese nombre.
	 */
	public Object getRegistro() {
		return elemento;
	}

	/**
	 * Devuelve la lista siguiente.
	 * @return si <code>siguiente</code> tiene ese nombre.
	 */
	public Lista getSiguiente() {
		return siguiente;
	}

	/**
	 * Asigna a la lista que va después de esta.
	 * @param siguiente: otra lista.
	 */
	public void setSiguiente(Lista siguiente) {
		this.siguiente = siguiente;
	}
}
