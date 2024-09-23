/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo7;

/**
 *
 * @author jjforond
 */
public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(int numero, String numeroCuenta, double saldo, double tasaInteres) {
        super(numero, numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Métodos getters y setters
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        String numeroCuenta = null;
        return "CuentaAhorro{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}
