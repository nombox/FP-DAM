/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Contrasenas {

    public static void main(String[] args) {
        
        String contrasena = null;
        String contrasena2 = null;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Escribe una contrasena");
        contrasena = entradaTeclado.next();
        
        while (!contrasena.equals(contrasena2)) {
            System.out.println("Vuelve a escribir la contrasena");
            contrasena2 = entradaTeclado.next();
            
        }
        System.out.println("Contrasena guardada!");
    }
}
