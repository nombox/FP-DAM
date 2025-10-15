/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class cifras9 {

    public static void main(String[] args) {
        int numero = 0;
        String modulo = null;
        Scanner entradaDato = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        numero = entradaDato.nextInt();
        
        while (numero > 10) {
        
            System.out.println(numero%10);
            numero = numero / 10;
        }
        System.out.println(numero%10);
        
    }
}
