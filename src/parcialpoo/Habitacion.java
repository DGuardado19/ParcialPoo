package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Habitacion {

    private Habitacion() {
    }

    private static Habitacion habi;

    public static Habitacion getInstance() {
        if (habi == null) {
            habi = new Habitacion();
        }
        return habi;
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

    public void agregarHabitacion(int Nhabitacion, double precio, String letra, int estado) {
        Piso piso = Piso.getInstance();
        Habitacion ha = new Habitacion();
        ha.setPrecio(precio);
        
        if (piso.verificarPiso(letra)) {
            ha.setPiso(letra);
            ha.setHabit(Nhabitacion);
            
            if (Nhabitacion % 2 == 0) {
                ha.setTipo("Doble");
            } else {
                ha.setTipo("Sencilla");
            }
            
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
        } else {
            System.err.println("El piso seleccionado no existe!");
        }
    }

    public void modificarHabitacionEstado(String piso, int nHabi, int estado) {
        Habitacion h = new Habitacion();
        boolean verificar = false;
        int cont = 0, aux = 0;
        
        for (Habitacion recorrer : habitacion) {
            if (recorrer.getPiso().equals(piso)) {
                if (recorrer.getHabit() == nHabi) {
                    verificar = true;
                    aux = cont;
                }
            }
            ++cont;
        }
        
        if (verificar == true) {
            h.setHabit(habitacion.get(aux).getHabit());
            h.setPrecio(habitacion.get(aux).getPrecio());
            h.setTipo(habitacion.get(aux).getTipo());
            h.setPiso(habitacion.get(aux).getPiso());
            
            switch (estado) {
                case 1:
                    h.setEstado("Habilitado");
                    break;
                case 2:
                    h.setEstado("Desabilitado");
                    break;
                case 3:
                    h.setEstado("Reservado");
                    break;
                default:
                    break;
            }
            
            habitacion.add(aux, h);
            habitacion.remove(aux + 1);
        } else {
            System.err.println("La habitacion no existe!!!!");
        }
    }

    public void eliminarHabitacionDePiso(String lPiso) {
        Habitacion habit = getInstance();
        int cont = 0, cont2 = 0;
        int nh = habit.verificarExistenciaHabitacionesEnPiso(lPiso);
        int[] arreglo = new int[nh];
        
        for (Habitacion recorrer : habitacion) {
            if (recorrer.getPiso().equals(lPiso)) {
                System.out.println(cont - cont2);
                arreglo[cont2] = cont - cont2;
                ++cont2;
            }
            ++cont;
        }
        
        for (int i = 0; i < nh; ++i) {
            habitacion.remove(arreglo[i]);
        }
    }

    public void eliminarHabitacion(String piso, int numero) {
        boolean verificar = false;
        int cont = 0, aux = 0;
        
        for (Habitacion recorrer : habitacion) {
            if (recorrer.getPiso().equals(piso)) {
                if (recorrer.getHabit() == numero) {
                    verificar = true;
                    aux = cont;
                }
            }
            ++cont;
        }
        
        if (verificar == true) {
            habitacion.remove(aux);
        } else {
            System.err.println("La habitacion no existe!!!!");
        }
    }

    public void mostrarHabitaciones() {
        for (Habitacion recorrer : habitacion) {
            System.out.println("------------------------------------------------");
            System.out.println("Habitacion: " + recorrer.getHabit());
            System.out.println("Piso: " + recorrer.getPiso());
            System.out.println("Precio por noche: " + recorrer.getPrecio());
            System.out.println("Tipo: " + recorrer.getTipo());
            System.out.println("Estado: " + recorrer.getEstado());
            System.out.println("------------------------------------------------");
        }
    }

    public int verificarExistenciaHabitacionesEnPiso(String letra) {
        int cont = 0;
        
        for (Habitacion recorrer : habitacion) {
            if (recorrer.getPiso().equals(letra)) {
                ++cont;
            }
        }
        
        return cont;
    }
}
