/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo3;

/**
 *
 * @author jjforond
 */
import java.util.ArrayList;
import java.util.Collections;

public class Cliente implements Comparable<Cliente>, ServicioClientes {
    private String id;
    private String nombre;
    private String telefono;
    private Domicilio domicilio;
    ArrayList<Cuenta> cuentas;

    public Cliente(String id, String nombre, String telefono, Domicilio domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.cuentas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public void eliminarCuenta(int numero) {
        cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
    }

    @Override
    public Cuenta buscarCuenta(int numero) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                return cuenta;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        return this.id.compareTo(otroCliente.id);
    }

    public void ordenarCuentasPorSaldo() {
        Collections.sort(cuentas);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
