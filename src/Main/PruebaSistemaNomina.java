/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author melgas
 */
public class PruebaSistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("john","smith","111-111-111", 800.00);
       EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("karen","price","222-22-222", 40);
       EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("sue","jones","333-33-333", 06);
       EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("bob","lewis","444-44-444", 300);
       
        
        System.out.println("empleados porcesados por separado");
         System.out.println(empleadoAsalariado + "ingresos" + empleadoAsalariado.ingresos());
          System.out.println(empleadoAsalariado + "ingresos" + empleadoAsalariado.ingresos());
          System.out.println(empleadoAsalariado + "ingresos" + empleadoAsalariado.ingresos());
          System.out.println(empleadoAsalariado + "ingresos" + empleadoAsalariado.ingresos());
         
          empleado [] empleos = new Empleado [4];
          
          empleados [0] = empleadoAsalariado;
          empleados [1] = empleadoAsalariado;
          empleados [2] = empleadoAsalariado;
          empleados [3] = empleadoAsalariado;
        
          
          System.out.println("empleados procesados en forma poliformica");
          
          for(empleadoActual : empleados)
          {
              System.out.println("empleo actual");
              
              if (empleoActual instanceof empleadoBaseMasComision){
                  
                  empleadoBaseMasComision empleado = (empleadoBaseMasComision) empleoActual;
                  
                  empleado.establecerSalarioBase (1.10 * empleado.obtenerSalarioBase());
                  System.out.printf("el nuevo salario base con el 10%", empleado.obtenerSalarioBase);
              }
              System.out.printf("ingresos", emplesoActual.ingresos());
          }
          
          for (int j = 0; j < empleados.lenght; j++)
              System.out.printf("el empleado es un", j, empleados [j].getClass().getName());
        
    }
    
}
