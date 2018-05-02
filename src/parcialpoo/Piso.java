
package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Piso {
    public Piso(){
        
    }
    
    public ArrayList<Piso> Piso = new ArrayList<Piso>();
    
    private String Letra;

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }
    
    public void agregarPiso(String letra){
        Piso piso = new Piso();
        piso.setLetra(letra);
        Piso.add(piso);
    }
    
    public void modificarPiso(int Npiso, String letra){
        Piso piso = new Piso();
        piso.setLetra(letra);
        Piso.add(Npiso-1, piso);
        Piso.remove(Npiso);
    }
    
    public void eliminarPiso(int Npiso){
        Piso.remove(Npiso-1);
    }
    
    public void mostrarPiso(){
        System.out.println("------------Pisos--------------");
        int cont = 1;
        for(Piso recorrer: Piso){
            System.out.print(cont+" - ");
            System.out.print(recorrer.getLetra()+"\n");
            ++cont;
        }
    }
}
