
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner escaner = new Scanner (System.in);
        
        System.out.println("Introduce su nombre");
        String nombre = escaner.nextLine();
        
        System.out.println("Introduce su nombre");
        short edad = (short) escaner.nextInt();
        
        System.out.println("Su nombre es " + nombre + " y tu edad es " + edad);
    }
    
}
