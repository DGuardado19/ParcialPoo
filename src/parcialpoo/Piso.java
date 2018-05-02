
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
    
    private int codigo;
    private String Letra;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }
    
    public void agregarPiso(){
        Piso piso = new Piso();
        piso.setLetra("A");
        piso.setCodigo(1);
        Piso.add(piso);
    }
}
