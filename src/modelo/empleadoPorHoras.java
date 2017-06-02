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
public class empleadoPorHoras {
    
    private double sueldo;
    private double horas;

public empleadoPorHoras(String nombre, String apellido, String nss, double sueldoPorHoras.
double horasTrabajadas){
    super (nombre,apellido,nss)
            establecerSueldo(sueldoPorHoras);
            establecerHoras(horasTrabajdas);
}
    public void establecerSueldo(double sueldoPorHoras)
    {
        if (sueldoPorHoras >= 0.0)
            sueldo = sueldoPorHoras;
        else
            throw new illegalArgumentException("el sueldo por horas debe ser")
    }
    public double obteberSueldo()
    {
        return sueldo;
    }
    
    public void establecerHoras(double horasTrabajadas)
    {
        if ((horasTrabajadas >=0.0)&&(horasTrabajadas <= 168.0))
            horas = horasTrabajadas;
        else
            throw new illegalArgumentException("las horas deden ser");
    }
    public double obtenerHoras()
    {
        return horas;
    }
    
    public double ingresos()
    {
        if(obtenerHoras()<= 40)
            return obtenerSueldo()* obtenerHoras();
        else
            return 40 *obtenerSueldo() + (obtenerHoras()-40)*obtenerSueldo()*1.5;
    }
    
    public String toString()
    {
        return String.format("empleado por horas",super.toString(),"sueld por hora", obtenerSueldo(),
                "horas trabajadas", obtenerHoras());
    }
}
