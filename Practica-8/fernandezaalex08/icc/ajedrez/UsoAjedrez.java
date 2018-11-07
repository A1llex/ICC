package icc.ajedrez;
 /**
 *Fernandez Aguilar Alex Gerardo
 **/

import java.util.Scanner;

//generar las posibilidades de una pieza situada en el centro u orilla del tablero
//las pisibles casiilas a las que se puede mover desde una posicion  dada
//una opcion de tu decirle a donde moverla y si  es posible moverla ahi
//un get y set de la posicion 
public class UsoAjedrez {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" AJEDREZ ");


		UsoAjedrez interfaz = new UsoAjedrez();
		interfaz.corre();
	}


	private void menu1(){
		System.out.println("opciones");
		System.out.println("1) Generar las posibilidades");

		System.out.println("4) Salir");
	}

	private void menu2(){
		
	}

	private void corre(){
		System.out.println("hola soy la interfaz");
		boolean continuar =true;
		while(continuar){
			try{
				menu1();	
			}catch(IllegalArgumentException iae){

			}

		}
	}


}