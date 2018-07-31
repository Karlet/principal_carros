/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginaprincipal;

import paginaprincipal.utileria.motor;

/**
 *
 * @author Karla
 */
public class Coche {
    private int llantas;
    private int puertas;
    private int velocidad; 
    private String tipo;
    
    private motor motorCoche;

    public Coche (){
        this.llantas = 4;
        this.puertas = 4;
        this.velocidad = 180;
        this.motorCoche = new motor();
    }
    

    public Coche (int llantas, int puertas, int velocidad){
        this.llantas = llantas;
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.tipo = "regular";
        this.motorCoche = new motor(); 
        
    }  
    
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    
    public double avanza (double km){
        double tiempo = km / (this.velocidad * this.motorCoche.getNumeroDePistones());
        return tiempo;   
    }
    
    
    
    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
