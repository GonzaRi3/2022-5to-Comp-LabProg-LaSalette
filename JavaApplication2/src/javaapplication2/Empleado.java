
package javaapplication2;


public class Empleado {
String nombre;
String apellido;
double salarioMensual;


    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        if(salarioMensual>0){
        this.salarioMensual = salarioMensual;
        }
    }

     public double obtenerSalarioAnual()
    {
        return salarioMensual * 12;
        
        
        
    }
  public double obtenerAumento()
    {
        return obtenerSalarioAnual() * 1.10;
    }
   public void mostrarResumen()
    {
        System.out.printf( "\nSu nombre es: %s" , nombre );
        System.out.printf( "\nSu apellido es: %s" , apellido );
        System.out.printf( "\nSu salario mensual es: %f" , salarioMensual );
        System.out.printf( "\nSu salario anual sin incremento es: %f" , obtenerSalarioAnual() );
        System.out.printf( "\nSu salario anual con incremento es: %f" , obtenerAumento() );
}
}
