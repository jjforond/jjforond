/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo5;

import com.mycompany.capitulo5.Interface.*;


/**
 *
 * @author jjforond
 */
public class Main {
    public static void main(String[] args) {
        // Interfaz1
        Interfaz1 i1 = (a, b, c) -> System.out.println("Interfaz1: " + a + ", " + b + ", " + c);
        i1.metodo(1, "test", 2.5f);

        // Interfaz2
        Interfaz2<String, Integer, Double, Boolean> i2 = (a, b, c) -> a.length() > b + c;
        System.out.println("Interfaz2: " + i2.metodo("test", 2, 3.0));

        // Interfaz3
        Interfaz3 i3 = (a, b) -> a + b;
        System.out.println("Interfaz3: " + i3.metodo("Hello, ", "World!"));

        // Interfaz4
        Interfaz4 i4 = () -> System.out.println("Interfaz4: No input, no output");
        i4.metodo();

        // Interfaz5
        Interfaz5 i5 = (a, b) -> (long) (a + b);
        System.out.println("Interfaz5: " + i5.metodo(3, 4));

        // Interfaz6
        Interfaz6 i6 = (a, b) -> a + b;
        System.out.println("Interfaz6: " + i6.metodo(5, 10L));

        // Interfaz7
        Interfaz7 i7 = (a, b) -> a + b.toString();
        System.out.println("Interfaz7: " + i7.metodo("Hello, ", new StringBuilder("World!")));

        // Interfaz8
        Interfaz8 i8 = () -> new Object();
        System.out.println("Interfaz8: " + i8.metodo());

        // Interfaz9
        Interfaz9 i9 = (a, b) -> a.toString() + b.toString();
        System.out.println("Interfaz9: " + i9.metodo("Hello, ", "World!"));

        // Interfaz10
        Interfaz10 i10 = (a, b, c) -> a + " " + b + " " + c;
        System.out.println("Interfaz10: " + i10.metodo(1, 'A', 2.5f));
    }
}

