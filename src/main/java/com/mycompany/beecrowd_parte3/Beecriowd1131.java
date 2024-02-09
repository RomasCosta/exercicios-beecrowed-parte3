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
public class Beecriowd1131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int stop = 0, golInter, golGremio = 0, vitoriaInter = 0, vitoriaGremio = 0, grenal = 0, empate = 0;
        
        do {
            //System.out.println("Gol Inter:");
            golInter = scan.nextInt();
            //System.out.println("Gol Gremio");
            golGremio = scan.nextInt();
            
            if(golInter > golGremio) {
                vitoriaInter += 1;
            } else if(golInter < golGremio) {
                vitoriaGremio += 1;
            } else {
                empate += 1;
            }
            //System.out.println("inter vitor: "+ vitoriaInter);
            //System.out.println("inter gremio: "+ vitoriaGremio);
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            stop = scan.nextInt();
            while(stop < 0 || stop > 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                stop = scan.nextInt();
            }
            
            grenal = grenal + 1;
        } while(stop != 2);
        
        System.out.println(grenal + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        if(vitoriaInter > vitoriaGremio){
            System.out.println("Inter venceu mais");
        } else if(vitoriaInter > vitoriaGremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
