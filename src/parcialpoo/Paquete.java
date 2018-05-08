
package parcialpoo;

import java.util.*;

/**
 *
 * @author RobertoHer
 */
public class Paquete {

    private static Paquete paquete;

    /**
     * Se ocupa el metodo singleton para no perder los datos y hacerlo mas eficiente
     * @return 
     */
    public static Paquete getInstance() {
        if (paquete == null) {
            paquete = new Paquete();
        }
        return paquete;
    }
    /**
    * Declarando los atributos necesarios.
    * Se necesitan dos listas. Una para guardar el nombre y el precio
    * y la otra para guardar los servicios del paquete
    */
    public String nombre;
    public double precio;
    public ArrayList<String> Servicio;
    public ArrayList<Paquete> paque = new ArrayList<>();
    int cont = 0;
    /**
     * Creando metodos set y get y constructores necesarios para inicializar
     * el objeto
     * @param nombre
     * @param Servicio 
     */
    public Paquete(String nombre, ArrayList<String> Servicio) {
        this.nombre = nombre;
        this.Servicio = Servicio;
    }
    //Aca se inicializa el arrayList
    public Paquete() {
        Servicio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getServicio() {
        return Servicio;
    }

    public void setServicio(ArrayList<String> Servicio) {
        this.Servicio = Servicio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Funcion agregar. Toma como parametros el nombre del paquete
     * y el precio del paquete
     * @param pa
     * @param pre 
     * Funcion necesaria para pedir el nombre del paquete, el precio y los
     * "N" servicios que tendra el paquete.
     * Sin retornar nada.
     */
    public void agregar(String pa, double pre) {
        Paquete paq = new Paquete();
        ArrayList<String> aux = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.println("Ingrese el nombre del paquete: ");
        paq.setNombre(pa);
        System.out.println("Ingrese el precio del paquete: ");
        paq.setPrecio(pre);
        System.out.println("Ingrese cuantos servicios agregara: ");
        valor = input.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.print("Servicio: ");
            aux.add(input.next());

        }

        System.out.println("Numero del paquete: " + cont);
        paq.setServicio(aux);
        paque.add(paq);
    }

        /**
         * Metodo mostrar. Se muestran en consola el nombre, precio, el CODIGO del paquete
         * y los servicios que este tenga
         */
    public void mostrar() {
        int cont = 1;
        for (Paquete correr : paque) {
            System.out.println("------------------------------");
            System.out.println("Codigo del paquete: " + cont);
            System.out.println("Nombre al paquete: " + correr.getNombre());
            System.out.println("Precio: $" + correr.getPrecio());
            ++cont;

            for (String correr2 : correr.getServicio()) {
                System.out.println("Servicios: " + correr2);
            }

            System.out.println("---------------------------");
        }
    }

    /**
     * Eliminar todos los paquetes ya creados
     */
    public void clear() {
        Servicio.clear();
        paque.clear();
        System.out.println("--- PAQUETES ELIMINADOS ---");

    }
    /**
     * Eliminar paquete pero recibiendo como parametro el CODIGO
     * del paquete para poder acceder a el.
     * @param paq 
     */
    public void EliminarPaquete(int paq) {
        int cont = 1;
        
        for (Paquete correr : paque) {
            ++cont;
        }
        
        if (paq <= cont) {
            paque.remove(paq - 1);
            System.out.println("El paquete se elimino");
        } else {
            System.out.println("El paquete no existe");
        }
    }

    /**
     * Agregar un nuevo servicio al paquete.
     * Tomando como parametros el CODIGO del paquete y el STRING 
     * del acceso o servicio nuevo que se agregara
     * @param numero
     * @param acceso 
     */
    public void add(int numero, String acceso) {
        ArrayList<String> aux = new ArrayList<String>();
        Paquete auxi = new Paquete();

        auxi.setNombre(paque.get(numero - 1).getNombre());
        auxi.setPrecio(paque.get(numero - 1).getPrecio());

        aux = paque.get(numero - 1).getServicio();
        aux.add(acceso);
        auxi.setServicio(aux);

        paque.set(numero - 1, auxi);

    }

}
