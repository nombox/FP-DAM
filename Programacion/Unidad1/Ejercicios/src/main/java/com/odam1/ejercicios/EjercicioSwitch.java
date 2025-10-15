/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.odam1.ejercicios;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 * Algoritmo que pide al usuario numero del 1 al 7 y te muestra el día de la semana
 * @author sebastian.eduardo.va
 */
public class EjercicioSwitch {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        byte diaSemana;
        Scanner entradaTeclado = new Scanner (System.in);
        
        System.out.println("Introduce un número del 1 al 7");
        diaSemana = entradaTeclado.nextByte();
        
        // Mostrar mensaje en función del valor de la variable
        switch(diaSemana){
            case 1 ->  {
                System.out.println("Lunes");
            }
            case 2 ->  {
                System.out.println("Martes");
            }
            case 3 ->  {
                System.out.println("Miércoles");
            
            }
            case 4 ->  {
                System.out.println("Jueves");
            }
            case 5 ->  {
                System.out.println("Viernes");
            }
            case 6 ->  {
                System.out.println("Sábado");
            }
            case 7 ->  {
                System.out.println("Domingo");
            } 
        } 
        
    }
    
}
