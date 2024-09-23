/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo6;



/**
 *
 * @author jjforond
 */
public class Main {
    public static void main(String[] args) {

        // Implementación de la interfaz funcional usando una expresión lambda
        Interface ejemplo = () -> System.out.println("Regla lambda aplicada");
        ejemplo.metodoAbstracto();
    }
}

