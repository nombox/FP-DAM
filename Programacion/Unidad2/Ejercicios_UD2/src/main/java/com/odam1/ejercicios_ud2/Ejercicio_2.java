/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        int valor = 0;
        String resultado = null;
        Scanner entradaDato = new Scanner(System.in);

        //mensaje de bienvenida
        System.out.println("Bienvenido/a");
        System.out.println("Escribe un numero entero");
        valor = entradaDato.nextInt();
        System.out.println("El resultado es: " + (valor % 2 == 0 ? "par" : "impar"));

    }
}
