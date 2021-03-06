
package parcialpoo;

import java.util.*;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Cliente extends DUI {

    private Cliente() {
        clientes = new ArrayList<>();
    }

    private static Cliente client;

    public static Cliente getInstance() {
        if (client == null) {
            client = new Cliente();
        }
        return client;
    }

    private String nombre, apellidos, dui, genero, telefono, direccion, targetacredito;
    public ArrayList<Cliente> clientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTargetacredito() {
        return targetacredito;
    }

    public void setTargetacredito(String targetacredito) {
        this.targetacredito = targetacredito;
    }

    public void add() {
        Cliente p1 = Cliente.getInstance();
        clientes.add(p1);
        DUI d = new DUI();
        String dui;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        p1.setNombre(input.nextLine());
        System.out.print("Ingrese el apellido: ");
        p1.setApellidos(input.nextLine());
        System.out.print("Ingrese el genero: ");
        p1.setGenero(input.nextLine());
        System.out.print("Ingrese el telefono: ");
        p1.setTelefono(input.nextLine());
        System.out.print("Ingrese el  direccion : ");
        p1.setDireccion(input.nextLine());
        System.out.print("Ingrese el tarjeta de credito: ");
        p1.setTargetacredito(input.nextLine());
        System.out.print("Ingrese el dui: ");
        dui = leer.next();

        while (!d.PedirD(dui)) {
            System.out.print("Ingrese un dui valido: ");
            dui = leer.next();
        }

        p1.setDui(dui);
    }

    public void clear() {
        System.out.println("--- Clientes eliminados ---");
        clientes.clear();//Por el momento elimina todo PERO sigue mostrando el nombre del paquete 
    }

    public void eliminarcliente(int cliente) {
        int cont = 1;
        for (Cliente recorrer : clientes) {
            ++cont;
        }
        if (cliente <= cont) {
            clientes.remove(cliente - 1);
            System.out.println("El cliente se ha eliminado con exito :)");
        } else {
            System.out.println("El cliente no existe :3");
        }
    }

    public void mostrar() {
        System.out.println("--- MOSTRANDO LA LISTA DE CLIENTES ---");
        int cont = 1;
        for (Cliente a : clientes) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("cliente " + cont);
            System.out.println("Nombres: " + a.getNombre());
            System.out.println("Apellidos: " + a.getApellidos());
            System.out.println("Genero: " + a.getGenero());
            System.out.println("Telefono: " + a.getTelefono());
            System.out.println("Direccion: " + a.getDireccion());
            System.out.println("Targeta: " + a.getTargetacredito());
            System.out.println("dui: " + a.getDui());
            System.out.println("----------------------------------------------------------");
            ++cont;

        }
    }
}
