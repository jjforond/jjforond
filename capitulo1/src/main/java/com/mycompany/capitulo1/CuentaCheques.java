/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo1;

/**
 *
 * @author jjforond
 */
public class CuentaCheques extends Cuenta {
    private double comisionMensual;

    public CuentaCheques(int numero, String fechaApertura, double saldo, double comisionMensual) {
        super(numero, fechaApertura, saldo);
        this.comisionMensual = comisionMensual;
    }

    public void cobrarComision() {
        retirar(comisionMensual);
    }

    @Override
    public String toString() {
        return super.toString() + ", comisionMensual=" + comisionMensual;
    }
}
