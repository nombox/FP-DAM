/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class palindromo10 {

    public static void main(String[] args) {
        String palabra = "";
        String palabraInvertida = "";
        Scanner entradaDato = new Scanner(System.in);
        int numPalabras = 0;
        
        System.out.println("Ingresa una plabra");
        palabra = entradaDato.next();

        for (numPalabras = palabra.length() - 1; numPalabras >= 0; numPalabras--) {
            palabraInvertida += palabra.charAt(numPalabras);
        }

        if (palabra.equals(palabraInvertida)){
            System.out.println(palabra + " es palindromo");
        } else System.out.println(palabra + " no es palindromo");
        
    }
}
