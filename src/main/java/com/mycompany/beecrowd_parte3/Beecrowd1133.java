/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte3;

import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        int valor1, valor2;
        
        if(x < y) {
            valor1 = x;
            valor2 = y;
        } else {
            valor1 = y;
            valor2 = x;
        }
        
        for(int i = valor1+1 ; i <= valor2; i++) {
            if(i % 5 == 2 || i % 5 == 3 && i > 0) {
                System.out.println(i);
            }
            //System.out.println("i2: " +i);
        }
    }
}
