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
public class Beecrowd1142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int linha = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 4; j++) {
                if(linha % 4 != 0)
                System.out.print(linha + " ");
                linha += 1; 
            }
            System.out.println("PUM");
        }
    }
}
