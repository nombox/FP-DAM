/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Buclewhilecontadores100 {

    public static void main(String[] args) {

        int contador = 0;
        String decision = "S";
        Scanner entradaTeclado = new Scanner(System.in);
        while (contador < 100 && !decision.equals("N")) {
            System.out.println("contador: " + contador);
            contador++; //contador = contador +1
            
            //preguntamos al usuario si quiere seguir imprimiendo el contador
            System.out.println("Quieres seguir imprimientod? S|N");
            decision = entradaTeclado.next().toUpperCase();
        }

    }
}
