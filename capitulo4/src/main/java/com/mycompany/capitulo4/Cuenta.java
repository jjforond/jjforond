/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4;

/**
 *
 * @author jjforond
 */
public class Cuenta implements Comparable<Cuenta>, ServicioCuentas {
    private int numero;
    private String fechaApertura;
    private double saldo;

    public Cuenta(int numero, String fechaApertura, double saldo) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
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

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Cuenta otraCuenta) {
        return Double.compare(this.saldo, otraCuenta.saldo);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
