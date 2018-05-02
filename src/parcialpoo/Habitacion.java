
package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Habitacion extends Piso{
    public Habitacion(){
        
    }
    
    public ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();
    
    double precio;
    String tipo;
    String piso;
    String estado;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void agregarHabitacion(int Nhabitacion, double precio, String letra, int estado){
        Habitacion ha = new Habitacion();
        ha.setPrecio(precio);
        ha.setLetra(letra); 
        if(estado == 0){
            ha.setEstado("Habilitado");
        }else if(estado == 1){
            ha.setEstado("Desabilitado");
        }
    }
}
