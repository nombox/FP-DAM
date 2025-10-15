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
public class Calculadora {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        //Definir las variables
        float variable1;
        float variable2;
        float operacion;
        byte opcionUsuario;
        Scanner entradaDato = new Scanner(System.in); //Defines scanner

        //Escribir mensaje de bienvenida
        System.out.println("Bienvenido usuario");

        //Mensaje usuario
        System.out.println("Escoge una opción: 1(suma),"
                + "\n2(resta), 3(multiplicación), 4(división), "
                + "\n5(potencia), 6(raiz cuadrada)");

        opcionUsuario = entradaDato.nextByte();

        switch (opcionUsuario) {
            case 1 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                String input1 = entradaDato.next();
                //convertir variable 1 a float o entero
                if (input1.contains(",")){
                    
                    variable1 = Float.parseFloat(input1);
                }  else {
                    variable1= Integer.parseInt(input1);
                }   ///Pedir al usuario variable 2
                
                System.out.println("Introduce tu segundo número");
                ///Leer con el Scanner la variable 2
                String input2 = entradaDato.next();
                //convertir variable 1 a float o entero
                if (input1.contains(",")){
                    
                    variable2 = Float.parseFloat(input2);
                }  else {
                    variable2= Integer.parseInt(input2);
                }   ///Realizar variable suma
                operacion = variable1 + variable2;
                ///Devolver resultado SIEMPRE DA FLOAT
                System.out.println(variable1 + " + " + variable2 + " es = " + operacion);
            }
            case 2 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                variable1 = entradaDato.nextInt();
                ///Pedir al usuario variable 2
                
                System.out.println("Introduce tu segundo número");
                ///Leer con el Scanner la variable 2
                variable2 = entradaDato.nextInt();
                ///Realizar variable resta
                operacion = variable1 - variable2;
                ///Devolver resultado
                System.out.println(variable1 + " - " + variable2 + " es = " + operacion);
            }
            case 3 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                variable1 = entradaDato.nextInt();
                ///Pedir al usuario variable 2
                
                System.out.println("Introduce tu segundo número");
                ///Leer con el Scanner la variable 2
                variable2 = entradaDato.nextInt();
                ///Realizar variable multiplicación
                operacion = variable1 * variable2;
                ///Devolver resultado
                System.out.println(variable1 + " * " + variable2 + " es = " + operacion);
            }
            case 4 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                variable1 = entradaDato.nextFloat();
                ///Pedir al usuario variable 2
                
                System.out.println("Introduce tu segundo número");
                ///Leer con el Scanner la variable 2
                variable2 = entradaDato.nextFloat();
                ///Realizar variable división
                operacion = (float)variable1 / variable2;
                ///Devolver resultado
                System.out.println(variable1 + " / " + variable2 + " es = " + operacion);
            }
            case 5 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                variable1 = entradaDato.nextFloat();
                ///Pedir al usuario variable 2
                
                System.out.println("Introduce tu segundo número");
                ///Leer con el Scanner la variable 2
                variable2 = entradaDato.nextFloat();
                //Realizar operacion potencia
                
                operacion = (float) Math.pow(variable1, variable2);
                //////Devolver resultado
                System.out.println(variable1 + " ^ " + variable2 + " es = " + operacion);
            }
            case 6 -> {
                //pedir al usuario variable 1
                System.out.println("Introduce tu primer número");
                //Leer  con el Scanner la variable 1
                variable1 = entradaDato.nextFloat();
                //Realizar operacion potencia
                
                operacion = (float) Math.sqrt(variable1);
                //////Devolver resultado
                System.out.println(" La raíz cuadrada de " + variable1 + "es = " + operacion);
            }
            default -> {
            }
        }
    }
}
