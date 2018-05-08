
package parcialpoo;

import java.util.*;

import java.util.Scanner;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class DUI {

    Scanner leer = new Scanner(System.in);

    public DUI() {
    }

    public boolean PedirD(String dui) {
        try {
            int cont = 9;
            int aux, total = 0;
            for (int i = 0; i < dui.length() - 1; i++) {
                aux = Integer.parseInt(String.valueOf(dui.charAt(i))) * cont;
                total += aux;
                //System.out.println(aux);
                --cont;
            }
            aux = Integer.parseInt(String.valueOf(dui.charAt(8)));
            int b;
            b = 10 - (total % 10);
            if (b == aux) {
                return true;
            } else {
                return false;
            }

        } catch (Exception r) {
            System.err.println("Cantidad insuficiente de numeros");
            return false;
        }
    }
}
