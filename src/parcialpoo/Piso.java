
package parcialpoo;

import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Piso {

    private static Piso piso;

    public static Piso getInstance() {
        if (piso == null) {
            piso = new Piso();
        }
        return piso;
    }

    public Piso() {
        Piso = new ArrayList<>();
    }

    public ArrayList<Piso> Piso = new ArrayList<Piso>();

    private String Letra;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public void agregarPiso(String letra) {
        Piso piso = new Piso();
        piso.setEstado("Habilitado");
        piso.setLetra(letra);
        Piso.add(piso);
        ordenarLista();
    }

    public void modificarPisoEstado(String Lpiso, int Estado) {
        int cont = 0, aux = 0;
        
        for (Piso recorrer : Piso) {
            if (recorrer.getLetra().equals(Lpiso)) {
                aux = cont;
            }
            ++cont;
        }
        
        Piso piso = new Piso();
        piso.setLetra(Piso.get(aux).getLetra());
        
        if (Estado == 1) {
            piso.setEstado("Habilitada");
        } else if (Estado == 2) {
            piso.setEstado("Desabilitada");
        }
        
        Piso.add(aux, piso);
        Piso.remove(aux + 1);
    }

    public void eliminarPiso(String Lpiso) {
        int cont = 0, aux = 0;
        Habitacion habit = Habitacion.getInstance();
        
        for (Piso recorrer : Piso) {
            if (recorrer.getLetra().equals(Lpiso)) {
                aux = cont;
            }
            ++cont;
        }

        String respuesta;
        int nh = habit.verificarExistenciaHabitacionesEnPiso(Piso.get(aux).getLetra());
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Desea eliminar " + nh + " habitaciones?(s/n): ");
        respuesta = leer.next();
        
        if ("s".equals(respuesta)) {
            habit.eliminarHabitacionDePiso(Piso.get(aux).getLetra());
            Piso.remove(aux);
        } else {
            System.err.println("CANCELADO!!!");
        }
    }

    public void mostrarPiso() {
        int cont = 1;
       
        System.out.println("------------Pisos--------------");
        
        for (Piso recorrer : Piso) {            
            System.out.print(cont + " - ");
            System.out.print(recorrer.getLetra() + " - ");
            System.out.println(recorrer.getEstado() + "\n");
            ++cont;
        }
    }
    
    public void ordenarLista(){
        Piso aux1;
        
        for(int i = 0; i < Piso.size(); i++){
            for(int x = 0; x < Piso.size(); x++){
                if(Piso.get(x).getLetra().hashCode() > Piso.get(i).getLetra().hashCode()){
                    aux1 = Piso.get(i);
                    Piso.set(i, Piso.get(x)); 
                    Piso.set(x, aux1); 
                }
            }            
        }
    }

    public boolean verificarPiso(String letra) {
        boolean bandera = false;
        
        for (Piso recorrer : Piso) {
            if (recorrer.getLetra().equals(letra)) {
                bandera = true;
            }
        }
        return bandera;
    }
}
