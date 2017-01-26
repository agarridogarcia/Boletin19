/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistxogador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Equipo {
    
    private ArrayList <Xogador>Equipo;

    public Equipo(){
        Equipo =new ArrayList< Xogador> ();
    }
    public void cargarLista(){
        Xogador xog=new Xogador(pedirDorsal(), pedirNome());
        Equipo.add(xog);
        //Equipo.add(new Xogador(pedirDorsal(), pedirNome())); para facer todo nunha liña
    }

    public int pedirDorsal(){
    return(Integer.parseInt(JOptionPane.showInputDialog("Dorsal: ")));
    }

    public String pedirNome(){
    return  (JOptionPane.showInputDialog("nome :") );
    }
    public void amosar1(){
        Iterator<Xogador> it= Equipo.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        
    }
    }
    public void amosar2(){
        for(Xogador ele: Equipo)
            System.out.println("--" + ele);
    }
    public void ordenar(){
        Collections.sort(Equipo);
    }
    public void darDeBaixa(){
        Equipo.remove(new Integer(pedirDorsal()));
        
    }

}