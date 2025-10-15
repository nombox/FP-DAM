/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class CincoPalabras {

    public static void main(String[] args) {
        String palabra = null;
        String palabra2 = "";
        int contador = 0;
        Scanner entradaTeclado = new Scanner(System.in);
        
        while (contador < 5) {
            System.out.println("Escribe una palabra");
            palabra = entradaTeclado.next();
            
            if(palabra.length() > palabra2.length()){
                palabra2 = palabra;
            }
           
            contador++;
        }
        System.out.println("La mayor palabra es: " + palabra2 + " que tiene " + palabra2.length() +" letras");
    }
}
