/**
*Fernandez Aguilar Alex Gerardo
*/
package icc.recursion;

public class Euclides {

	public static void main(String[] args) {
		int a,b,r;
		if(args.length == 2) {

			a =Integer.parseInt(args[0]);
			b =Integer.parseInt(args[1]);
                        //resultado de los argumentos
			if((a==0)||(b==0)){
				throw new ArithmeticException("uno de los valores es cero");
			}else{
				r=mcd(a,b);
				System.out.println("el Maximo comun Divisor de "+a +" y de "+b+" es : "+r);
			}
		 }else{
			System.out.println("\033[31mNo se recibieron los datos requeridos.\033[0m"); 

			//Pareja de numeros pequeños
			System.out.println(mcd(4,8));
			//pareja de numeros primos
			System.out.println(mcd(11,17));
			//pareja de numeros primos relativos 
			System.out.println(mcd(22,17));
			//que alguno sea 1
			System.out.println(mcd(1,8));
			//pareja de numeros grandes
			System.out.println(mcd(1540,890));
		}

	}

	//Funcion Maximo Comun Divisor
	public static int mcd(int a,int b){
		return(b==0)?a:mcd(b,a%b);

	}

}
