/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nilgit s
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 1.15d;
        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros / tipus_de_canvi) + " lliures esterlines (£)");
    }
}
