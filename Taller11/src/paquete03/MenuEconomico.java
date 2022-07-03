/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author mateovalarezoojeda
 */
public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu,double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    @Override
    public void setValorMenu(){
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento/100);
    }
    public String toString(){
        String cadena = String.format("Menu de Economico\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tPorcentaje de descuento: %.2f\n"
                + "\tValor del menú: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getPorcentajeDescuento(),getValorMenu());
        return cadena;
    }
}
