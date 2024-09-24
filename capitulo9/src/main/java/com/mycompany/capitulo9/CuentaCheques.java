/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo9;

import java.time.LocalDate;

/**
 *
 * @author jjforond
 */
public class CuentaCheques extends Cuenta {
    private double comisionMensual;

    public CuentaCheques(double comisionMensual, String numeroCuenta, double saldo, LocalDate fechaApertura) {
        super(numeroCuenta, saldo, fechaApertura);
        this.comisionMensual = comisionMensual;
    }

    
    public void cobrarComision() {
        retirar(comisionMensual);
    }

    @Override
    public String toString() {
        return super.toString() + ", comisionMensual=" + comisionMensual;
    }

    @Override
    public void depositar(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void retirar(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
