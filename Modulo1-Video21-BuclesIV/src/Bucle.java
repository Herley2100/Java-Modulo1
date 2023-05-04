
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
        
        boolean arroba = false;
        
        
        String email = JOptionPane.showInputDialog("Digite su email");
        
        for(int i=0; i < email.length(); i++){
            if(email.contains("@")){
                arroba = true;
            }
        }
        
        if (arroba == true){
            JOptionPane.showMessageDialog(null, "Contiene @");
        }
        
        if (arroba == false){
            JOptionPane.showMessageDialog(null, "No contiene @");
        }
       
              
          
    }
    
}
