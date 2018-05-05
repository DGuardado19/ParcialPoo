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
    double precio;
    String[][] cantidad = new String[1][1];
    String[] paquete = new String[2];
    Scanner leer = new Scanner(System.in);

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

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
            String pregunta;
            System.out.print("Desea hacer la reservacion a este cliente? (s/n): ");
            pregunta = leer.next();
            if (pregunta.equals("s")) {
                Reservacion de = new Reservacion();
                de.setDui(dui);
                de.setDia(dia);
                int e, paquete;
                System.out.print("Cuantas habitaciones desea reservar? :");
                e = leer.nextInt();
                String[] pack = new String[2];
                if (e <= 2 && e >= 1) {
                    String[][] pato = new String[e][2];
                    for (int i = 0; i < e; i++) {
                        System.out.println("----------Habitacion " + (i + 1) + "----------");
                        System.out.print("Ingrese el numero de la habitacion :  ");
                        pato[i][0] = String.valueOf(leer.nextInt());
                        System.out.print("Ingrese el piso:  ");
                        pato[i][1] = leer.next();
                        if (verificarPiso(pato[i][1])) {
                            if (!verificarHabitacion(pato[i][1], Integer.parseInt(pato[i][0]))) {
                                System.err.println("La habitacion esta inhabilitado!!!");
                                --i;
                            }
                        } else {
                            System.err.println("El piso esta inhabilitado!!!");
                            --i;
                        }
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
                } else if (e > 2) {
                    System.err.println("No se puede reservar mas de 2 habitaciones!!!");
                }
            } else {
                System.out.print("Ingrese el dui del cliente que quiere: ");
                dui = leer.next();
                AgregarReservacion(dui, dia);
            }
        } else {
            System.err.println("El dui del cliente no existe!");
            System.out.print("Ingrese un dui existente: ");
            dui = leer.next();
            AgregarReservacion(dui, dia);
        }
    }

    public boolean verificarCliente(String dui) {
        boolean verificar = false;
        int cont = 0;
        for (Cliente recorrer : main.cl.clientes) {
            if (recorrer.getDui().equals(dui)) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("cliente " + cont);
                System.out.println("Nombres: " + recorrer.getNombre());
                System.out.println("Apellidos: " + recorrer.getApellidos());
                System.out.println("Genero: " + recorrer.getGenero());
                System.out.println("Telefono: " + recorrer.getTelefono());
                System.out.println("Direccion: " + recorrer.getDireccion());
                System.out.println("Targeta: " + recorrer.getTargetacredito());
                System.out.println("dui: " + recorrer.getDui());
                System.out.println("----------------------------------------------------------");
                ++cont;
                verificar = true;
            }
        }
        return verificar;
    }

    public boolean verificarHabitacion(String piso, int nHabi) {
        boolean verificar = false;
        for (Habitacion recorrer : main.habi.habitacion) {
            if (recorrer.getHabit() == nHabi) {
                if (recorrer.getPiso().equals(piso)) {
                    if (recorrer.getEstado().equals("Habilitado")) {
                        verificar = true;
                    }
                }
            }
        }
        return verificar;
    }

    public boolean verificarPiso(String piso) {
        boolean verificar = false;
        for (Piso recorrer : main.pis.Piso) {
            if (recorrer.getLetra().equals(piso)) {
                if (recorrer.getEstado().equals("Habilitado")) {
                    verificar = true;
                }
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
