/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4_melvinrivas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author l3306
 */
class Mascota {
    protected String nombre;
      private int codigo;
    Color color; //visibilidad package
    public Date fecha;
    private double precio;
    private ArrayList<String> caracteristicas=
            new ArrayList();
        
    //const

    public Mascota( String nombre,int codigo, Color color, Date fecha, double precio) {
        
        this.nombre = nombre;
        this.codigo = codigo;
        this.color = color;
        this.fecha = fecha;
        this.precio = precio;
    }

    

        
    //mut
    public void setCodigo(int c) throws Exception{
        if (c>=1 && c<=100) {
            codigo=c;
        }
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    
    public void setFecha(Date f){
        fecha=f;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public Color getcolor (){
        return color;
    }
    
    public Color setcolor (Color c){
        color = c;
        return c;
    }
    
    public double getprecio (){
    return precio;
    }
    
    public void setprecio(double p){
        precio = p;
}
    
    //ma

    @Override
    public String toString() {
        return "nombre: " + nombre + ", codigo: " + codigo + ", color: " + color + ", fecha: " + fecha + ", precio: " + precio + ", caracteristicas: " + caracteristicas ;
    }
    
   
    
}
