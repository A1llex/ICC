package icc.contactos;
/**
*Fernandez Aguilar Alex Gerardo
*/

public class Contactos{
	//por defecto se crea una cabezza nulla para poder empezae
	private Registro head = null;

	//lo que hace es tomar en cuenta los casos posibles para insertar un nuego contacto
	public void insertaContacto(Registro reg) {
		//Si la cabeza es nulla es decir solo esta ese elmento el primer dato de entrada sera el nuevo registro
		if(head == null) head = reg;
		//PRimer caso si la primer cadena es menor que el siguiente nodo lo posicionara antes de el
		else if(reg.getNombre().compareTo(head.getNombre()) < 0) {
			Registro temp = head;
			head = reg;
			head.setSiguiente(temp);
		//Ultimo caso cuando hay que recorrer la linked list para ver cuando si es menor al siguiente nodo
		}else {
			Registro actual = head;
			Registro siguiente = head.getSiguiente();
			while(siguiente != null){
				//aqui hace li mismo de arriba al comprar cuand es menor al siguiente nodo 
				if(reg.getNombre().compareTo(head.getNombre()) < 0) {
					//aqui rompe el ciclo while para que se pueda seguir ejecutando el codigo
					break;	
				}
			//mientras que no se salga del ciclo va anazando nodo por nodo	
			actual = actual.getSiguiente();
			siguiente = siguiente.getSiguiente();
			}
			//si llega al final de la cola se aloja ahi el nodo
			if(siguiente == null) {
				actual.setSiguiente(reg);
			}else {
				//si no es asi significa que el siguiente era mas grande por lo que se queda en esse lugar y solo queda ligar de nuevo los nodos para tener las direcciones correctas
				actual.setSiguiente(reg);
				actual = actual.getSiguiente();
				actual.setSiguiente(siguiente);
			}
		}
	}


	public void imprimeContactos() {
		//comienza por la direccion de la cabeza
		Registro actual = head;
		//hay que revisar nodo por nodo hasta el final
		while(actual != null){
			//recorrera la lista nodo por nodo  imprimiendolo
			System.out.println(actual.getNombre());
			actual = actual.getSiguiente();
		}		
	}


	public Registro consultar(String nombre) {
		//igual comenzamos por la direccion de la cabeza
		Registro actual = head;
		//ahora sera igual recorrer la lista ligada pero a diferencia del codigo de revisar si uno es mas grande que otro aqui podemos salir con un retur y ya no es necesario el break
		while(actual != null) {
			if((actual.getNombre()).contains(nombre)) {
				return actual;
			}
			//si no se sale seguira viendo los demas nodos hasta el ultimo
			actual = actual.getSiguiente();
		}
		//si por algo al entrar a la lista nos encontramos con el ultimo es decir que la lista solo contiene un elemento ,lo regresa
		return actual;
	}

}