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
public class Beecrowd1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i = 0; i < 10000; i++) {
            if(i % N == 2) {
                System.out.println(i);
            }
        }
    }
}
