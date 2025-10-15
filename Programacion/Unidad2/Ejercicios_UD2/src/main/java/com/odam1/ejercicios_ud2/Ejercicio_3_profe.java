/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ejercicio_3_profe {

    public static void main(String[] args) {

        float ud1 = 0;
        float ud2 = 0;
        Scanner entradaDato = new Scanner(System.in);
                
        System.out.println("Bienvenido/a usuario");
        System.out.println("Coloca tu nota de la Unidad 1");
        ud1 = entradaDato.nextFloat();
        
        System.out.println("Coloca tu nota de la Unidad 2");
        ud2 = entradaDato.nextFloat();
        
        boolean mediaMayorque5 = (ud1+ud2)/2 >= 5;
        boolean udsMayorque5 = ud1 >=4 || ud2 >=4;
        
        System.out.println("Resultado del informe:");
        String resultadoFinal = (ud1 < 4 || ud2 <4) ? "suspenso": (mediaMayorque5 && udsMayorque5 ? "aprobado":"suspenso");
        
        System.out.println("el resultado es: "+ resultadoFinal);  
    }
}
