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
public class EmpleadoBaseMasComision {
    
    private double salarioBase;
    
    public empleadoBaseMasComision(String nombre, String apellido, String nss,
            double ventas, double tarifa, double salario)
    {
        super (nombre, apellido,nss, ventas,tarifa);
        establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase (double salario)
    {
        if(salario >=0.0)
            salarioBase = salario;
        else
            throw new illegalArgumentException("el salario debe ser")
    }
    public double obtenerSalarioBase()
    {
        return salarioBase;
    }
    
    public double ingresos()
    {
        return obtenerSalarioBase() + super.ingresos();
    }
    
    public String toString()
    {
        return String.format("","con salario base",super.toString(),"salario base", obtenerSalarioBase());
    }
}



