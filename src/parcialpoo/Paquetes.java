/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RobertoHer
 */
public class Paquetes {

    public String nombre;
    public ArrayList<String> Servicio;

    public Paquetes(String nombre, ArrayList<String> Servicio) {
        this.nombre = nombre;
        this.Servicio = Servicio;
    }

    public Paquetes() {
        Servicio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getServicio() {
        return Servicio;
    }

    public void setServicio(ArrayList<String> Servicio) {
        this.Servicio = Servicio;
    }
    //Agregando paquetes
    public void agregar(Paquetes pa, ArrayList<String> pat) {
        Scanner input = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paquete: ");
        pa.setNombre(input.nextLine());
        int valor;
        System.out.println("Ingrese cuantos servicios agregara: ");
        valor = entrada.nextInt();
        for (int i = 0; i < valor; i++) {
            pat.add("");
            System.out.println("Ingrese los servicios del paquete: ");
            pat.set(i, leer.nextLine());
        }
        pa.setServicio(pat);
        this.nombre = pa.getNombre();
        this.Servicio=pa.getServicio();
     
     } 
    //Mostrando los datos de los paquetes
    public void mostrar(){
        System.out.println("--- MOSTRANDO LA LISTA ---");
        System.out.println("Nombre del paquete: "+getNombre());
         for(String a: Servicio){
             System.out.println("Servicios: "+a.toString());
         }
     //pat.set(0, leer);

    }
    //Eliminando todos los paquetes
    public void clear(){
        System.out.println("--- PAQUETES ELIMINADOS ---");
        System.out.println("PAQUETE ELIMINADO: "+getNombre());
        Servicio.clear();//Por el momento elimina todo PERO sigue mostrando el nombre del paquete
        
    }
    //Solo para ver cuantos accesos tiene un paquete
    public void size(){
        System.out.println("Del paquete: "+getNombre());
        System.out.println("Numero de accesos al paquete: ");
        System.out.println(Servicio.size());
    }
    //Para agregar un nuevo acceso a una posicion que solicite el usuario
    public void add(int numero, String acceso){
        System.out.println("Del paquete "+getNombre()+" se agrego: ");
        Servicio.add(numero,acceso);//Por el momento para un paquete.
    }
    //Devuelve la posicion del acceso de un paquete
    public void get(int n){
        System.out.println("Del paquete: "+getNombre());
        Servicio.get(n);
        System.out.println("La posicion es: "+Servicio.get(n));
    }
}
