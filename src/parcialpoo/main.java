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
    
    public static Cliente cl = new Cliente();
    public static Reservacion reserv = new Reservacion();
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        Piso piso = Piso.getInstance();
        Habitacion habit = Habitacion.getInstance();
        Paquete paquete = Paquete.getInstance();
        
        piso.agregarPiso("A");
        piso.agregarPiso("B");
        piso.agregarPiso("C");
        piso.agregarPiso("D");
        piso.agregarPiso("E");
        
        habit.agregarHabitacion(2, 30, "A", 1);
        habit.agregarHabitacion(1, 24, "A", 2);
        habit.agregarHabitacion(4, 50, "A", 1);
        habit.agregarHabitacion(4, 50, "B", 1);
        
        Paquete paque2 = new Paquete();
        paque2.setNombre("Basico");
        paque2.setPrecio(23);
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("Internet");
        paque2.setServicio(aux);
        paquete.paque.add(paque2);
        
        Cliente client = new Cliente();
        client.setNombre("Eduardo");
        client.setApellidos("Alberto");
        client.setGenero("Masculino");
        client.setDireccion("erwrwer");
        client.setTargetacredito("234234");
        client.setTelefono("wererwe");
        client.setDui("056120044");
        cl.clientes.add(client);
        
        menu.iniciar();
    }

}
