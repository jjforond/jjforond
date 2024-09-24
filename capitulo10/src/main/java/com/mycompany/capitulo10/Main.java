/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo10;


/**
 *
 * @author jjforond
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Map<Integer, Cliente> clientes = new HashMap<>();
        clientes.put(1, new Cliente(1));
        clientes.put(2, new Cliente(2));
        clientes.put(3, new Cliente(3));

        // Leer cuentas del archivo
        Map<Integer, List<String>> cuentas = leerCuentas("cuentas.txt");

        // Asignar cuentas a los clientes
        asignarCuentasAClientes(clientes, cuentas);

        // Validar cuentas
        validarCuentas(clientes);
    }

    public static Map<Integer, List<String>> leerCuentas(String archivo) {
        Map<Integer, List<String>> cuentas = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int numeroCliente = Integer.parseInt(partes[0]);
                String cuenta = partes[1];

                cuentas.computeIfAbsent(numeroCliente, k -> new ArrayList<>()).add(cuenta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cuentas;
    }

    public static void asignarCuentasAClientes(Map<Integer, Cliente> clientes, Map<Integer, List<String>> cuentas) {
        for (Map.Entry<Integer, List<String>> entry : cuentas.entrySet()) {
            int numeroCliente = entry.getKey();
            List<String> cuentasCliente = entry.getValue();

            if (clientes.containsKey(numeroCliente)) {
                Cliente cliente = clientes.get(numeroCliente);
                for (String cuenta : cuentasCliente) {
                    cliente.agregarCuenta(cuenta);
                }
            }
        }
    }

    public static void validarCuentas(Map<Integer, Cliente> clientes) {
        Map<Integer, Integer> validaciones = new HashMap<>();
        validaciones.put(1, 1);
        validaciones.put(2, 2);
        validaciones.put(3, 3);

        for (Map.Entry<Integer, Cliente> entry : clientes.entrySet()) {
            int numeroCliente = entry.getKey();
            Cliente cliente = entry.getValue();
            int numeroCuentas = cliente.getCuentas().size();

            if (numeroCuentas != validaciones.get(numeroCliente)) {
                System.out.println("Error: El cliente " + numeroCliente + " tiene " + numeroCuentas + " cuentas, pero debería tener " + validaciones.get(numeroCliente) + " cuentas.");
            } else {
                System.out.println("El cliente " + numeroCliente + " tiene el número correcto de cuentas.");
            }
        }
    }
}