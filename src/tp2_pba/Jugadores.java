/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_pba;

/**
 *
 * @author PC MASTER
 */
public class Jugadores {
    private String nombre;
    private String posicion;
    private int goles;
    private int partidosJugados;
    private double promedio;
    
    
    public Jugadores (){}
    
    public Jugadores (String nombre,String posicion,int partidosJugados){
        this.nombre=nombre;
        this.posicion=posicion;
        this.partidosJugados=partidosJugados;        
    }
    
    public Jugadores (String nombre, String posicion,int goles,int partidosJugados,double promedio){
        this.nombre=nombre;
        this.posicion=posicion;
        this.goles=goles;
        this.partidosJugados=partidosJugados;
        this.promedio=promedio;
    }
    
    public String getNombre(){
        return nombre;
        }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPosicion(){
        return posicion;
    }
    public void setPosicion (String posicion){
        this.posicion=posicion;
    }
    public int getGoles (){
        return goles;
    }
    public void setGoles(int goles){
        this.goles=goles;
    }
    public int getPartidosJugados(){
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados){
        this.partidosJugados=partidosJugados;
    }
    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio=promedio;
    }
    
   
}

