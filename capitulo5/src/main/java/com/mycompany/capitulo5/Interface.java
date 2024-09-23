/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.capitulo5;

/**
 *
 * @author jjforond
 */
public interface Interface {
    
// Interfaz1
@FunctionalInterface
interface Interfaz1 {
    void metodo(int a, String b, float c);
}

// Interfaz2
@FunctionalInterface
interface Interfaz2<A, B, C, D> {
    D metodo(A a, B b, C c);
}

// Interfaz3
@FunctionalInterface
interface Interfaz3 {
    String metodo(String a, String b);
}

// Interfaz4
@FunctionalInterface
interface Interfaz4 {
    void metodo();
}

// Interfaz5
@FunctionalInterface
interface Interfaz5 {
    Long metodo(int a, int b);
}

// Interfaz6
@FunctionalInterface
interface Interfaz6 {
    Number metodo(Integer a, Long b);
}

// Interfaz7
@FunctionalInterface
interface Interfaz7 {
    CharSequence metodo(String a, StringBuilder b);
}

// Interfaz8
@FunctionalInterface
interface Interfaz8 {
    Object metodo();
}

// Interfaz9
@FunctionalInterface
interface Interfaz9 {
    String metodo(Object a, Object b);
}

// Interfaz10
@FunctionalInterface
interface Interfaz10 {
    String metodo(int a, char b, float c);
}

}
