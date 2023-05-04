
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String []paises = new String[8];
        int contador = paises.length;
        
        //Rellenar la matriz
        for(int i= 0; i < paises.length; i++){
            String elemento = JOptionPane.showInputDialog("Escriba un pais (Quedan " + contador);
            paises[i] = elemento;
        }
    
        //recorrer matriz for
        for (int i =0; i < paises.length; i++){
            System.out.println("Paises con ciclo for " + paises[i] );
        }
        System.out.print("\n============================================\n");
        
        
        //recorrer matriz for each
        for(String elementos:paises){
            System.out.println("Paises con for each " + elementos);
        }       
    }
    
}
