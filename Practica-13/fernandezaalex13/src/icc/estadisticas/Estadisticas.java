/*
* Fernandez Aguilar Alex Gerardo
*/
package icc.estadisticas;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Estadisticas {

	double[] estadistica;
    double med;

	void cargaArreglo(String nombre){

        File file = new File(nombre);

        try {
            Scanner entrada = new Scanner(file);

            if (entrada.hasNextInt()) {
                int cuantos = entrada.nextInt();

                 estadistica = new double[cuantos];

                for (int i=0; i<cuantos; i++ ) {
                    estadistica[i] = entrada.nextDouble();
                    //System.out.println(i+" indice"+estadistica[i]);
                }

            }else{
                throw new FileNotFoundException("El archivo no contiene lo necesario");
            }         

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    /*
    *Opte por usar una excepcion para cuando el arreglo es vacio de todas formas hay un retunr con un 0 al final que en conclusion nunca deberia alcanzar
    */
    double media (){
        try {   
            if (estadistica == null) {
                throw new FileNotFoundException("El archivo no contiene lo necesario");
            }else{
                int tam = estadistica.length;
                    double total=0;
                for (int i=0 ;i<tam ;i++ ) {
                    total += estadistica[i]; 
                }
                med = total/tam;
                return med;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        return 0;
    }

    /*
    *Opte por usar una excepcion para cuando el arreglo es vacio de todas formas hay un retunr con un 0 al final que en conclusion nunca deberia alcanzar
    */
    double varianza(){
        try {
            if (estadistica == null) {
                throw new FileNotFoundException("El archivo no contiene lo necesario");
             }else{
                int tam = estadistica.length;
                double suma=0;

                for (int i=0 ;i<tam ;i++ ) {
                    suma += (estadistica[i] - med)*(estadistica[i] - med);
                }
                return  ((suma)/tam);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        return 0;

    }
	

}