/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07ej05;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Guia07ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   double numero;
    
    
    Scanner leer= new Scanner (System.in);
     System.out.println("Ingrese un numero entero");
    numero= leer.nextDouble();
        System.out.println("El doble del numero es "+numero*2);
        System.out.println("El triple del numero es "+numero*3);
        //Math.sqrt(numero) raiz cuadrada siempre definida como double
        System.out.println("La raiz cuadrada del numero es "+Math.sqrt(numero) );
    
    }
      
}
