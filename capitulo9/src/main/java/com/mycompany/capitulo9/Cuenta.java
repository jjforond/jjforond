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

public abstract class Cuenta implements Comparable<Cuenta> {
    protected String numeroCuenta;
    protected double saldo;
    protected LocalDate fechaApertura;
    protected LocalDate fechaCancelacion;

    public Cuenta(String numeroCuenta, double saldo, LocalDate fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
    }

    @Override
    public int compareTo(Cuenta otraCuenta) {
        return Double.compare(this.saldo, otraCuenta.saldo);
    }

    // Métodos abstractos
    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

    // Métodos getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
}
