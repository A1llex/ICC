/*
* Fernandez Aguilar Alex Gerardo
*/
package icc.matriz;


public class Matriz2D {

    private double[][] matriz;

    public Matriz2D (int renglones,int columnas){
        matriz = new double[renglones][columnas];
    }

    public int getRenglon (){
        return matriz.length;
    }

    public int getColumna (){
        return matriz[0].length;
    }

    public String toString (){
        String cadena="";
        if (matriz.length != 0) {
            for (int i=0 ;i < matriz.length ;i++ ) {
                cadena += "\n";
                for (int j=0 ;j < matriz[i].length ;j++) {
                    cadena += "\t"+Double.toString(matriz[i][j]);
                }
            }
            return cadena;    
        }else {
            return cadena;
        }
    }

    public static Matriz2D creaMatriz (double[][] mtrz){
        
        if (mtrz.length==0){throw new IllegalArgumentException("La Matriz es nula");}
        int renglones = mtrz.length;
        int columnas = mtrz[0].length;
        Matriz2D matrix = new Matriz2D(renglones,columnas);

        for (int i=0 ;i<renglones;i++ ) {
            for (int j=0 ;j<mtrz[i].length ;j++ ) {
                if (mtrz[i].length != columnas) {
                    throw new IllegalArgumentException("La Matriz tiene diferentes medidas");
                }else {
                    matrix.matriz[i][j] = mtrz[i][j];
                }
            }
        }
        return matrix;    

    }

    public Matriz2D suma (Matriz2D mtrz){

        if ((mtrz.matriz.length == 0)||(matriz.length != mtrz.matriz.length)||(matriz[0].length != (mtrz.matriz[0]).length)) {
                    throw new IllegalArgumentException("La Matrices no es del mismo tamaño");
        }

        int renglones = matriz.length;
        int columnas = matriz[0].length;

        for (int i=0 ;i<renglones;i++ ) {
            for (int j=0 ;j<columnas ;j++ ) {
               
                    mtrz.matriz[i][j] += matriz[i][j];
            }
        }
        return mtrz; 

    }

    public Matriz2D resta (Matriz2D mtrz){

        if ((mtrz.matriz.length == 0)||(matriz.length != mtrz.matriz.length)||(matriz[0].length != (mtrz.matriz[0]).length)) {
                    throw new IllegalArgumentException("La Matrices no es del mismo tamaño");
        }

        int renglones = matriz.length;
        int columnas = matriz[0].length;

        for (int i=0 ;i<renglones;i++ ) {
            for (int j=0 ;j<columnas ;j++ ) {
               
                    mtrz.matriz[i][j] -= matriz[i][j];
            }
        }
        return mtrz; 

    }

    public Matriz2D multipica (double mul){

        int renglones = matriz.length;
        int columnas = matriz[0].length;
        Matriz2D matrix = new Matriz2D(renglones,columnas);

        for (int i=0 ;i<renglones;i++ ) {
            for (int j=0 ;j<columnas ;j++ ) {
               
                    matrix.matriz[i][j] = (matriz[i][j]) * mul;
            }
        }
        return matrix; 

    }


    public Matriz2D multipica (Matriz2D mtrz){

        if ((mtrz.matriz.length == 0)||(matriz[0].length != mtrz.matriz.length)) {
                    throw new IllegalArgumentException("La Matrices no se pueden multiplicar");
        }

        int rmatriz = matriz.length;
        int cmatriz = matriz[0].length;

        int rmtrz = mtrz.matriz.length;
        int cmtrz = mtrz.matriz[0].length;

        Matriz2D matrix = new Matriz2D(rmatriz,cmtrz);

        for (int i=0 ;i<rmatriz ;i++ ) {

            for (int j=0 ;j<cmtrz ;j++ ) {
                
                for (int k=0 ;k<cmatriz ;k++ ) {
                    
                    matrix.matriz[i][j] += (double)(((double)matriz[i][k])*((double)mtrz.matriz[k][j])) ;
                
                }   
                
            }

        }

        return matrix; 

    }

}