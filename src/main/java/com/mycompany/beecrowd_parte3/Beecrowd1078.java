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
public class Beecrowd1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int resultado;
        
        for(int i = 1; i <= 10; i++) {
            resultado = i * N;
            System.out.println(i + " x " + N + " = " + resultado);
        }
    }
}
