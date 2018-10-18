/**
*Fernandez Aguilar Alex Gerardo
*/

package icc.clases;

public class Ciudadano {
	//las variables principales
    private String Nombres;
    private String ApellidoPat;
    private String ApellidoMat;
    private String Fecha;
    
    //Constructor y guarda las variables
    public Ciudadano(String Nombres,String ApellidoPat, String ApellidoMat,String Fecha) {
        this.Nombres = Nombres;
		this.ApellidoPat = ApellidoPat;
        this.ApellidoMat = ApellidoMat;
        this.Fecha = Fecha;
    }
    
    //da un String del RFC
    public String calculaRFC(){
        String RFC;
        RFC=ApellidoPat.substring(0,2)+ApellidoMat.substring(0,1)+Nombres.substring(0,1)+Fecha.substring(8,10)+Fecha.substring(3,5)+Fecha.substring(8,10);
        return RFC.toUpperCase();
    }
    
    //Regresa El nombre Completo en orden
    public String toString(){
        String NombreCompleto;
        NombreCompleto=Nombres+" "+ApellidoPat+" "+ApellidoMat+" "+Fecha+" "+calculaRFC();
        return NombreCompleto;
    }
    
}
