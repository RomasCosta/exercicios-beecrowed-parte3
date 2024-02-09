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
public class Beecrowd1094 {//poderia ser feito com "for"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        //System.out.println("número de casos: ");
        int N = scan.nextInt();
        char cobaia;
        int coelho = 0, rato = 0, sapo = 0, quantidade, total;
        double percCoelho, percRato, percSapo;
        
        int soma = 0;
        while(soma < N) {
            //System.out.println("Insira quantidade: ");
            quantidade = scan.nextInt();
            //System.out.println("insira uma cobaia C-R-S: ");
            cobaia = scan.next().charAt(0); 
            if(cobaia == 'C') {
                coelho = coelho + quantidade;
            } else if(cobaia == 'R') {
                rato = rato + quantidade;
            } else {
                sapo = sapo + quantidade;
            }
            soma = soma + 1;
        }
        
        total = coelho + rato + sapo;
        
        percCoelho = (coelho * 100.0) / total;
        percRato = (rato * 100.0) / total;
        percSapo = (sapo * 100.0) / total;
        
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n" , percCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n" , percRato);
        System.out.printf("Percentual de sapos: %.2f %%%n" , percSapo);   
    }
}
