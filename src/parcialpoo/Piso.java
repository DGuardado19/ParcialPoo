
package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Piso{
    
    public Piso(){
        
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
    
    public void agregarPiso(String letra){
        Piso piso = new Piso();
        piso.setEstado("Habilitado");
        piso.setLetra(letra);
        Piso.add(piso);
    }
    
    public void modificarPisoLetra(int Npiso, String letra){
        Piso piso = new Piso();
        piso.setLetra(letra);
        piso.setEstado(Piso.get(Npiso-1).getEstado());
        Piso.add(Npiso-1, piso);
        Piso.remove(Npiso);
    }
    
    public void modificarPisoEstado(int Npiso, int Estado){
        Piso piso = new Piso();
        piso.setLetra(Piso.get(Npiso-1).getLetra());
        if(Estado == 1){
            piso.setEstado("Habilitada");
        }else if(Estado == 2){
            piso.setEstado("Desabilitada");
        }
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
    
    public boolean verificarPiso(String letra){
        boolean bandera = false;
        for(Piso recorrer: Piso){
            if(recorrer.getLetra().equals(letra)){
                bandera = true;
            }
        }
        return bandera;
    }
}
