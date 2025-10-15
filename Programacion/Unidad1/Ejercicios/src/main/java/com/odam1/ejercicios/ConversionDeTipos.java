/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ejercicios;

/**
 *
 * @author sebastian.eduardo.va
 */
public class ConversionDeTipos {
    
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udaw1.ejercicios;

/**
 *
 * @author laura
 */
public class ConversionDeTipos {

    public static void main(String[] args) {
        byte b = 4;
        short s = 150;
        int i = 150, j = 200;
        long l = 1923L;
        float f = 2.43f;
        double d = 3.34567;
        char c = 'a';
       
        
        float resultado = f-c;
        double resultado2 = d+f; 
        double resultado3 = d+i;
        double resultado4 = d+f;
        float resultado5 = i/f;
        int resultado7 = s+j;
        int resultado8 = b/c+s;
        long resultado9 = 35L + c +s;
        float resultado10= '2' + f;
 
        /*
        
        Ejercicio 1 : Conversión explícita vs Implícita en Java
            Conversión implícita
            -> Se da cuando se convierte un tipo de menor rango o precisión a otro de mayor rango o precisión (no hay pérdida de información).
            -> La hace automáticamente Java, sin que el/la programador/a tenga que indicar nada.
           
            Conversión explícita
            -> Se da cuando se convierte un tipo de mayor rango o precisión a otro de menor rango o precisión (puede haber pérdida de información o redondeo).
            -> La debe hacer el programador/a, indicando el tipo de destino entre paréntesis.
       
        Teniendo en cuenta lo anterior, responde a las siguientes preguntas sobre la asignación de variables:
        ¿Esto es correcto ? d = f 
        ¿Esto es correcto? f = d. Como se corrige?

        
        
        Ejercicio 2:   
            Reglas existentes en operaciones aritméticas en Java:
            ->Si alguno de los operandos es double,todo se convierte a double.
            ->Si no hay double pero hay float, todo se convierte a float.
            ->Si no hay float pero hay long, todo se convierte a long.
            ->Si todos son enteros más pequeños (byte, short, char), primero se convierten a int. (la operacion resultante puede ser int)        
        
        
        Teniendo en cuenta lo anterior, realiza las siguientes operaciones asignando el resultado a una nueva variable para ver el tipo resultante

     
            1. f-c;

            2. d+f;

            3. d+i;

            4. d + f

            5. d + i

            6. i / f

            7. s + f

            8. s + j

            8. d + j

            9. s * c

            10. d + c

            11. b + c

            12. b/c +  s

            13. c + c

            14. i + l + d

            15. l + c

            16. i / j

            17. 3.1416/d

            18. c - l/2

            19. 'z' +  f

            20. 35L + c + s 

            21. 3f + i

            22. 2.34f + c

            23. 2 / i +  2.0/ j

            24. d/f  
*/
    }
    
}
    
}
