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
public  class Empleado {
    
   
         private String primerNombre;
         private String apellidoPaterno;
         private String numeroSeguroSocial;
         
 public Empleado(String nombre, String apellido, String nns){
     primerNombre = nombre;
     apellidoPaterno = apellido;
     numeroSeguroSocial = nss;     
 }
 public void establecerPimerNombre(String nombre){
     primerNombre = nombre;     
 }
 public String obtenerPrimerNombre(){
     return primerNombre;
 }
 public void establecerApellidoPaterno(String apellido){
     apellidoPaterno = apellido;
 }
 public String obtenerApellidoPaterno(){
     return apellidoPaterno;
 }
 public void establecerNumeroSeguroSocial(String nss){
   numeroSeguroSocial = nss;  
 }
 public String obtenerNumeroSocial(){
     return numeroSeguroSocial;
 }
 public String toString(){
     return String.format(%s %s \numero de seguro social: %s,obtenerPrimerNombre(),
     obtenerPrimerApellido(),obtenerNumeroSeguroSocial());
 }
 public abstract double ingreso();
 
 
}
    
   
