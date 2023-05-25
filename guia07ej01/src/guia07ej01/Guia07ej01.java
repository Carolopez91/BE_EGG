/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07ej01;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Guia07ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in);
int numero1;
int numero2;
int suma;
System.out.println("Ingresa el pirmer numero");
numero1 = leer.nextInt();
System.out.println("Ingresa el segundo numero");
numero2 = leer.nextInt();
suma= numero1 + numero2;
        System.out.println("El valor de la suma de los numeros " +numero1+ " y " +numero2+ " es igual a " +suma );}
    
}
