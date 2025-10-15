/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios_ud2;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class ContrasenasIntentos {

    public static void main(String[] args) {
        int contador = 3;
        String contrasena = null;
        String contrasena2 = null;
        String revision =null;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.println("Escribe una contrasena");
        contrasena = entradaTeclado.next();
        
        while (contador>0 && !contrasena.equals(contrasena2)) {
            System.out.println("Vuelve a escribir la contrasena");
            contrasena2 = entradaTeclado.next();
            contador--;
            System.out.println("Tienes "+ contador + " intentos restantes");
            
            
        }
        System.out.println(revision = (contrasena.equals(contrasena2)) ? "Contrasena guardada!": "Contrasena bloqueada!");
    }
}
