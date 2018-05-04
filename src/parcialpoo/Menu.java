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
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Menu {

    public void iniciar() {
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("---------BIENVENIDO-----------");
        System.out.println("----Hotel Vina Raphiña--------");
        System.out.println("1. Cliente");
        System.out.println("2. Reservacion");
        System.out.println("3. Paquete");
        System.out.println("4. Habitacion");
        System.out.println("5. Piso");
        System.out.println("6. Salir");
        System.out.print("Opcion: ");
        opc = leer.nextInt();
        System.out.println("");
        switch (opc) {
            case 1:
                System.out.println("parcialpoo.main.main()");
                break;
            case 2:
                System.out.println("parcialpoo.main.main()");
                break;
            case 3:
                System.out.println("parcialpoo.main.main()");
                break;
            case 4:
                iniciarHabitacion();
                break;
            case 5:
                iniciarPiso();
                break;
            case 6:
                break;
            default:
                break;

        }
    }

    private void menuPaquete() {
        System.out.println("----- MENU DE PAQUETES -----");
        System.out.println("1.Agregar nuevo paquete");
        System.out.println("2.Mostrar paquetes");
        System.out.println("3.Eliminar un paquete");
        System.out.println("4.Eliminar todos los paquetes");
        System.out.println("5.Agregar un nuevo acceso a un paquete");
        System.out.println("6.Regresar al menu");
    }
    
    private void menuHabitacion(){
        System.out.println("----- Menu Habitacion -----");
        System.out.println("1.Agregar Habitacion");
        System.out.println("2.Mostrar Habitaciones");
        System.out.println("3.Modificar Estado de Habitacion");
        System.out.println("4.Eliminar Habitacion");
        System.out.println("5.Regresar");
        System.out.print("Opcion: ");
    }
    
    private void menuPiso(){
        System.out.println("---------- Menu Piso ----------");
        System.out.println("1.Agregar Piso");
        System.out.println("2.Mostrar Pisos");
        System.out.println("3.Modificar Estado de Piso");
        System.out.println("4.Eliminar Piso");
        System.out.println("5.Regresar");
        System.out.print("Opcion: ");
    }
    
    public void iniciarPiso(){
        int opc = 6;
        Scanner leer = new Scanner(System.in);
        while(opc != 5){
            menuPiso();
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    String letra;
                    
                    System.out.println("");
                    System.out.print("Escriba la letra del piso: ");
                    letra = leer.next();
                    
                    main.pis.agregarPiso(letra);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    main.pis.mostrarPiso();
                    System.out.println("");
                    break;
                case 3:
                    String Lpiso;
                    int Estado;
                    System.out.println("");
                    
                    System.out.print("Escribe la letra del Piso: ");
                    Lpiso = leer.next();
                    System.out.print("Escribe el estado del piso (1-Habilitado, 2-Desabilitado, 3-Reservado): ");
                    Estado = leer.nextInt();                   
                    
                    main.pis.modificarPisoEstado(Lpiso, Estado);
                    System.out.println("");
                    break;
                case 4:
                    String Lpiso2;
                    System.out.println("");
                    
                    System.out.print("Escribe la letra del piso a eliminar: ");
                    Lpiso2 = leer.next();
                    
                    main.pis.eliminarPiso(Lpiso2);
                    System.out.println("");
                    break;
                case 5:
                    iniciar();
                    break;
            }
        }
    }
    
    public void iniciarHabitacion(){
        int opc = 6;
        Scanner leer = new Scanner(System.in);
        while(opc != 5){
            menuHabitacion();
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    int numeroH;
                    double precio;
                    String letra;
                    int estado;
                    
                    System.out.println("");
                    System.out.print("Escribe el numero de la habitacion: ");
                    numeroH = leer.nextInt();
                    System.out.print("Escriba la letra del piso: ");
                    letra = leer.next();
                    System.out.print("Escribe el precio: ");
                    precio = leer.nextDouble();
                    System.out.print("Escribe el estado (1-Habilitado, 2-Desabilitado, 3-Reservado): ");
                    estado = leer.nextInt();
                    
                    main.habi.agregarHabitacion(numeroH, precio, letra, estado);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    main.habi.mostrarHabitaciones();
                    System.out.println("");
                    break;
                case 3:
                    int numeroH2;
                    String letra2;
                    
                    System.out.println("");
                    System.out.print("Escriba el numero de la habitacion: ");
                    numeroH2 = leer.nextInt();
                    System.out.print("Escriba la letra del piso: ");
                    letra2 = leer.next();
                    
                    main.habi.modificarHabitacionEstado(letra2, numeroH2);
                    break;
                case 4:
                    int numeroH3;
                    String letra3;
                    
                    System.out.println("");
                    System.out.print("Escriba el numero de la habitacion: ");
                    numeroH3 = leer.nextInt();
                    System.out.print("Escriba la letra del piso: ");
                    letra3 = leer.next();
                    
                    main.habi.eliminarHabitacion(letra3, numeroH3);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    iniciar();
                    break;
            }
            
        }
    }

    public void iniciarPaquete() {
        int opcion = 7;
        Scanner input = new Scanner(System.in);
        Paquetes op = new Paquetes();
        while (opcion != 6) {
            menuPaquete();
            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        Scanner input2 = new Scanner(System.in);
                        String a; int b;
                        System.out.println("Ingrese el nombre del paquete: ");
                        a=input2.nextLine();
                        System.out.println("Ingrese el precio del paquete: ");
                        System.out.print("$");
                        b=input2.nextInt();
                        op.agregar(a,b);
                        break;
                    case 2:
                        op.mostrar();
                        break;
                    case 3:
                        int ak;
                        System.out.println("Ingrese el codigo del paquete a eliminar: ");
                        ak=input.nextInt();
                        op.EliminarPaquete(ak);
                        break;
                    case 4:
                        op.clear();
                        break;
                    case 5:
                        Scanner entra = new Scanner(System.in);
                        int opr;
                        String acc;
                        System.out.println("Ingrese la posicion donde agregara el acceso: ");
                        opr = entra.nextInt();
                        System.out.println("Ingrese el acceso nuevo: ");
                        acc = entra.next();
                        op.add(opr, acc);
                        break;
                    case 6:
                        System.out.println("Volviendo al menu principal");
                        break;
                    default:
                        System.out.println("INGRESE UN NUMERO");
                        break;

                }
            } catch (InputMismatchException hola) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER, TONTO");
                input.nextLine();
            }

        }
    }
}
