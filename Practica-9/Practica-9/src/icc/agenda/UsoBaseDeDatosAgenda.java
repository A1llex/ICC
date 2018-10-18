/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;
import icc.util.*;

/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

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
	"Pedro Paramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
	"Jose Arcadio Buendia"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermudez      "+"Sotanos de Mexico # 45        "+"55552112"+
	"Carlos Garcia Vigil "+"La Republica # 1              "+"55554332"+
	"Eligio Garcia Agusto"+"Ciudades Desiertas # 90       "+"56344325";

	private static final String tabla3 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermudez      Sotanos de Mexico # 45        55552112Carlos Garcia Vigil La Republica # 1              55554332Eligio Garcia AgustoCiudades Desiertas # 90       56344325";


	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
		BaseDeDatosAgenda base1 = new BaseDeDatosAgenda (tabla3,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);
		BaseDeDatosAgenda base1 = new BaseDeDatosAgenda (tabla3,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);
	


	}
}

/* </UsoBaseDeDatosAgenda.java> */
