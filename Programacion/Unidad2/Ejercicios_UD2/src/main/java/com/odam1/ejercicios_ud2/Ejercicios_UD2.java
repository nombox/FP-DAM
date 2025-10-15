/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.odam1.ejercicios_ud2;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ejercicios_UD2 {

    public static void main(String[] args) {
        
        int i = 8, j = 5, k;
        float x = 0.005F, y = -0.01F, z;
        char a, b = 'p', c = 'q';
        
        //Expresiones
        
        k = (j == 5) ? i : j;
        System.out.println("a)"+ k);
       
        
                k = (j > 5) ? i:j;
        System.out.println("b)"+k);
        
        z = (x >= 0) ? x : 0;
        System.out.println("c)"+z);
        
                a = (b < c) ? b:c;
        System.out.println("d)"+k);
        
        k = (i>0 && j > 0) ? 0:1;
        System.out.println("g)"+z);
        
        a = (b<'c') ? b : c;
        System.out.println("i)"+a);
        

        
        z = (y>=0) ? y: 0;
        System.out.println("d)"+z);
        
        k = (j>0) ? j: 0 ;
        System.out.println("f)"+k);
        
        k = (y>0 || x > 0) ? i +1: i-1;
        System.out.println("h)"+k);
        
        a=(b >=c) ? b: 'r';
        System.out.println("j)"+a);
        
    }
}
