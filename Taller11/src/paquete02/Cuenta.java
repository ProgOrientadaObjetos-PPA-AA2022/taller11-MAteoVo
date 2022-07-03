/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author mateovalarezoojeda
 */
public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> listadoCartas;
    private double iva;
    private double valorCancelarTotal;
    private double subTotal;
    public Cuenta(String nombreCliente, ArrayList<Menu> listadoCartas, double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoCartas = listadoCartas;
        this.iva = iva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Menu> getListadoCartas() {
        return listadoCartas;
    }

    public void setListadoCartas(ArrayList<Menu> listadoCartas) {
        this.listadoCartas = listadoCartas;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getValorCancelarTotal() {
        return valorCancelarTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            subTotal +=listadoCartas.get(i).getValorMenu();
        }
    }
    
    public void setValorCancelarTotal() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            valorCancelarTotal +=listadoCartas.get(i).getValorMenu();
        }
        valorCancelarTotal = valorCancelarTotal + (valorCancelarTotal*(iva/100));
    }
    public String toString(){
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n"
        ,nombreCliente);
        for (int i = 0; i < listadoCartas.size(); i++) {
            cadena = String.format("%s%s\n",cadena,listadoCartas.get(i));
        }
        cadena = String.format("%sSubtotal: %.2f\nIVA: %.2f%%\nTotal a pagar: %.2f\n",cadena,subTotal,iva,valorCancelarTotal);
        return cadena;
    }
}
