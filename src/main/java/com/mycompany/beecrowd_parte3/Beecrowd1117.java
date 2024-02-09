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
public class Beecrowd1117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        double nota1 = scan.nextDouble();
        while(nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida"); 
                nota1 = scan.nextDouble();
        }
        
        double nota2 = scan.nextDouble();
        while(nota2 < 0.0 || nota2 > 10.0) {
                System.out.println("nota invalida"); 
                nota2 = scan.nextDouble();
        } 
         double media = (nota1 + nota2) / 2.0;
         System.out.println("media = " + media);
    }
}
