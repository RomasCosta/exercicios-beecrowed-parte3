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
public class Beecrowd1132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        int soma = 0, soma2 = 0, valor1, valor2;
        
        if(x < y) {
            valor1 = x;
            valor2 = y;
        } else {
            valor1 = y;
            valor2 = x;
        }
        
        for(int i = valor1; i <= valor2; i++) {
            if(i % 13 == 0) {
                soma = soma + i;
            } else {
                soma2 = soma2 + i;
            }
        }
        //System.out.println(soma);
        System.out.println(soma2);
    }
}
