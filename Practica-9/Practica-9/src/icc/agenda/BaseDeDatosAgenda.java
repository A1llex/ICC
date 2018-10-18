/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;
import icc.util.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;

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
	private ManejadorDeLista tabla;

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
		

		/*String nombre,direccion,telefono;
		int j=(int)(Math.floor(tam_tabla/tam_registro));
		System.out.println(j);
		int aux;
		System.out.println(datos);
		for (int i=0;i<j;i++) {
			aux=i*tam_registro;
			String nombre = datos.substring(aux,aux+tam_nombre);
			String direccion = datos.substring(aux+tam_nombre,aux+tam_nombre+tam_direccion);
			String telefono= datos.substring(aux+tam_nombre+tam_direccion,tam_registro);
		System.out.println(j+"  "+i+"  "+aux+"  "+tam_tabla+"  "+tam_registro);
		System.out.println("nombre  "+ nombre);
		System.out.println("direccion  "+ direccion);
		System.out.println("telefono  "+ telefono);
		
			RegistroAgenda reg = new RegistroAgenda(nombre,direccion,telefono);
			tabla.agrega(reg);
		**/
		}
	}

	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		return null;
	}

	public RegistroAgenda dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		return null;
	}
}
