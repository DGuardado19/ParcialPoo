
package parcialpoo;
import java.util.*;
import java.text.*;

/**
 *
 * @author RobertoHer
 */
public class Fecha { 
    /**
     * Inicializando. Es el constructor vacio 
     */
   public Fecha(){
       
   }
   public void fechita(){
       String fecha;
       Scanner input = new Scanner(System.in);
       boolean respuesta = true;
       System.out.println("Ingrese la fecha seguido de una pleca (/)");
       fecha=input.next();
       //respuesta=validando(fecha);
       if(respuesta==true){
           System.out.println("Fecha ingresada con exito");
           
       }
       else{
           System.out.println("Fecha no valida");
       }
      
   }
   public static boolean validando(String fec){
       try{
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           formato.setLenient(false);
           formato.parse(fec);
                   }
       catch(ParseException exp){
           return false;
       }
       return true;
   }
 }

