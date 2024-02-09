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
public class Beecrowd1134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int alcool = 0, gasolina = 0, diesel = 0;
        int entrada;
        
        do {
            //System.out.println("Insira um valor: ");
            entrada = scan.nextInt();
            if(entrada == 1 && entrada > 0) {
                alcool += 1;
            }
            else if(entrada == 2 && entrada > 0) {
                gasolina += 1;
            }
            else if(entrada == 3) {
                diesel += 1;
            }
        }while(entrada != 4);
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
