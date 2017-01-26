/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistxogador;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class ExemploArraylistXogador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equi=new Equipo();
       
        /*equi.pedirNome();
        equi.pedirDorsal();
         equi.cargarLista();
         equi.amosar1();
         equi.amosar2();*/
         
         int opcion;
         
         do{
          opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Cargar Lista \n2 Amosar Iterator\n3 Amosar for each \n4 Ordenar \n5 Salir"));
        switch(opcion){
            case 1: equi.cargarLista();
                break;
            case 2:equi.amosar1();
                break;
            case 3:equi.amosar2();
                break;
            case 4:equi.ordenar();
                break;
            case 5:System.exit(0);
            
    }
    
}while(opcion<5);
    
}
}
