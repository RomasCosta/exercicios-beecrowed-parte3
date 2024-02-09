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
public class Beecrowd1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
//        int[] maiorPosicao = new int[100];
//        int maior = 0;
//        int indiceMaior = -1;

          String[] nome = new String[5];
        
        
        for(int i = 0; i < 5; i++) {
            System.out.println("digite o nome na posicao: " + i);
            nome[i] = scan.nextLine();
            
//            maiorPosicao[i] = scan.nextInt(); 
//            if(maiorPosicao[i] > maior) {
//                maior = maiorPosicao[i];
//                indiceMaior = i + 1;
//            }
        } 
        for(String item : nome) {
            System.out.println("valor: " + item);
        }
        
//        System.out.println("maior: " + maior);
//        System.out.println("indice maior: " + indiceMaior);
    }
}
