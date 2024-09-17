/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.capitulo2;

/**
 *
 * @author jjforond
 */
public interface ServicioCuentas {
    void depositar(double monto);
    void retirar(double monto);
    double consultarSaldo();
}
