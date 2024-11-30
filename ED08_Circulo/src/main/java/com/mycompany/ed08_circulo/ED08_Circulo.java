/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed08_circulo;

/**
 *
 * @author gustavo
 */
public class ED08_Circulo {

    public static void main(String[] args) 
    {
        double radio, area, perimetro;
        scanner teclado = new scanner(System.in);
        
        System.out.print("Radio? ");
        radio = teclado.nextDouble();
        
     // area = Math.PI*radio*radio;
        area = Math.PI*radio*radio;
        area = Math.PI*Math.pow(radio, 2);
        perim = 2*Math.PI*radio;
        
        System.out.println("Area   = " + area);
        System.out.println("perimetro  = " + perim);
        
    }//main
    
}//clase
                                                                                                                                                                                                                                                                                                                                              