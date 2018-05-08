
package parcialpoo;

import java.util.*;

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

        try {
            switch (opc) {
                case 1:
                    iniciarCliente();
                    break;
                case 2:
                    iniciarReservacion();
                    break;
                case 3:
                    iniciarPaquete();
                    break;
                case 4:
                    iniciarHabitacion();
                    break;
                case 5:
                    iniciarPiso();
                    break;
                case 6:
                    System.out.println("NOS VEMOS....");
                    break;
                default:
                    System.out.println("INGRESE UN NUMERO DE OPCION");
                    iniciar();
                    break;
            }
        } catch (InputMismatchException E) {
            System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
            leer.next();
        }
    }

    private void menuCliente() {
        System.out.println("------- MENU DE CLIENTES -------");
        System.out.println("1.Agregar un cliente");
        System.out.println("2.Eliminar todos los clientes");
        System.out.println("3.Eliminar un cliente");
        System.out.println("4.Mostrar los clientes");
        System.out.println("5.Regresar");

    }

    private void menuPaquete() {
        System.out.println("------- MENU DE PAQUETES -------");
        System.out.println("1.Agregar nuevo paquete");
        System.out.println("2.Mostrar paquetes");
        System.out.println("3.Eliminar un paquete");
        System.out.println("4.Eliminar todos los paquetes");
        System.out.println("5.Agregar un nuevo acceso a un paquete");
        System.out.println("6.Regresar al menu");
    }

    private void menuHabitacion() {
        System.out.println("------- MENU HABITACION -------");
        System.out.println("1.Agregar Habitacion");
        System.out.println("2.Mostrar Habitaciones");
        System.out.println("3.Modificar Estado de Habitacion");
        System.out.println("4.Eliminar Habitacion");
        System.out.println("5.Regresar");
        System.out.print("Opcion: ");
    }

    private void menuPiso() {
        System.out.println("---------- MENU PISO ----------");
        System.out.println("1.Agregar Piso");
        System.out.println("2.Mostrar Pisos");
        System.out.println("3.Modificar Estado de Piso");
        System.out.println("4.Eliminar Piso");
        System.out.println("5.Regresar");
        System.out.print("Opcion: ");
    }

    private void menuReservacion() {
        System.out.println("---------- MENU RESERVACION ----------");
        System.out.println("1.Hacer nueva reservacion");
        System.out.println("2.Verificar reservacion de un cliente");
        System.out.println("3.Mostrar Reservaciones");
        System.out.println("4.Regresar");
        System.out.print("Opcion: ");
    }

    public void iniciarReservacion() {
        int opc = 5;
        Scanner leer = new Scanner(System.in);

        while (opc != 4) {
            Reservacion reservar = Reservacion.getInstance();
            menuReservacion();
            opc = leer.nextInt();

            try {
                switch (opc) {
                    case 1:
                        String dui;
                        int dia;
                        System.out.println("");
                        System.out.print("Ingrese los dias de estadia: ");
                        dia = leer.nextInt();

                        if (dia <= 7) {
                            System.out.print("Ingrese el dui del cliente: ");
                            dui = leer.next();

                            reservar.AgregarReservacion(dui, dia);
                            
                            iniciar();
                        } else {
                            System.err.println("No se puede reservar mas de 7 dias!!!");
                            iniciar();
                        }
                        break;
                    case 2:
                        String duiC;
                        System.out.println("");
                        System.out.print("Ingrese el dui del cliente: ");
                        duiC = leer.next();
                        
                        if(!reservar.verificarReservacion(duiC)){
                            System.err.println("No existe tal reservacion!!!");
                            iniciar();
                        }
                        break;
                    case 3:
                        System.out.println("");
                        reservar.mostrar();
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        iniciar();
                        break;
                    default:
                        System.err.println("INGRESE UNA OPCION VALIDA!!!!");
                }
            } catch (InputMismatchException e) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
                leer.next();
                iniciarReservacion();
            }
        }
    }

    public void iniciarCliente() {
        Cliente client = Cliente.getInstance();
        int opc = 6;
        Scanner input = new Scanner(System.in);

        while (opc != 5) {
            menuCliente();
            System.out.print("Opcion: ");
            opc = input.nextInt();

            try {
                switch (opc) {
                    case 1:
                        System.out.println("");
                        client.add();
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        client.clear();
                        System.out.println("");
                        break;
                    case 3:
                        int po;
                        System.out.println("");
                        System.out.println("Ingrese el codigo del cliente para eliminarlo: ");
                        po = input.nextInt();

                        client.eliminarcliente(po);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        client.mostrar();
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        iniciar();
                        break;
                    default:
                        System.out.println("INGRESE UN NUMERO DE OPCION");
                        iniciarCliente();
                        break;
                }

            } catch (InputMismatchException e) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
                input.next();
                iniciarCliente();
            }
        }
    }

    public void iniciarPiso() {
        Piso piso = Piso.getInstance();
        int opc = 6;
        Scanner leer = new Scanner(System.in);

        while (opc != 5) {
            menuPiso();
            opc = leer.nextInt();

            try {
                switch (opc) {
                    case 1:
                        String letra;

                        System.out.println("");
                        System.out.print("Escriba la letra del piso: ");
                        letra = leer.next();

                        piso.agregarPiso(letra);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        piso.mostrarPiso();
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

                        piso.modificarPisoEstado(Lpiso, Estado);
                        System.out.println("");
                        break;
                    case 4:
                        String Lpiso2;
                        System.out.println("");

                        System.out.print("Escribe la letra del piso a eliminar: ");
                        Lpiso2 = leer.next();

                        piso.eliminarPiso(Lpiso2);
                        System.out.println("");
                        break;
                    case 5:
                        iniciar();
                        break;
                    default:
                        System.out.println("INGRESE UN NUMERO");
                        iniciarPiso();
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
                leer.next();
                iniciarPiso();

            }
        }
    }

    public void iniciarHabitacion() {
        Habitacion habit = Habitacion.getInstance();
        int opc = 6;
        Scanner leer = new Scanner(System.in);

        while (opc != 5) {
            menuHabitacion();
            opc = leer.nextInt();

            try {
                switch (opc) {
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

                        habit.agregarHabitacion(numeroH, precio, letra, estado);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        habit.mostrarHabitaciones();
                        System.out.println("");
                        break;
                    case 3:
                        int numeroH2,
                         estadoH;
                        String letra2;

                        System.out.println("");
                        System.out.print("Escriba el numero de la habitacion: ");
                        numeroH2 = leer.nextInt();
                        System.out.print("Escriba la letra del piso: ");
                        letra2 = leer.next();
                        System.out.print("Ingrese el estado de la habitación: ");
                        estadoH = leer.nextInt();

                        habit.modificarHabitacionEstado(letra2, numeroH2, estadoH);
                        System.out.println("");
                        break;
                    case 4:
                        int numeroH3;
                        String letra3;

                        System.out.println("");
                        System.out.print("Escriba el numero de la habitacion: ");
                        numeroH3 = leer.nextInt();
                        System.out.print("Escriba la letra del piso: ");
                        letra3 = leer.next();

                        habit.eliminarHabitacion(letra3, numeroH3);
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        iniciar();
                        break;
                    default:
                        System.out.println("INGRESE UN NUMERO");
                        iniciarHabitacion();
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
                leer.next();
                iniciarHabitacion();
            }

        }
    }

    public void iniciarPaquete() {
        int opcion = 7;
        Scanner input = new Scanner(System.in);
        Paquete paquete = Paquete.getInstance();

        while (opcion != 6) {
            menuPaquete();
            try {
                System.out.print("Opcion: ");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        Scanner input2 = new Scanner(System.in);
                        String a;
                        int b;

                        System.out.println("Ingrese el nombre del paquete: ");
                        a = input2.nextLine();
                        System.out.println("Ingrese el precio del paquete: ");
                        System.out.print("$");
                        b = input2.nextInt();

                        paquete.agregar(a, b);
                        break;
                    case 2:
                        paquete.mostrar();
                        break;
                    case 3:
                        int ak;
                        System.out.println("Ingrese el codigo del paquete a eliminar: ");
                        ak = input.nextInt();
                        paquete.EliminarPaquete(ak);
                        break;
                    case 4:
                        paquete.clear();
                        break;
                    case 5:
                        Scanner entra = new Scanner(System.in);
                        int opr;
                        String acc;

                        System.out.println("Ingrese el codigo del paquete: ");
                        opr = entra.nextInt();
                        System.out.println("Ingrese el acceso nuevo: ");
                        acc = entra.next();

                        paquete.add(opr, acc);
                        break;
                    case 6:
                        System.out.println("Volviendo al menu principal...");
                        iniciar();
                        break;
                    default:
                        System.err.println("INGRESE UN NUMERO");
                        iniciarPaquete();
                        break;

                }
            } catch (InputMismatchException hola) {
                System.err.println("INGRESE UN NUMERO, NO UN CARACTER");
                input.next();
                iniciarPaquete();
            }

        }
    }
    
    public void ingresarDatosPorDefecto(){
        Piso piso = Piso.getInstance();
        Habitacion habit = Habitacion.getInstance();
        Paquete paquete = Paquete.getInstance();
        Cliente client = Cliente.getInstance();
        
        piso.agregarPiso("A");
        piso.agregarPiso("B");
        piso.agregarPiso("C");
        piso.agregarPiso("D");
        piso.agregarPiso("E");
        piso.agregarPiso("F");
        piso.agregarPiso("G");
        
        habit.agregarHabitacion(1, 20, "A", 1);
        habit.agregarHabitacion(2, 38, "A", 1);
        habit.agregarHabitacion(1, 20, "B", 1);
        habit.agregarHabitacion(2, 38, "B", 2);
        habit.agregarHabitacion(1, 20, "C", 1);
        habit.agregarHabitacion(2, 38, "C", 1);
        habit.agregarHabitacion(1, 20, "D", 3);
        habit.agregarHabitacion(2, 38, "D", 1);
        habit.agregarHabitacion(1, 20, "E", 1);
        habit.agregarHabitacion(2, 38, "E", 2);
        habit.agregarHabitacion(1, 20, "F", 1);
        habit.agregarHabitacion(2, 38, "F", 1);
        habit.agregarHabitacion(1, 20, "G", 3);
        habit.agregarHabitacion(2, 38, "G", 1);
        
        
        Paquete paque2 = new Paquete();
        paque2.setNombre("Basico");
        paque2.setPrecio(23);
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("Internet");
        paque2.setServicio(aux);
        paquete.paque.add(paque2);
        
        Paquete paque3 = new Paquete();
        paque3.setNombre("Premium");
        paque3.setPrecio(50);
        ArrayList<String> aux2 = new ArrayList<String>();
        aux2.add("Internet");
        aux2.add("TV");
        aux2.add("Discoteca");
        paque3.setServicio(aux2);
        paquete.paque.add(paque3);
        
        client.setNombre("Mauricio");
        client.setApellidos("Sanchez");
        client.setGenero("Masculino");
        client.setDireccion("Colonia las mercedez");
        client.setTargetacredito("22344234");
        client.setTelefono("72245676");
        client.setDui("056120044");
        client.clientes.add(client);
    }
}
