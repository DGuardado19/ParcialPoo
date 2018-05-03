/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author RobertoHer
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private ArrayList<Fecha> datos;
    public Fecha(){
        datos = new ArrayList<>();
    }

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void add(Fecha dato){
       datos.add(dato);
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ingrese el dia: ");
        dato.setDia(input.nextInt());
        
        System.out.println("Ingrese el mes: ");
        dato.setMes(input.nextInt());
        
        System.out.println("Ingrese el anio: ");
        dato.setAnio(input.nextInt());
        
        
    }
    public void mostrar(){
        for(Fecha yu : datos){
            System.out.println("La fecha es: "+yu.getDia()+"/"+yu.getMes()+"/"+yu.getAnio()+"/");
        }
    }
    }

