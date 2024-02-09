/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.beecrowd_parte3;

import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1074 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int N = scan.nextInt();
       int valor, oddNegative, oddPositive, evenNegative, evenPositive;
       
       
       int soma = 0;
       while(soma < N) {
           //System.out.println("Digite um número inteiro");
           valor = scan.nextInt();
           
           if(valor % 2 != 0 && valor < 0) {
               System.out.println("ODD NEGATIVE");
           } else if(valor % 2 != 0 && valor > 0) {
               System.out.println("ODD POSITIVE");
           } else if(valor % 2 == 0 && valor < 0) {
               System.out.println("EVEN NEGATIVE");
           } else if(valor % 2 == 0 && valor > 0) {
               System.out.println("EVEN POSITIVE");
           } else {
               System.out.println("NULL");
           }
           
           soma = soma + 1;
       }   
    }
}
