/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte3;

/**
 *
 * @author romar
 */
public class Beecrowd1097 {
    public static void main(String[] args) {
        
       int num = 1, cont = 7;
       
       while(num <= 9) {
            System.out.printf("I=%d J=%d%n", num, cont--);
            System.out.printf("I=%d J=%d%n", num, cont--);
            System.out.printf("I=%d J=%d%n", num, cont--);
            
            num += 2;
            cont += 5;
       }
    }
}
