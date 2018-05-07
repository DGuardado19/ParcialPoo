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
    
    private static Reservacion reservar;
    
    public static Reservacion getInstance(){
        if(reservar == null){
            reservar = new Reservacion();
        }
        return reservar;
    }
    
    private ArrayList<Reservacion> Reserva = new ArrayList<Reservacion>();
    String dui, piso;
    int dia;
    double precio;
    String[][] cantidad = new String[2][2];
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
            Habitacion habit = Habitacion.getInstance();
            String pregunta;
            System.out.print("Desea hacer la reservacion a este cliente? (s/n): ");
            pregunta = leer.next();
            Paquete paque = Paquete.getInstance();
            
            if (pregunta.equals("s")) {
                Reservacion de = new Reservacion();
                de.setDui(dui);
                de.setDia(dia);
                int e, paquete;
                double precio = 0.0;
                
                System.out.print("Cuantas habitaciones desea reservar? :");
                e = leer.nextInt();
                String[] pack = new String[2];
                
                if (e <= 2 && e >= 1) {
                    String[][] pato = new String[e][3];
                    String[][] datos = new String[2][2];
                    
                    for (int i = 0; i < e; i++) {
                        System.out.println("----------Habitacion " + (i + 1) + "----------");
                        System.out.print("Ingrese el numero de la habitacion :  ");
                        pato[i][0] = String.valueOf(leer.nextInt());
                        System.out.print("Ingrese el piso:  ");
                        pato[i][1] = leer.next();
                        datos = verificarHabitacion(pato[i][1], Integer.parseInt(pato[i][0]));
                        pato[i][2] = datos[0][1];
                        
                        if (datos[1][0].equals("Habilitado")) {
                            if (!datos[0][0].equals("Habilitado")) {
                                System.err.println("La habitacion esta inhabilitado y/o reservado!!!");
                                --i;
                            }
                        } else {
                            System.err.println("El piso esta inhabilitado!!!");
                            --i;
                        }
                        precio += dia*(Double.parseDouble(datos[0][1]));
                        habit.modificarHabitacionEstado(pato[i][1], Integer.parseInt(pato[i][0]), 3);
                    }
                    
                    de.setCantidad(pato);
                    System.out.println("");
                    System.out.println("Que paquete desea agregar?");
                    paque.mostrar();
                    System.out.println("");
                    System.out.print("Opcion: ");
                    paquete = leer.nextInt();
                    pack[0] = paque.paque.get(paquete - 1).getNombre();
                    pack[1] = String.valueOf(paque.paque.get(paquete - 1).getPrecio());
                    precio += Double.parseDouble(pack[1]);
                    de.setPrecio(precio);
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
        System.out.println("");
    }

    public boolean verificarCliente(String dui) {
        boolean verificar = false;
        int cont = 1;
        Cliente client = Cliente.getInstance();
        for (Cliente recorrer : client.clientes) {
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

    public String[][] verificarHabitacion(String piso, int nHabi) {
        String[][] datos = new String[2][2];
        Piso pis = Piso.getInstance();
        Habitacion habit = Habitacion.getInstance();
        for (Habitacion recorrer : habit.habitacion) {
            if (recorrer.getHabit() == nHabi) {
                if (recorrer.getPiso().equals(piso)) {
                    datos[0][0] = recorrer.getEstado();
                    datos[0][1] = String.valueOf(recorrer.getPrecio());
                    for(Piso recorrer2: pis.Piso){
                        if(recorrer2.getLetra().equals(recorrer.getPiso())){
                            datos[1][0] = recorrer2.getEstado();
                        }
                    }
                }
            }
        }
        return datos;
    }

    public void mostrar() {
        for (Reservacion recorrer : Reserva) {
            System.out.println("--------------------------------------------");
            System.out.println("DUI del cliente: "+recorrer.getDui());
            System.out.println("Dias de estadia: "+recorrer.getDia());
            System.out.println("-- Habitaciones reservada --");
            for (int i = 0; i < recorrer.getCantidad().length; i++) {
                System.out.print(recorrer.getCantidad()[i][0]);
                System.out.print(recorrer.getCantidad()[i][1]+" --- Precio por noche: "+recorrer.getCantidad()[i][2]);
            }
            System.out.println("");
            System.out.println("-- Paquete elegido --");
            for (int j = 0; j < recorrer.getPaquete().length; j++) {
                System.out.print(recorrer.getPaquete()[j]+"   ");
            }
            System.out.println("");
            System.out.println("Total: "+recorrer.getPrecio());
            System.out.println("--------------------------------------------");
        }
    }
}
