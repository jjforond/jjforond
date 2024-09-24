/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo10;

/**
 *
 * @author jjforond
 */


import java.util.ArrayList;
import java.util.List;

public class Cliente {
   private int numero;
    private List<String> cuentas;

    public Cliente(int numero) {
        this.numero = numero;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(String cuenta) {
        cuentas.add(cuenta);
    }

    public int getNumero() {
        return numero;
    }

    public List<String> getCuentas() {
        return cuentas;
    }
}
