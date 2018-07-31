/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginaprincipal.tipos;

import paginaprincipal.Coche;

/**
 *
 * @author Karla
 */
public class deportivos extends Coche {
    private boolean spoiler;
    private double capacidadDeNitrogeno; //en Litros

   
    public deportivos (){
        this.setVelocidad(300);
        this.setTipo("deportivo");
    }
    
    
    
       public deportivos(int llantas, int puertas, int velocidad, boolean spoiler, double capacidadDeNitrogeno){
        super(llantas,puertas, velocidad);
        this.spoiler = spoiler;
        this.capacidadDeNitrogeno = capacidadDeNitrogeno;
        
       }
        
    
    
    
    /**
     * @return the spoiler
     */
    public boolean isSpoiler() {
        return spoiler;
    }

    /**
     * @param spoiler the spoiler to set
     */
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    /**
     * @return the capacidadDeNitrogeno
     */
    public double getCapacidadDeNitrogeno() {
        return capacidadDeNitrogeno;
    }

    /**
     * @param capacidadDeNitrogeno the capacidadDeNitrogeno to set
     */
    public void setCapacidadDeNitrogeno(double capacidadDeNitrogeno) {
        this.capacidadDeNitrogeno = capacidadDeNitrogeno;
    }
    
    
    
}
