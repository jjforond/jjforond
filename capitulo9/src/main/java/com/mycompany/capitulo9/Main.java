/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo9;

/**
 *
 * @author jjforond
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear un banco
        Banco banco = new Banco("Banco Central", "Calle Principal 123", "555-1234");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "Avenida Siempre Viva 742", "555-5678", LocalDate.of(1985, 5, 15));
        Cliente cliente2 = new Cliente("María López", "Calle Falsa 123", "555-8765", LocalDate.of(1990, 8, 20));

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Mostrar información de los clientes
        System.out.println("Clientes del banco:");
        banco.getClientes().forEach(System.out::println);

        // Crear cuentas
        CuentaAhorro cuentaAhorro = new CuentaAhorro("001", 1000.0, LocalDate.now(), 0.05);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", 500.0, LocalDate.now(), 200.0);

        // Abrir cuentas en el banco
        banco.abrirCuenta(cuentaAhorro);
        banco.abrirCuenta(cuentaCorriente);

        // Operaciones con las cuentas
        cuentaAhorro.depositar(200.0);
        cuentaAhorro.retirar(150.0);
        cuentaCorriente.depositar(300.0);
        cuentaCorriente.retirar(600.0);

        // Mostrar información de las cuentas
        System.out.println("Cuentas del banco:");
        banco.getCuentas().forEach(System.out::println);

        // Obtener y mostrar información específica
        System.out.println("Información específica:");
        System.out.println("Cliente 1: " + banco.obtenerCliente("Juan Pérez"));
        System.out.println("Cliente 2: " + banco.obtenerCliente("María López"));
        System.out.println("Cuenta de Ahorro - Saldo: " + banco.obtenerCuenta("001").getSaldo());
        System.out.println("Cuenta Corriente - Saldo: " + banco.obtenerCuenta("002").getSaldo());

        // Eliminar cliente y cerrar cuenta
        banco.eliminarCliente("Juan Pérez");
        banco.cerrarCuenta("001");

        // Validar eliminación
        System.out.println("Validación de eliminación:");
        System.out.println("Cliente 1 eliminado: " + (banco.obtenerCliente("Juan Pérez") == null));
        System.out.println("Cuenta de Ahorro cerrada: " + (banco.obtenerCuenta("001") == null));
    }
}
