/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int N = scan.nextInt();
        
        
        int soma = 0;
        while(soma < N) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            float res = 0;
            
            if(y == 0) {
                System.out.println("divisao impossivel");
            } else {
                res = (float) x / y;
                System.out.printf("%.1f%n", res);
            }
            soma = soma + 1;
        }
    }
}
