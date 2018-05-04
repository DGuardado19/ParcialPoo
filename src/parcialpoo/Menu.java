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
        System.out.print("---------BIENVENIDO-----------\n");
        System.out.print("----Hotel Vina Raphiña--------\n");
        System.out.print("1. tal \n");
        System.out.print("2. tal \n");
        System.out.print("3. tal \n");
        System.out.print("4. tal \n");
        System.out.print("5. tal \n");
        System.out.print("Opcion hotel, que desea hacer? (provicional)\n");
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
                System.out.println("parcialpoo.main.main()");
                break;
            case 5:
                System.out.println("parcialpoo.main.main()");
                break;
            case 6:
                System.out.println("parcialpoo.main.main()");
                break;
            case 7:
                System.out.println("parcialpoo.main.main()");
                break;
            case 8:
                System.out.println("parcialpoo.main.main()");
                break;
            case 9:
                System.out.println("parcialpoo.main.main()");
                break;
            default:
                break;

        }
    }

    public void menuPaquete() {
        System.out.println("----- MENU DE PAQUETES -----");
        System.out.println("1.Agregar nuevo paquete");
        System.out.println("2.Mostrar paquetes");
        System.out.println("3.Numero de acceso que tienen los paquetes");
        System.out.println("4.Eliminar todos los paquetes");
        System.out.println("5.Agregar un nuevo acceso a un paquete");
        System.out.println("6.Posicion en la que esta un acceso del paquete");
    }
    
    public void menuHabitacion(){
        System.out.println("----- Menu Habitacion -----");
        System.out.println("1.Agregar Habitacion");
        System.out.println("2.Mostrar Habitaciones");
        System.out.println("3.Modificar Estado de Habitacion");
        System.out.println("4.Eliminar Habitacion");
        System.out.print("Opcion: ");
    }
    
    public void iniciarHabitacion(){
        int opc = 5;
        Scanner leer = new Scanner(System.in);
        while(opc != 5){
            menuHabitacion();
            opc = leer.nextInt();
            switch(opc){
                case 1:
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
                        //op.agregar(op);
                        break;
                    case 2:
                        op.mostrar();
                        break;
                    case 3:
                        op.size();
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
                        acc = entra.nextLine();
                        op.add(opr, acc);
                        break;
                    case 6:
                        Scanner ent = new Scanner(System.in);
                        int te;
                        System.out.println("Ingrese la posicion del acceso al paquete: ");
                        te = ent.nextInt();
                        op.get(te);
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
