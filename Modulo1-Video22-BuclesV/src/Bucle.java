
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
        
        int arroba = 0;
        
        
        String email = JOptionPane.showInputDialog("Digite su email");
        
        for(int i=0; i < email.length(); i++){
            if(email.contains("@")){
                arroba++;
            }
        }
        
        if (arroba == 1){
            JOptionPane.showMessageDialog(null, "Valido");
        }
        
        if (arroba != 1){
            JOptionPane.showMessageDialog(null, "No valido");
        }
       
              
          
    }
    
}
