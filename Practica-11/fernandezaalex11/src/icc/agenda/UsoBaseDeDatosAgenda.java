/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;
import icc.util.*;
import java.util.*;

/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

        public int menu(){
            Scanner s = new Scanner(System.in);
            
            System.out.println("Menu1 lige una Opcion porfavor");
            System.out.println("1) Crear Base de Datos");
            System.out.println("2) Cargar una Base de Datods");
            System.out.println("3) Guardar Agenda");
            System.out.println("4) Agregar un Registro");
            System.out.println("5) Buscar por Nombre");
            System.out.println("6) Buscar por Telefono");
            System.out.println("7) Imprimir la Base de Datos");
            
            if (s.hasNextInt()) {
                int a = s.nextInt();
                s.close();
                return a;
            }else{
                s.close();
                return 0;
            }
        }
        
        public RegistroAgenda registro(){
            Scanner sc = new Scanner(System.in);
            String nombre,direccion,telefono;
            
            System.out.println("Hola porfavor dame un nombre");
            
            while ( s . hasNext () ) {
            String linea = s . nextLine () ;
            }
            
            nombre = sc.nextLine();
            
            System.out.println("Hola porfavor dame una direccion");
            direccion = sc.nextLine();
            
            System.out.println("Hola porfavor dame un telefono");
            telefono = sc.nextLine();

            sc.close();
            RegistroAgenda reg = new RegistroAgenda(nombre,direccion,telefono);
            return reg;
        }
        

	/*  Número de caracteres que debe tener el registro nombre. */
	private static final int TAM_NOMBRE    = 20;
	/*  Número de caracteres que debe tener el registro dirección. */
	private static final int TAM_DIRECCION = 30;
	/*  Número de caracteres que debe tener el registro teléfono. */
	private static final int TAM_TELEFONO  = 8;

	private static final String tabla1 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Juan Perez Garcia   "+"Avenida Siempre Viva # 40     "+"55554466"+
	"Arturo Lopez Estrada"+"Calle de la abundancia # 12   "+"55557733"+
	"Edgar Hernandez Levi"+"Oriente 110 # 14              "+"55512112"+
	"Maria Garcia Sanchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
	"Pedro Paramo Rulfo  "+"Avenida Mexio Lindo # 23      "+"54471499"+
	"Jose Arcadio Buendia"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Colera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermudez      "+"Sotanos de Mexico # 45        "+"55552112"+
	"Carlos Garcia Vigil "+"La Republica # 1              "+"55554332"+
	"Eligio Garcia Agusto"+"Ciudades Desiertas # 90       "+"56344325";


	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
                /*
		BaseDeDatosAgenda base1 = new BaseDeDatosAgenda (tabla1,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);
		BaseDeDatosAgenda base2 = new BaseDeDatosAgenda (tabla2,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);
		
		System.out.println("Tabla 1");
		base1.imprime();
		System.out.println("Tabla 2");
		base2.imprime();
		*/
		System.out.println("hola");
		UsoBaseDeDatosAgenda uso = new UsoBaseDeDatosAgenda();
                
                switch(uso.menu()){
                case 1 :
                    System.out.println("caso uno");
                    break;
                    
                case 2 :
                    System.out.println("caso dos");
                    break;
                
                case 3 :
                    System.out.println("caso tres");
                    break;
                
                case 4 :
                    System.out.println("caso cuatro");
                    ManejadorDeLista tabla = new ManejadorDeLista();
                    RegistroAgenda reg = uso.registro();
                    tabla.agrega(reg);
                    break;
                
                default:
                    System.out.println("No es una opcion del menu");
                    break;
                }
                
                
	}
}

/* </UsoBaseDeDatosAgenda.java> */
