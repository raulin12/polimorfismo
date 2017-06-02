/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author melgas
 */
public class empleadoAsalariado {
    private double salarioSemanal;
    
public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
    super (nombre,apellido,nss);
    establecerSalarioSemanal (salario);
    
}
public void establecerSalarioSemanal (double salario){
    if(salario>=0.0)
        salarioSemanal = salario;
    else
        throw new illegalArgumentException("el salario semanal dede ser >=0.0");
    
}
public double obtenerSalarioSemanal()
{
    return salarioSemanal;
}
public double ingreso()
{
    return obtenerSalarioSemanal();
}
public String toString()
{
    return String.format("empleado Asalariado", super.toString(),"salario semanal", obtenerSalarioSemanal());
}
}
