
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int random = (int) (Math.random()*100);
        int adivinar =0;
        int intentos = 0;
        
        while(adivinar != random){
            adivinar = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre el 0 y el 100..."));
            
            if (adivinar < random){
                JOptionPane.showMessageDialog(null, "Más alto");
                intentos++;
            }
            else if(adivinar > random){
                JOptionPane.showMessageDialog(null, "Más bajo");
                intentos++;
            }
         
        }
        JOptionPane.showMessageDialog(null, "Correcto, el numero era..." + random + "    Intentos: " + intentos);
        
        

    }
    
}
