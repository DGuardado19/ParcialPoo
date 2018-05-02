/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;
import java.util.Scanner;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class DUI {
    Scanner d = new Scanner(System.in);
    private String dui;
    public DUI(){
        
    }
    public void PedirD(){
        System.out.println("Ingrese el diu del cliente porfavor :) : \n");
        dui= d.nextLine();
    }
}
