/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistxogador;

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
    
   
    public int compareTo(Object o){
        Xogador xog=(Xogador)o;
        
        if(this.nome.compareToIgnoreCase(xog.nome)==0)
        return 0;
       
        else if (this.nome.compareToIgnoreCase(xog.nome)<0)
            return 1;
        else
            return -1;
        
    }
}
