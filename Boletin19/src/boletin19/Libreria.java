
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import libreriaaraceli.LibreriaAraceli;
import static libreriaaraceli.LibreriaAraceli.pedirFloat;
import static libreriaaraceli.LibreriaAraceli.pedirInt;
import static libreriaaraceli.LibreriaAraceli.pedirString;


public class Libreria {
   
    //private ArrayList <Libro> libreria1;
    ArrayList <Libro> libreria1=new ArrayList <Libro>();
    
    
    public Libreria(){
        libreria1 =new ArrayList <Libro>();
        
    }
    

    public void cargarLibros(){
        Libro li=new Libro(pedirString(),pedirString(),pedirString(),pedirFloat(),pedirInt());
        libreria1.add(li);
    
    }
    public void amosar(){
   
    Iterator <Libro> meu_iterator=libreria1.iterator();
    while(meu_iterator.hasNext()){
            System.out.println(meu_iterator.next());
}
}

public void vender(){
    Libro li=new Libro(pedirString(),pedirString(),pedirString(),pedirFloat(),pedirInt());
    
    for(int i=0;i<libreria1.size();i++){
          
           if(li.isbn.equals(libreria1.get(i).isbn)){
               
             if(libreria1.get(i).getNumExemplares()>=li.numExemplares){
                   
               
                 libreria1.get(i).setNumExemplares((libreria1.get(i).numExemplares -li.numExemplares ));
             }else
                 System.out.println("Non hai unidades suficientes deste exemplar dispoñibles");
    }}

  
    
   



}
   

public void borrarLibrosAcero(){
    for(int i=0;i<libreria1.size();i++){
        if(libreria1.get(i).numExemplares==0)
            libreria1.remove(i);

    }
}



public void consultarLibro(){
    
    String libros=JOptionPane.showInputDialog("Libro que queres ver si hai: ");
            boolean atopado=false;
            for(int i=0;i<libreria1.size();i++){
                if(libreria1.get(i).titulo.equals(libros));
                System.out.println("O libro está na lista");
                atopado=true;
            }
            if(atopado=false)
                System.out.println("O libro non está na lista");
            
}
public void ordenar(){
    Collections.sort(libreria1);
    
    }
}

