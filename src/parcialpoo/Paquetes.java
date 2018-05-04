/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author RobertoHer
 */
public class Paquetes {

    public String nombre;
    public int precio;
    public ArrayList<String> Servicio;
    public ArrayList<Paquetes> paque = new ArrayList<>();
    int cont = 0;

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

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Agregando paquetes
    public void agregar(String pa, int pre){
        Paquetes paq = new Paquetes();
        ArrayList<String> aux = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Ingrese el nombre del paquete: ");
        paq.setNombre(pa);
        
        //System.out.println("Ingrese el precio del paquete: ");
        paq.setPrecio(pre);
        int valor;
        System.out.println("Ingrese cuantos servicios agregara: ");
        valor = input.nextInt();
        
        for(int i = 0;i<valor;i++){
            System.out.print("Servicio: ");
            aux.add(input.next());   
            
        }
        //System.out.println("Numero del paquete: "+cont);
        paq.setServicio(aux);
        paque.add(paq);     
    }
    public void mostrar(){
        
        for(Paquetes correr : paque){
            //cont++;
            //System.out.println("Paquete numero: "+cont);
            System.out.println("Nombre al paquete: "+correr.getNombre());
            System.out.println("Precio: $"+correr.getPrecio());
         
            
            for(String correr2 : correr.getServicio()){
                System.out.println("Servicios: "+correr2);
                
            }
        }
    }
    
    //Eliminando todos los paquetes
    public void clear() {
        Servicio.clear();
       paque.clear();
        System.out.println("--- PAQUETES ELIMINADOS ---");

    }

    //Solo para ver cuantos accesos tiene un paquete
    public void size() {
        System.out.println("Del paquete: " + getNombre());
        System.out.println("Numero de accesos al paquete: ");
        System.out.println(Servicio.size());
    }

    //Para agregar un nuevo acceso a una posicion que solicite el usuario
    public void add(int numero, String acceso) {
        ArrayList<String> aux = new ArrayList<String>();
        Paquetes auxi = new Paquetes();
        
        auxi.setNombre(paque.get(numero-1).getNombre());
        auxi.setPrecio(paque.get(numero-1).getPrecio());
        
        aux = paque.get(numero-1).getServicio();
        aux.add(acceso);        
        auxi.setServicio(aux);
        
        paque.set(numero-1, auxi);        
        
    }

    //Devuelve la posicion del acceso de un paquete
    public void get(int n) {
        System.out.println("Del paquete: " + getNombre());
        Servicio.get(n);
        System.out.println("La posicion es: " + Servicio.get(n));
    }

}