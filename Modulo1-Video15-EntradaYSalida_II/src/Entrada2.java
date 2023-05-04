
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Entrada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        
        int imprimir = Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre +", el año que viene tendra " + (imprimir+1) + " años");
    }
    
}
