/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.odam1.ejercicios;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/**
 *
 * @author sebastian.eduardo.va
 */
public class EjercicioCadenaODAM1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        //Definir las variables
        Scanner entradaTeclado = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        
        
        //entradad datos
        System.out.println("Introduce tu nombre");
        nombre = entradaTeclado.next();
        
        System.out.println("Introduce tu apellido 1");
        apellido1 = entradaTeclado.next();
        
        System.out.println("Introduce tu apellido 2");
        apellido2= entradaTeclado.next();
        
        //crea una variable para colocar todo en minúsculas
        String nombreMinusculas = nombre.toLowerCase();
        
        System.out.println("Tu nombre en minúsculas es:" + nombreMinusculas);
        
        //Nombre en Mayúsculas
        String nombreMayusculas = nombre.toUpperCase();
        System.out.println("Tu nombre en minúsculas es:" + nombreMayusculas);
        
        //Cantidad de caracateres
        System.out.println("El número de caracteres de tu nombre es: " + nombre.length());
        
        //Iniciales del nombre en mayúsculas
        //con "" al inicio de  la cadena para que las sume como String
        String inicialesNombre = "" + nombre.charAt(0)+apellido1.charAt(0)+apellido2.charAt(0);
        System.out.println("Iniciales: "+inicialesNombre.toUpperCase());
        
        // Reemplazar la a del nombre por una x
        String nombreSinA = nombre.toLowerCase().replace("a", "x");
        System.out.println("Nombre sin a es: " + nombreSinA);
            }
        }
