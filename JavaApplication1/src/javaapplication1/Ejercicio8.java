/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author PC01
 */
public class Ejercicio8 {


    public static void main(String[] args) {
    System.out.println("Ingrese un numero entero positivo N");
    int num1,num2 = 0,i,valor = 0;
    Scanner sc=new Scanner (System.in);
    num1=sc.nextInt();

    
    for ( i = 0; i < num1; i++) {
            System.out.println("Ingrese un valor ");
            valor=sc.nextInt();
   num2 = num2+valor;

}
       System.out.println(num2);
    }
    
}
