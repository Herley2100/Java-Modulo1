
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
        
        int []mi_matriz = new int[5];
        
        mi_matriz[0] = 1;
        mi_matriz[1] = 2;
        mi_matriz[2] = 3;
        mi_matriz[3] = 4;
        mi_matriz[4] = 5;
        
        for(int i =0; i< mi_matriz.length; i++){
            System.out.println("El valor del indice es " + mi_matriz[i]);
        }
        
    }
    
}
