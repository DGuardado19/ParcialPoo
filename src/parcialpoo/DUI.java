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

    int n;
    Scanner leer = new Scanner(System.in);

    public DUI() {
    }

    String[] PedirD(int a) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el numero verificador del dui :) :");
//        int verificador = sc.nextInt();
//        Scanner a = new Scanner(System.in);
//        System.out.println("Ingrese los numeros enteros que quiera ingresar separados por una coma ',' , Presione Enter para terminar: ");
//        String dui =a.nextLine();
//        String [] du = dui.split(",");
        int[] arreglo = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Numero " + String.valueOf(i + 1) + ": ");
            arreglo[i] = leer.nextInt();
            
        }

        System.out.println("");

        for (int i = 0; i < a; i++) {
            System.out.println("Numero " + String.valueOf(i + 1) + ": " + String.valueOf(arreglo[i]));
        }

//        return du;

    }
}
