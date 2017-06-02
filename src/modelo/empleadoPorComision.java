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
public class empleadoPorComision {
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public empleadoPorComision(String nombre, String apellido, String nss,
            double ventas, double tarifa)
    {
        super (nombre,Apellido,nss);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
    
    public void establecerTarifaComision (double tarifa)
    {
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else
            throw new illegalArgumentException("la tarifa debe ser ");
    }
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    }
    
    public void establecerVentasBrutas(double ventas)
    {
        if (ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new illegalArgumentException("las ventas brutas deben ser");
    }
    
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    }
    
    public double ingreso()
    {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    public String toString()
    {
        return String.format("%s:","empleado por comision", super.toString(), "tarifa de comision", obtenerTarifaComision());
    }    
}
