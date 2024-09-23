/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo7;

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

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(int numero) {
        cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    static class Builder {

        public Builder(String juan_Pérez) {
        }
    }
    
    
}
