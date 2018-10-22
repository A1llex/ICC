/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;
import icc.agenda.*;

/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista {	

	/**
	 * Primer elemento de la lista.
	 */
	private ListaAgenda cabeza;

	/**
	 * Número de elementos en la lista.
	 */
	private int longitud;

	/**
	 * Agrega un registro agenda al final de la lista.
	 * @param elemento es el elemento que se agregara a la lista
	 */
	public void agrega(RegistroAgenda elemento) {
		// Crea el nuevo elemento y lo cuenta.
		ListaAgenda nuevo = new ListaAgenda(elemento);
		longitud++;

		// Si la lista está vacía añade al primer elemento y termina.
		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}

		// Si no, hay que recorrer la lista para formar al nuevo
		// elemento detrás del último.
		ListaAgenda anterior = cabeza;
		while(anterior.getSiguiente() != null) {
			anterior = anterior.getSiguiente();
		}
		anterior.setSiguiente(nuevo); 
	}

	/**
	 * Devuelve el número de elementos en esta lista.
	 * @return si <code>longitud</code> tiene ese nombre.
	 */
	public int longitud() {
		return longitud;
	}

	/**
	 * Por ahora utilizaremos este método para poder
	 * programar la búsqueda en la base de datos.
	 * @param buscador es la variabel que se va a buscar en la lista de datos
	 * @return si <code>buscador</code> tiene ese nombre.
	 */
	public RegistroAgenda encuentra(IBuscador buscador) {
		// TODO: Utiliza al objeto buscador para encontrar
		// al registro agenda con el dato solicitado.
		if (cabeza==null) {
			return null;			
		}
		RegistroAgenda actual = cabeza.getRegistro();
		ListaAgenda manejador = cabeza;
		while (actual != null) {
			if (buscador.esEste(actual)) {
				return actual;
			}
			manejador = manejador.getSiguiente();
			actual =(manejador != null)?manejador.getRegistro():null;
			
		}

		return null;
	
	}
	public void imprime(){
		ListaAgenda actual = cabeza;
		ListaAgenda siguiente;

		while (actual != null) {

			String aux = ((actual.getRegistro()).toString()).trim();
			System.out.println(aux);
			
			if (actual.getSiguiente() != null) {
				siguiente = actual.getSiguiente();
				actual = siguiente;
			}else{
				return;
			}
		}
	}
	
}
