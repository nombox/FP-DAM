/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.odam1.ejercicios;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


/**
 * Algoritmo que pide al usuario numero del 1 al 7 y te muestra el día de la semana
 * @author sebastian.eduardo.va
 */
public class EjercicioSalud {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        //Declarar variables
        byte edad;
        float altura;
        float peso;
        short fc;
        byte horas_sueno;
        float IMC;
        final float IMC_MIN = 18.5f;
        final float IMC_MAX = 29.5f;
        Scanner entradaDato = new Scanner (System.in);
        
        //Mensaje de bienvenida
        System.out.println("Bienvenido/a a tu calculadora de salud");
        
        //Calcular IMC
                 //Introduce tus datos
        System.out.println("Introduce tu peso");
        peso = entradaDato.nextFloat();
        
        System.out.println("Introduce tu altura");
        altura = entradaDato.nextFloat();
        
        IMC = (float) peso / (float) (Math.sqrt(altura));
 
        
        if ( IMC < IMC_MIN){
            System.out.println("Tu índice de masa corporal es: " + IMC);
            System.out.println("¡Estás por debajo de tu límite!");
        } else if (IMC > IMC_MIN){
            System.out.println("Tu índice de masa corporal es: " + IMC);
            System.out.println("¡Estás en sobre peso!");
        } else { System.out.println("Tu índice de masa corporal es: " + IMC);
            System.out.println("¡Estás en tu peso ideal!");
        
        }
        
        //Ahora la frecuencia cardiaca
        System.out.println("Ahora calculemos tu frecuencia cardiaca");
        
            //Introduce tus datos
        System.out.println("Introduce tu edad");
        edad = entradaDato.nextByte();
        
        
            } 
        } 
