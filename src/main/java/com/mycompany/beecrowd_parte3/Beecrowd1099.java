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
public class Beecrowd1099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int X, Y;
        
        int soma = 0;
        while(soma < N) {
            X = scan.nextInt();
            Y = scan.nextInt();

          if(X >= Y) {
              int impar = 0;
              for(int i = X - 1; i > Y; i--) {
                  
                  if(i % 2 != 0) {
                       impar += i;
                  }
                }
                System.out.println("impar: " + impar);
              
          } else if(X <= Y) {
              int impar = 0;
                for(int i = X + 1; i < Y; i++) {
                    if(i % 2 != 0) {
                       impar += i;
                    } 
                }
                System.out.println("impar: " + impar); 
          }
          //System.out.println("impar: " + impar);
              soma = soma + 1;
        }
    }
}
