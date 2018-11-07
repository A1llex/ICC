/*
* Fernandez Aguilar Alex Gerardo
*/
package icc.estadisticas;

//import icc.arreglos.*;

public class UsoEstadisticas {

	public static void main(String[] args) {

		Estadisticas est =  new Estadisticas();
		System.out.println("incio  "+ args[0] +" Fin");

		if (args.length > 0) {
			est.cargaArreglo(args[0]);
			System.out.println("Media:		"+est.media() );
			System.out.println("Varianza:	"+est.varianza() );
		}else{
			System.out.println("Hola ultimo" );
		}

	}



}