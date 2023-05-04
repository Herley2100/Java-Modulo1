
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
        String entrada ="";
        String pass = "Pan";
        while(entrada.equals(pass) == false){
            entrada = JOptionPane.showInputDialog("Digite su contraseña");
            if (entrada.equals(pass) == false){
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
            
            
        }
        JOptionPane.showMessageDialog(null, "Acceso permitido");
    
    }
    
}
