/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosFor;


/**
 *
 * @author jjforond
 */


public class Main {
    public static void main(String[] args) {
        
        //ejercicio 1
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        
        //ejercicio 2
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        
        //ejercicio 3
        
        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
        
        //ejercicio 4
        
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        // ejercicio 5
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "² = " + (i * i));
        }
        
        // ejercicio 6
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + (i * 2));
        }
        
        // ejercicio 7
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }
        
        // ejercicio 8
        
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros 10 números es: " + suma);
        
        // ejercicio 9
        
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println(); // Para asegurarnos de que el cursor pase a la siguiente línea después de imprimir los asteriscos
        
        //ejercicio 10
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        // ejercicio 11
        
        int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma1 = 0;

        for (int i = 0; i < numeros1.length; i++) {
            suma1 += numeros1[i];
        }

        System.out.println("La suma de todos los elementos del array es: " + suma1);
        
        // ejercicio 12
        
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maximo = numeros2[0];

        for (int i = 1; i < numeros2.length; i++) {
            if (numeros2[i] > maximo) {
                maximo = numeros2[i];
            }
        }

        System.out.println("El número más grande en el array es: " + maximo);
        
        
        
       // Ejercicio 13
       
        int[] num = {5, 12, 3, 18, 7, 21, 14, 9, 11, 6};
        int contador = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 10) {
                contador++;
            }
        }
       
    }
}