
package boletin17;

import java.util.Collections;

/**
 *
 * @author agarridogarcia
 */
public class Numeros {
    private int [] numeros=new int [6];
    
    public void cargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int) (Math.random()*50+1); 
        }
           
         
    }
    public void amosar(){
        for(int i=5; i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
   
    
}
