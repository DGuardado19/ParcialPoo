
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
    int habit;

    public int getHabit() {
        return habit;
    }

    public void setHabit(int habit) {
        this.habit = habit;
    }
    
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
        ha.setPiso(letra); 
        ha.setHabit(Nhabitacion);
        ha.setTipo("Hola");
        switch (estado) {
            case 1:
                ha.setEstado("Habilitado");
                break;
            case 2:
                ha.setEstado("Desabilitado");
                break;
            case 3:
                ha.setEstado("Reservado");
                break;
            default:
                break;
        }
        habitacion.add(ha);
    }
    
    public void mostrarHabitaciones(){
        for(Habitacion recorrer: habitacion){
            System.out.println("Habitacion: "+recorrer.getHabit());
            System.out.println("Piso: "+recorrer.getPiso());
            System.out.println("Precio por noche: "+recorrer.getPrecio());
            System.out.println("Estado: "+recorrer.getEstado());
        }
    }
}
