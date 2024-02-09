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
public class Beecrowd1079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int N = scan.nextInt();
        double nota1, nota2, nota3, media;
        
        int soma = 0;
        while(soma < N) {
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();
            nota3 = scan.nextDouble();
            media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
            System.out.printf("%.1f%n", media);
            soma = soma + 1;
        }
    }
}
