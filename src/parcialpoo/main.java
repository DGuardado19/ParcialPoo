/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.*;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static Habitacion habi = new Habitacion();
    public static Piso pis = new Piso();
    public static Paquetes paque = new Paquetes();
    public static Cliente cl = new Cliente();
    public static DUI dui=new DUI();
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        pis.agregarPiso("A");
        pis.agregarPiso("B");
        pis.agregarPiso("C");
        pis.agregarPiso("D");
        pis.agregarPiso("E");
        
        habi.agregarHabitacion(2, 30, "A", 1);
        habi.agregarHabitacion(1, 24, "A", 1);
        habi.agregarHabitacion(4, 50, "A", 1);
        habi.agregarHabitacion(4, 50, "B", 1);
        
        Paquetes paque2 = new Paquetes();
        paque2.setNombre("Basico");
        paque2.setPrecio(23);
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("Internet");
        paque2.setServicio(aux);
        paque.paque.add(paque2);
        
        menu.iniciar();
    }

}
