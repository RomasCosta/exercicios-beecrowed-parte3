/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte3;

import java.util.Locale;

/**
 *
 * @author romar
 */
public class Beecrowd1098 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        float i, j, valor;
        
        int temp, temp2;
        
        for(i = 0, j = 1, valor = 0, temp = 0, temp2 = 0; i < 2.2; j++) {
        
            if(temp2 == 0) {
                System.out.printf("I=%.0f J=%.0f%n", i, j);
            } else {
                System.out.printf("I=%.1f J=%.1f%n", i, j);
            }
            temp++;
            
            if(temp == 3) {
                i += 0.2;
                
                valor += 0.2;
                
                j = valor;
                
                temp = 0;
                
                temp2++;
            }
            
            if(temp2 == 5) {
                temp2 = 0;
            }
        }
    }
}
