/*
* Fernandez Aguilar Alex Gerardo
*/
package icc.matriz;

//import icc.arreglos.*;

public class UsoMatriz {

	static double[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
	static double[][] matriz2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
	static double[][] matriz3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
	//esta de anajo es una matriz de distintos tamaños que justo causa error en la ejecucion
	//static double[][] matriz4 = {{0},{1,2},{3,4,5}};

	public static void main(String[] args) {

		Matriz2D mtrz1 = Matriz2D.creaMatriz(matriz1);
		Matriz2D mtrz2 = Matriz2D.creaMatriz(matriz2);
		Matriz2D mtrz3 = Matriz2D.creaMatriz(matriz3);
		//Matriz2D mtrz4 = Matriz2D.creaMatriz(matriz4);

		System.out.println("Matriz 1"+mtrz1);
		System.out.println("Matriz 2"+mtrz2);
		System.out.println("Matriz 3"+mtrz3);
		//System.out.println(mtrz4);

		System.out.println("Prueba Operadores");

		Matriz2D mtrz5 = mtrz3.suma(mtrz3);
		System.out.println("Suma "+mtrz5);

		mtrz5 = mtrz5.resta(mtrz3);
		System.out.println("Resta "+mtrz5);

		mtrz5 = mtrz1.multipica(5.0);
		System.out.println("Multiplica "+mtrz5);
		
		Matriz2D mtrz6 = mtrz1.multipica(mtrz2);
		System.out.println("Multiplica  matrices"+mtrz6);


	}

}