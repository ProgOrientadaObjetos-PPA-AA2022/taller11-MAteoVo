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
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu,double valorPostre, double valorBebida) {
        super(nombrePlato,valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    @Override
    public void setValorMenu(){
        valorMenu = getValorPostre() + getValorBebida() + getValorInicialMenu();
    }
    public String toString(){
        String cadena = String.format("Menu de Dia\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del menú: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorBebida(),getValorPostre(),getValorMenu());
        return cadena;
    }
}
