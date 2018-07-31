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
public class familiares extends Coche {
    
    private int sillita; //asiento de bebé.

    public familiares (){
        this.setVelocidad(120);
        this.setTipo("familiar");
    }
    
    
       public familiares(int llantas, int puertas, int velocidad, int sillita){
        super(llantas,puertas, velocidad);
        this.sillita = sillita;
        
       }
    
 
    /**
     * @return the sillita
     */
    public int getSillita() {
        return sillita;
    }

    /**
     * @param sillita the sillita to set
     */
    public void setSillita(int sillita) {
        this.sillita = sillita;
    }
    
    
    
}
