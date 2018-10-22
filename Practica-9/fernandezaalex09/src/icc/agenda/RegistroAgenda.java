/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.agenda;
import icc.util.*;


/**
 * Registro para una Agenda
 */
public class RegistroAgenda {	

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.
	private String nombre;
	private String direccion;
	private String telefono;
	/**
	 * Constructor.
	 * @param nombre  es el nombre que se asiganra al nuevo resgistro en agenda
	 * @param direccion  es el direccion que se asiganra al nuevo resgistro en agenda
	 * @param telefono  es el telefono que se asiganra al nuevo resgistro en agenda
	 */
	public RegistroAgenda(String nombre,String direccion,String telefono){
		this.nombre=(nombre==null)?"nombre por defecto":nombre;
		this.direccion=(direccion==null)?"direccion por defecto":direccion;
		this.telefono=(telefono==null)?"telefono por defecto":telefono;
	}

	/**
	 * Agrega los getters necesarios para leer la información en el registro.
	 * Son los metodos getters de la clase registro
	 * @return si <code>nombre</code> tiene ese nombre.
	 */
	public String getNombre(){
		return nombre;
	}
	public String getDireccion(){
		return direccion;
	}
	public String getTelefono(){
		return telefono;
	}
	/**
	 * Agrega los setters que permitan actualizar los datos de tu contacto.
	 * Son los metodos setter de la clase registro
	 * @param nombre es la cadena nommbre del registro y comprueba si la variable que te pasaron es null
	 */
	public void setNombre(String nombre){
		this.nombre=(nombre==null)?"nombre por defecto":direccion;
	} 
	/** @param direccion es la cadena direccion del registro y comprueba si la variable que te pasaron es nula*/
	public void setDireccion(String direccion){
		this.direccion=(direccion==null)?"direccion por defecto":direccion;
	}
	/** @param telefono es la cadena telefono del registro y comprueba si la variable que te pasaron es nula*/
	public void setTelefono(String telefono){
		this.telefono=(telefono==null)?"telefono por defecto":telefono;
	}
	/**
	 * Devuelve una cadena con los datos en el registro en un formato agradable.
	 */
	public String toString() {
		return nombre+", "+direccion+", "+telefono+"\n";
	}
}
