/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int identidad;
    private int telefono;
    private String correo;
    
    public Persona (){
   }
   public void setNombre ( String nombre ){
       this.nombre=nombre;
   }  
   public String getNombre (){
       return this.nombre;
   }
   public void setApellido ( String apellido ){
       this.apellido=apellido;
   }
   public String getApellido (){
       return this.apellido;
   }
   public void setIdentidad( int identidad ){
       this.identidad=identidad;
   }
   public int getIdentidad (){
       return this.identidad;
   }
   public void setTelefono ( int telefono){
       this.telefono=telefono;
   }
   public int getTelefono (){
      return this.telefono;
   }
   public void setCorreo ( String correo){
       this.correo=correo;
   }
   public String getCorreo (){
     return  this.correo;
   }
   public void Salida (){
       System.out.println ("nombre :marlon");
       System.out.println ("apellido :blanco");
       System.out.println("identidad :09329090101");
       System.out.println("telefono :88191929");
       System.out.println("correo :akj@yahoo.com");
   }
}

    
