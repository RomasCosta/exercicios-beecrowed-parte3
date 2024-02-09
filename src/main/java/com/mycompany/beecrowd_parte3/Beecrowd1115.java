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
public class Beecrowd1115 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        while(x != 0 && y != 0) {
           if(x > 0 && y > 0) {
            System.out.println("primeiro");
           } else if(x < 0 && y > 0) {
            System.out.println("segundo");
           } else if(x < 0 && y < 0) {
            System.out.println("terceiro");
           } else if(x > 0 && y < 0) {
            System.out.println("quarto");
           }
           x = scan.nextInt();
           y = scan.nextInt();
        } 
    }
}
