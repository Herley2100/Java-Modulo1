
import java.util.Scanner;

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
        Scanner escaner = new  Scanner(System.in);
        
        System.out.print("DIgite su edad...");
        
        int edad = escaner.nextInt();
        
        if (edad <= 18){
            System.out.print("Eres joven");
        }
        else if (edad <= 40){
            System.out.print("Eres mayor");
        }
        else if (edad <=90){
            System.out.print("Eres un anciano");
        }
        else if (edad > 90){
            System.out.print("Cuidate");
        }
    }
    
}
