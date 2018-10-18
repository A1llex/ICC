package icc.contactos;
 /**
 *Fernandez Aguilar Alex Gerardo
 **/

public class Registro {
	private String nombre;
 	private String direccion;
 	private String telefono;
 	
 	private Registro siguiente;
 	//decidi usar el telefono como String porque al final creo sera mas facil manipual un string para output

 	//el constructor predefinido creo podria ser util declarar un constructor vacio para en los switch declara un Registro sin saber que contendra dentro 
 	public Registro(String nombre,String direccion,String telefono) {		
 		this.nombre=(nombre==null)?"nombre por defecto":nombre;
 		this.direccion=(direccion==null)?"direccion por defecto":direccion;
 		this.telefono=(telefono==null)?"numero por defecto":telefono;
 	}

 	//decidi usar un operador ternario para que se vea mejro ,y si hay un null se agregara una cadena por defecto
 	public void setNombre(String nombre) {
 		this.nombre=(nombre==null)?"nombre por defecto":nombre;
	}
	public String getNombre() {
 		return nombre;
	}
	public void setDireccion(String direccion) {
 		this.direccion=(direccion==null)?"direccion por defecto":direccion;
	}
	public String getDireccion() {
 		return direccion;
	}
	public void set_a(String telefono) {
 		this.telefono=(telefono==null)?"numero por defecto":telefono;
	}
	public String get_a() {
 		return telefono;
	}

	void setSiguiente(Registro siguiente) {
		this.siguiente=siguiente;
	}
	Registro getSiguiente() {
		return siguiente;
	}

	//solo concatena los string guardados para enviarlos
	public String toString() {
		return "Nombre: "+nombre+"\nDireccion: "+direccion+"\nTelefono: "+telefono;
	}
 
 }

