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
public class Beecrowd1114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int senha = 2002;
        int entrada = scan.nextInt();
        
        while(entrada != senha) {

            if(entrada != senha) {
                System.out.println("Senha Invalida");
            }
            entrada = scan.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
