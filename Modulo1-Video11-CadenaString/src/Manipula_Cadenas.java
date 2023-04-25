/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Manipula_Cadenas {
        public static void main(String args[]){
            
            String nombre = "Herley";
            
            System.out.println(nombre);
            System.out.println("Mi nombre tiene " + nombre.length() + " letras");
            System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
            
            int ultima_letra;
            ultima_letra = nombre.length();
            
            System.out.println("La ultima letra de mi nombre es " + nombre.charAt(ultima_letra-1));
  
    }
}
