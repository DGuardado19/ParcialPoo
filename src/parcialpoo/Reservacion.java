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
public class Reservacion {

    private ArrayList<Reservacion> Reserva = new ArrayList<Reservacion>();
    String dui, piso;
    int ncuarto, dia;
    String[][] cantidad = new String[1][1];
    String[] paquete = new String[2];
    Scanner leer = new Scanner(System.in);

    public String[] getPaquete() {
        return paquete;
    }

    public void setPaquete(String[] paquete) {
        this.paquete = paquete;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getNcuarto() {
        return ncuarto;
    }

    public void setNcuarto(int ncuarto) {
        this.ncuarto = ncuarto;
    }

    public String[][] getCantidad() {
        return cantidad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setCantidad(String[][] cantidad) {
        this.cantidad = cantidad;
    }

    public void AgregarReservacion(String dui, int dia) {
        if (verificarCliente(dui)) {
            Reservacion de = new Reservacion();
            de.setDui(dui);
            de.setDia(dia);
            int e, paquete;
            System.out.println(main.paque.paque.get(0).getNombre());
            System.out.println("Cuantas habitaciones desea reservar? :");
            e = leer.nextInt();
            String[] pack = new String[2];
            if (e <= 2 && e >= 1) {
                String[][] pato = new String[e][2];
                for (int i = 0; i < e; i++) {
                    System.out.println("Ingrese el numero de la habitacion :  ");
                    pato[i][0] = String.valueOf(leer.nextInt());
                    System.out.println("Ingrese el piso:  ");
                    pato[i][1] = leer.next();
                }
                de.setCantidad(pato);
                System.out.println("Que paquete desea agregar?");
                main.paque.mostrar();
                System.out.println("");
                System.out.print("Opcion: ");
                paquete = leer.nextInt();
                pack[0] = main.paque.paque.get(paquete - 1).getNombre();
                pack[1] = String.valueOf(main.paque.paque.get(paquete - 1).getPrecio());
                de.setPaquete(pack);
                Reserva.add(de);
            }
        }else{
            System.err.println("El dui del cliente no existe!");
        }
    }

    public boolean verificarCliente(String dui) {
        boolean verificar = false;
        for (Cliente recorrer : main.cl.clientes) {
            if (recorrer.getDui().equals(dui)) {
                verificar = true;
            }
        }
        return verificar;
    }

    public void mostrar() {
        for (Reservacion recorrer : Reserva) {
            System.out.println(recorrer.getDui());
            System.out.println(recorrer.getNcuarto());
            for (int i = 0; i < recorrer.getCantidad().length; i++) {
                System.out.println(recorrer.getCantidad()[i][0]);
                System.out.println(recorrer.getCantidad()[i][1]);
            }
            for (int j = 0; j < recorrer.getPaquete().length; j++) {
                System.out.println(recorrer.getPaquete()[j]);
            }
        }
    }
}
