
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
        String genero = "";
        
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)...");
        } while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M")== false);
              int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite su altura en cm"));
              int pesoideal = 0;
              
              if(genero.equalsIgnoreCase("M")){
                  pesoideal = altura - 120;
              }
              
              else if(genero.equalsIgnoreCase("H")){
                  pesoideal = altura - 110;
              }
              
              JOptionPane.showMessageDialog(null, "Tu peso ideal es..." + pesoideal);
    


    }
    
}
