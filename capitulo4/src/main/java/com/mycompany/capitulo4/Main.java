/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo4;

/**
 *
 * @author jjforond
 */
public class Main {
    public static void main(String[] args) {
        // Crear un banco
        Banco banco = new Banco("Banco Central", "Calle Principal 123", "555-1234");

        // Crear clientes usando el patrón Builder
        Cliente cliente1 = new Cliente.Builder("Juan Pérez")
                .direccion("Avenida Siempre Viva 742")
                .telefono("555-5678")
                .build();

        Cliente cliente2 = new Cliente.Builder("María López")
                .direccion("Calle Falsa 123")
                .telefono("555-8765")
                .build();

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Mostrar información de los clientes
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Mostrar información
        System.out.println("Banco: " + banco.getNombreBanco());
        System.out.println("Cliente 1: " + banco.obtenerCliente("Juan Pérez").getNombre());
        System.out.println("Cliente 2: " + banco.obtenerCliente("María López").getNombre());

        // Eliminar cliente y cerrar cuenta
        banco.eliminarCliente("Juan Pérez");
        banco.cerrarCuenta("001");

        // Validar eliminación
        System.out.println("Cliente 1 eliminado: " + (banco.obtenerCliente("Juan Pérez") == null));
        System.out.println("Cuenta de Ahorro cerrada: " + (banco.obtenerCuenta("001") == null));
    }
}
