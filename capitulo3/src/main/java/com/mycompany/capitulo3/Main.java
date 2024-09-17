/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo3;

/**
 *
 * @author jjforond
 */
public class Main {
    public static void main(String[] args) {
        // Crear un domicilio
        Domicilio domicilio = new Domicilio("Calle 123", "Prado", "Antioquia", 12345);

        // Crear un banco
        Banco banco = new Banco("Banco Ejemplo", domicilio);

        // Crear un cliente
        Cliente cliente = new Cliente("1", "Juan Perez", "555-1234", domicilio);

        // Agregar el cliente al banco
        banco.agregarCliente(cliente);

        // Crear una cuenta de cheques
        CuentaCheques cuentaCheques = new CuentaCheques(1001, "01/01/2024", 1000.0, 10.0);

        // Agregar la cuenta al cliente
        cliente.agregarCuenta(cuentaCheques);

        // Listar clientes del banco
        banco.listarClientes();

        // Mostrar detalles de la cuenta
        System.out.println(cuentaCheques.toString());

        // Cobrar comisión mensual
        cuentaCheques.cobrarComision();

        // Mostrar detalles de la cuenta después de cobrar la comisión
        System.out.println(cuentaCheques.toString());

        // Validar métodos de ServicioCuentas
        cuentaCheques.depositar(500);
        System.out.println("Saldo después de depositar: " + cuentaCheques.consultarSaldo());
        cuentaCheques.retirar(200);
        System.out.println("Saldo después de retirar: " + cuentaCheques.consultarSaldo());

        // Validar métodos de ServicioClientes
        Cuenta cuentaBuscada = cliente.buscarCuenta(1001);
        if (cuentaBuscada != null) {
            System.out.println("Cuenta encontrada: " + cuentaBuscada.toString());
        } else {
            System.out.println("Cuenta no encontrada.");
        }

        // Ejemplo adicional 1: Crear otro cliente
        Cliente cliente2 = new Cliente("2", "Maria Lopez", "555-5678", domicilio);
        banco.agregarCliente(cliente2);
        banco.listarClientes();

        // Ejemplo adicional 2: Crear una cuenta de ahorros
        Cuenta cuentaAhorros = new Cuenta(1002, "02/02/2024", 2000.0);
        cliente2.agregarCuenta(cuentaAhorros);
        System.out.println(cuentaAhorros.toString());

        // Ejemplo adicional 3: Transferir dinero entre cuentas
        cuentaCheques.retirar(300);
        cuentaAhorros.depositar(300);
        System.out.println("Saldo cuenta cheques después de transferencia: " + cuentaCheques.consultarSaldo());
        System.out.println("Saldo cuenta ahorros después de transferencia: " + cuentaAhorros.consultarSaldo());

        // Ejemplo adicional 4: Eliminar una cuenta
        cliente2.eliminarCuenta(1002);
        Cuenta cuentaEliminada = cliente2.buscarCuenta(1002);
        if (cuentaEliminada == null) {
            System.out.println("Cuenta eliminada correctamente.");
        } else {
            System.out.println("Error al eliminar la cuenta.");
        }

        // Ordenar y listar clientes por ID
        banco.ordenarClientesPorId();
        banco.listarClientes();

        // Ordenar y listar cuentas por saldo
        cliente.ordenarCuentasPorSaldo();
        for (Cuenta cuenta : cliente.cuentas) {
            System.out.println(cuenta.toString());
        }
    }
}
