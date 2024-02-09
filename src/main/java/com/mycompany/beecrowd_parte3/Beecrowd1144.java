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
public class Beecrowd1144 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++) {
            int segundo = i * i;
            int terceiro = i * i * i;
            
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
            System.out.printf("%d %d %d%n", i, segundo + 1 , terceiro + 1);
        }
    }
}
