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

public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(String numeroCuenta, double saldo, LocalDate fechaApertura, double limiteDescubierto) {
        super(numeroCuenta, saldo, fechaApertura);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + limiteDescubierto >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Métodos getters y setters
    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", fechaCancelacion=" + fechaCancelacion +
                ", limiteDescubierto=" + limiteDescubierto +
                '}';
    }
}
