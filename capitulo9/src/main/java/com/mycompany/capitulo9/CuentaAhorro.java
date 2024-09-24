/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo9;

/**
 *
 * @author jjforond
 */
import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldo, LocalDate fechaApertura, double tasaInteres) {
        super(numeroCuenta, saldo, fechaApertura);
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
        return "CuentaAhorro{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", fechaCancelacion=" + fechaCancelacion +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}
