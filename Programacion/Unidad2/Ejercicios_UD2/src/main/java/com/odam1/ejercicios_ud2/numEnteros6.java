/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class numEnteros6 {

    public static void main(String[] args) {
      int numero = 0;
      int numero2 = 0;
      Scanner entradaDato = new Scanner (System.in);
      
      
      
      do {
      
      System.out.println("Introduce un numero");
      numero = entradaDato.nextByte();
          
      numero2 += numero;
      
      } while (numero >= 0);
      
      System.out.println("La suma de tus numeros es: " + numero2);
    }
}
