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
public class Beecrowd1113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X =  scan.nextInt();
        int Y = scan.nextInt();
        
        while(X != Y) {
            if(X > Y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            X =  scan.nextInt();
            Y =  scan.nextInt();
        }
    }
}
