/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo2;

/**
 *
 * @author jjforond
 */
public class Domicilio {
    private String calle;
    private String colonia;
    private String estado;
    private int codigoPostal;

    public Domicilio(String calle, String colonia, String estado, int codigoPostal) {
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", colonia='" + colonia + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
