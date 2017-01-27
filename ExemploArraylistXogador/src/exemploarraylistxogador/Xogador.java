/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistxogador;

import java.util.Objects;

/**
 *
 * @author agarridogarcia
 */
public class Xogador implements Comparable{
    private int dorsal;
    private String nome;

    public int getDorsal() {
        return dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Xogador(int dorsal, String nome) {
        this.dorsal = dorsal;
        this.nome = nome;
    }

    public Xogador() {
    }

    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", nome=" + nome + '}';
    }
    
   /**
    * 
    * @param o metodo para ordenar
    * @return 
    */
    public int compareTo(Object o){
        Xogador xog=(Xogador)o;
        
        if(this.nome.compareToIgnoreCase(xog.nome)==0)
        return 0;
       
        else if (this.nome.compareToIgnoreCase(xog.nome)<0)
            return 1;
        else
            return -1;
        
    }
    //sirve para borrar xogador
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Xogador other = (Xogador) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}
