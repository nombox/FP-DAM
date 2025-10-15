/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class numEnteros8 {

    public static void main(String[] args) {
      int numero = 0;
      int numero2 = 0;
      String numerost = null;
      String calculo = " ";
      Scanner entradaDato = new Scanner (System.in);

     do {
      
      System.out.println("Introduce un numero");
      numero = entradaDato.nextByte();
      
      
      if (numero >= 0) {
      numerost = ""+ " + " + numero;
      calculo = numerost + calculo;
      }
        
      numero2 += numero;
      
      }  while (numero >= 0);
      
      System.out.println("La suma de tus numeros " + calculo.substring(3) + " es: "+ (numero2-numero));
    }
}
