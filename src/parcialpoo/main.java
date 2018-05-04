/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

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

    public static void main(String[] args) {
        pis.agregarPiso("A");
        pis.agregarPiso("B");
        pis.agregarPiso("C");
        pis.agregarPiso("D");
        pis.agregarPiso("E");
        
        habi.agregarHabitacion(2, 30, "A", 1);
        habi.agregarHabitacion(1, 24, "A", 1);
        habi.agregarHabitacion(4, 50, "A", 1);
        habi.agregarHabitacion(4, 50, "B", 1);
        
        pis.eliminarPiso(1);
        
        habi.eliminarHabitacion("A", 1);
        
        habi.mostrarHabitaciones();
    }

}
