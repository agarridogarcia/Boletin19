
package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

   
    public static void main(String[] args) {
        Libreria li=new Libreria();
      int opcion;
         
         do{
             try{
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Cargar Libros \n2 Amosar libros con Iterator \n3 Vender \n4 Borrar libros que se acabaron \n5 Consultar libro \n6 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1: li.cargarLibros();
                break;
            case 2:li.amosar();
                break;
            case 3:li.vender();
                break;
            case 4:li.borrarLibrosAcero();
                break;
            case 5:li.consultarLibro();
                break;
            
            case 6:System.exit(0);
            
    }
    
}while(opcion<6);

    
}
      
}
    

