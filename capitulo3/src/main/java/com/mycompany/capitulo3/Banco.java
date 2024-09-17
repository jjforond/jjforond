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

public class Banco {
    private String nombreBanco;
    private Domicilio direccion;
    private ArrayList<Cliente> clientes;

    public Banco(String nombreBanco, Domicilio direccion) {
        this.nombreBanco = nombreBanco;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void eliminarCliente(String id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    public Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public void ordenarClientesPorId() {
        Collections.sort(clientes);
    }
}
