
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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Circulo");
       
       int figura = entrada.nextInt();
       
       switch(figura){
           case 1: 
               JOptionPane.showMessageDialog(null,"usted escogio Cuadrado");
               break;
           case 2:
               JOptionPane.showMessageDialog(null,"usted escogio Rectangulo");
               break;
           case 3:
               JOptionPane.showMessageDialog(null,"usted escogio Triangulo");
               break;
           case 4:
               JOptionPane.showMessageDialog(null,"usted escogio Circulo");
               break;
           default:
               JOptionPane.showMessageDialog(null,"usted escogio incorrectamente");
               break;
       }
    }
    
}
