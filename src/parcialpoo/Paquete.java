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
public class Paquete {
    
    private static Paquete paquete;
    
    public static Paquete getInstance(){
        if(paquete == null){
            paquete = new Paquete();
        }
        return paquete;
    }

    public String nombre;
    public double precio;
    public ArrayList<String> Servicio;
    public ArrayList<Paquete> paque = new ArrayList<>();
    int cont = 0;

    public Paquete(String nombre, ArrayList<String> Servicio) {
        this.nombre = nombre;
        this.Servicio = Servicio;
    }

    public Paquete() {
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

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Agregando paquetes
    public void agregar(String pa, double pre){
        Paquete paq = new Paquete();
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
        int cont = 1;
        for(Paquete correr : paque){
            //cont++;
            //System.out.println("Paquete numero: "+cont);
            System.out.println("------------------------------");
            System.out.println("Codigo del paquete: "+cont);
            System.out.println("Nombre al paquete: "+correr.getNombre());
            System.out.println("Precio: $"+correr.getPrecio());
            ++cont;
            
            for(String correr2 : correr.getServicio()){
                System.out.println("Servicios: "+correr2); 
            }
            System.out.println("---------------------------");
        }
    }
    
    //Eliminando todos los paquetes
    public void clear() {
        Servicio.clear();
       paque.clear();
        System.out.println("--- PAQUETES ELIMINADOS ---");

    }

    public void EliminarPaquete(int paq){
        int cont = 1 ;
        for(Paquete correr : paque ){
            ++cont;
        }
        if(paq<=cont){
            paque.remove(paq-1);
            System.out.println("El paquete se elimino");
        }
        else{
            System.out.println("El paquete no existe");
        }
    }

    //Para agregar un nuevo acceso a una posicion que solicite el usuario
    public void add(int numero, String acceso) {
        ArrayList<String> aux = new ArrayList<String>();
        Paquete auxi = new Paquete();
        
        auxi.setNombre(paque.get(numero-1).getNombre());
        auxi.setPrecio(paque.get(numero-1).getPrecio());
        
        aux = paque.get(numero-1).getServicio();
        aux.add(acceso);        
        auxi.setServicio(aux);
        
        paque.set(numero-1, auxi);        
        
    }   

}