/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07eje4;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Guia07eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    double centigrados;
    double farenheit;

    Scanner leer= new Scanner (System.in);
     System.out.println("Ingrese la cantidad de grados centigrados");
    centigrados= leer.nextDouble();
    farenheit= 32+ ((9*centigrados)/5);
        System.out.println("El equivalente en grado Farenheit es "+farenheit);
    
    
    }
    
}
