/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo1;

/**
 *
 * @author jjforond
 */
public class Main {
    public static void main(String[] args) {
        // Crear un domicilio
        Domicilio domicilio = new Domicilio("Calle 123", "Colonia Centro", "Estado X", 12345);

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
    }
}
