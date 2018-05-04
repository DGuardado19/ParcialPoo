/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import com.sun.istack.internal.logging.Logger;
import java.util.InputMismatchException;

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
            System.out.println(b);
            if (b == aux) {
                System.out.println("El dui es valido, continue con el proceso  de reserva :)");
             return true;
            } else {
                System.out.println("Ups, el dui no es valido :(, intenta de nuevo");
                leer.nextLine();
            return false;}
            
        } catch (NumberFormatException e) {
            //System.out.println("You Can Only Enter Numbers!");
            System.err.println("Por favor ingrese un número");
            leer.nextLine();
            return false;
        }
    catch (Exception r){
        System.out.println("cantidad insuficiente de numeros");
        leer.nextLine();
    }

        return false;
    }
}