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

public class Menu {
    
    public void iniciar(){
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.print("---------BIENVENIDO-----------\n");
        System.out.print("----Hotel Vina Raphiña--------\n");
        System.out.print("1. tal \n");
        System.out.print("2. tal \n");
        System.out.print("3. tal \n");
        System.out.print("4. tal \n");
        System.out.print("5. tal \n");
        System.out.print("Opcion hotel, que desea hacer? (provicional)\n");
        opc = leer.nextInt();
        System.out.println("");
        switch (opc) {
            case 1:
                System.out.println("parcialpoo.main.main()");
                break;
            case 2:
                System.out.println("parcialpoo.main.main()");
                break;
            case 3:
                System.out.println("parcialpoo.main.main()");
                break;
            case 4:
                System.out.println("parcialpoo.main.main()");
                break;
            case 5:
                System.out.println("parcialpoo.main.main()");
                break;
            case 6:
                System.out.println("parcialpoo.main.main()");
                break;
            case 7:
                System.out.println("parcialpoo.main.main()");
                break;
            case 8:
                System.out.println("parcialpoo.main.main()");
                break;
            case 9:
                System.out.println("parcialpoo.main.main()");
                break;
            default:
                break;

        }
    }
}
