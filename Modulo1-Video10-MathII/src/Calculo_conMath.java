/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Calculo_conMath {
        public static void main(String args[]){
        
            //No se puede almacenar reales en un int
            //int raiz = Math.PI;
            
            double num1 = 5.85;
            int resultado = (int) Math.round(num1);
        
            System.out.println(resultado);
            
            double base = 5;
            double exponenete = 3;
            
            int resultado2 = (int) Math.pow(base, exponenete);

            System.out.println(resultado2);
       
    }
}
