
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniela
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x= 4;
        int y= 4;
        int [][]paises = new int[x][y];
        
        paises[0][0] = 1;
          paises[0][1] = 0;
            paises[0][2] = 1;
              paises[0][3] = 0;
              
        paises[1][0] = 0;
          paises[1][1] = 1;
            paises[1][2] = 0;
              paises[1][3] = 1;
              
        paises[2][0] = 1;
          paises[2][1] = 0;
            paises[2][2] = 1;
              paises[2][3] = 0;
              
        paises[3][0] = 0;
          paises[3][1] = 1;
            paises[3][2] = 0;
              paises[3][3] = 1;
        
         for(int i= 0; i < paises.length; i++){
             System.out.println(" ");
             for (int j=0; j < paises.length; j++){
                 System.out.print("" + paises[i][j]);
                
            }
         }
       
    }
}
