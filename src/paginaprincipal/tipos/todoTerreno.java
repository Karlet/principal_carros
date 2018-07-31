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
public class todoTerreno extends Coche {
    private boolean traccion; //4x4 
   
       public todoTerreno (){
           this.setVelocidad(80);
           this.setTipo("todoTerreno");
       }
    
    
       public todoTerreno(int llantas, int puertas, int velocidad, boolean traccion){
        super(llantas,puertas, velocidad);
        this.traccion = traccion;
       }
    
    
    
    /**
     * @return the traccion
     */
    public boolean isTraccion() {
        return traccion;
    }

    /**
     * @param traccion the traccion to set
     */
    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    
}
    
    
    
