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
public class Beecrowd1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        
        while(M > 0 && N > 0){
            
            int menor = M;
            int maior = N;

            if(M > N) {
                
                menor = N;
                maior = M;
            }

                int soma = 0;
                for(int i = menor; i <= maior; i++)  {
                soma = soma + i;
                System.out.printf("%d ", i);
              }
              System.out.println("Sum=" + soma);
              M = scan.nextInt();
              N = scan.nextInt();
        }  
    }
}
