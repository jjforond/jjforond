/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4;

/**
 *
 * @author jjforond
 */


public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private String direccion;
    private String telefono;

    private Cliente(Builder builder) {
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
    }

    public static class Builder {
        private String nombre;
        private String direccion;
        private String telefono;

        public Builder(String nombre) {
            this.nombre = nombre;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        return this.nombre.compareTo(otroCliente.nombre);
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
