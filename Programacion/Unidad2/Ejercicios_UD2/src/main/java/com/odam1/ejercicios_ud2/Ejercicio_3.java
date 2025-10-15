/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ejercicio_3 {

    public static void main(String[] args) {

        float UD1 = 0;
        float UD2 = 0;
        Scanner entradaDato = new Scanner(System.in);
                
        System.out.println("Bienvenido/a usuario");
        System.out.println("Coloca tu nota de la Unidad 1");
        UD1 = entradaDato.nextFloat();
        
        System.out.println("Coloca tu nota de la Unidad 2");
        UD2 = entradaDato.nextFloat();
        
        System.out.println((( UD2<=4 || UD1<=4 ) ? "Suspenso": (((UD1+UD2)/2 >=5) ? "aprobado": "suspenso")));
        
    }
}
