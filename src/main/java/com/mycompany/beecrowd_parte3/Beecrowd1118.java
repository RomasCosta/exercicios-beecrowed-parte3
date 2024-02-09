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
public class Beecrowd1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int stop = 0;
        
        do {
            System.out.println("nota1: ");
            double nota1 = scan.nextDouble();
            while(nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida");
                System.out.println("nota1: ");
                nota1 = scan.nextDouble();
            }
            System.out.println("nota2: ");
            double nota2 = scan.nextDouble();
            while(nota2 < 0.0 || nota2 > 10.0) {
                System.out.println("nota invalida");
                System.out.println("nota2: ");
                nota2 = scan.nextDouble();
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n" , media); 
            
            System.out.println("novo calculo (1-sim 2-nao)");
            stop = scan.nextInt();
            while(stop < 1 || stop > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                stop = scan.nextInt();
            }
        } while(stop != 2);
    }
}
