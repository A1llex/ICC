/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;
import icc.util.*;
import java.io.*;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {	

	/**
	 * Este objeto llevará el control de los registros guardados en la lista.
	 */
	private ManejadorDeLista tabla = new ManejadorDeLista();

	/**
	 * Constructor.
	 * @param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 * @param tam_nombre el tamaño de la variabel nombre 
	 * @param tam_direccion el tamaño de la variabel direccion
	 * @param tam_telefono el tamaño de la variabel telefono
	 */
	public BaseDeDatosAgenda(String datos,int tam_nombre,int tam_direccion,int tam_telefono) {
		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.
		int tam_tabla = datos.length();
		int tam_registro = tam_nombre + tam_direccion + tam_telefono;
		int aux = 0;
		//String nombre,direccion,telefono;
		while (aux<tam_tabla-1) {

			String nombre = datos.substring(aux,aux+tam_nombre).trim();
			aux = aux+tam_nombre;
			//System.out.println(nombre);
			String direccion = datos.substring(aux,aux+tam_direccion).trim();
			aux = aux+tam_direccion;
			//System.out.println(direccion);
			String telefono = datos.substring(aux,aux+tam_telefono).trim();
			aux = aux+tam_telefono;
			//System.out.println(telefono);

			RegistroAgenda reg = new RegistroAgenda(nombre,direccion,telefono);
			tabla.agrega(reg);
		}
	}

	public void agrega(RegistroAgenda reg){
		tabla.agrega(reg)
	}

	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		BuscadorPorNombre n = new BuscadorPorNombre(nombre);
		return tabla.encuentra(n);
	}

	public RegistroAgenda dameRegistroPorTelefono (String tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		BuscardorPorTelefono t = new BuscardorPorTelefono(tel);
		return tabla.encuentra(t);
	}

	public void imprime(){
		tabla.imprime();
	}

}
