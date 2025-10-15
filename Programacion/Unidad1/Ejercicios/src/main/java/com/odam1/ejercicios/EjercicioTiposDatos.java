/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.odam1.ejercicios;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class EjercicioTiposDatos {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        //Definir las variables La edad de una persona : 25
        byte edad = 25;
        
        //El año de nacimiento de cervantes: 1547
        short anoNacimiento = 1547;
        
        //El número de habitantes de españa: 47000000
        int  numHabitantes = 47_000_000;
        
        //La distancia de la tierra al sol en Km : 149.600.000
        int distanciatierraSolKM = 149_600_000;
        
        //El número de estrellas de la via lactea : 100.000.000.000
        long numEstrellasViaLactea = 100_000_000_000L;
        
        //La nota media de un alumno o alumna : 7.5
        float notaMediaAlumne = 7.7f;
        
        //El valor de la constante Pi: 3.141592632653589793
        double constantePi = 3.141592632653589793;
        
        //Lampara encendida o apagada
        boolean lamparaEncendidad = true;
        
        //La primera letra de nuestro nombre
        char letraInicial = 'S'; //usa comillas simples con char para que no haya error
        
        //Nombre completo
        String nombre = "Sebastian";
        
        //Constantes : su valor no se puede modificar una vez definido
        final int velocidadDelaLuz = 3000000;
        
        
        //Constante existente en las librerías de JAVA
        System.out.println(PI);
    }
    
}
