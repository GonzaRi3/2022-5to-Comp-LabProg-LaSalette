/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author PC01
 */
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Belen","Hipolito",1000.0);
        Empleado e2 = new Empleado("Gonza","Tevez",288000.0);
        
        e1.mostrarResumen();
        e2.mostrarResumen();
    }
}
