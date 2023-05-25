/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07ej03;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Guia07ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String frase;
   String mayus;
   String minus;
    Scanner leer= new Scanner (System.in);
     System.out.println("Ingrese una frase");
    frase= leer.next();
    
   mayus=frase.toUpperCase();
   minus=frase.toLowerCase();
        System.out.println("La frase ingresada es " +frase); 
        System.out.println("La frase en mayusculas es " +mayus);
           System.out.println("La frase en minusculas es "+minus);
    
    }
    
}
