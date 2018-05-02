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
    public void mostrar(){
        System.out.println("--- MOSTRANDO LA LISTA ---");
        System.out.println("Nombre del paquete: "+getNombre());
         for(String a: Servicio){
             System.out.println("Servicios: "+a.toString());
         }
     //pat.set(0, leer);

    }
}
