/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmover;

import paginaprincipal.Coche;
import paginaprincipal.tipos.*;
import paginaprincipal.utileria.motor;


/**
 *
 * @author Karla
 */
public class PaginaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        deportivos d1 = new deportivos();
        familiares f1 = new familiares();
        todoTerreno t1 = new todoTerreno();
        
        double tiempoD1 = d1.avanza(100);
        double tiempoF1 = f1.avanza(100);
        double tiempoT1 = t1.avanza(100);
        

       Coche listaDeCoches[] = new Coche[5];
       listaDeCoches[0] = t1;
       listaDeCoches[1] = f1;
       listaDeCoches[2] = d1;
       
       Coche cocheGanador = listaDeCoches[0];
       
       for(int i=1; i<3;i++){
           if(cocheGanador.avanza(100)> listaDeCoches[i].avanza(100)){
               cocheGanador = listaDeCoches[i];
           }
       }
        
       System.out.println("el coche ganador recorre 100km en: " + cocheGanador.avanza(100));
       System.out.println("y este coche es de tipo: " + cocheGanador.getTipo());
               
       
       
               
        
        
        
        
        
        
        
    }
  
    
    
    
}
