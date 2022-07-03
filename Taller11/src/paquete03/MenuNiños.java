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
public class MenuNiños extends Menu {
    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNiños(String nombrePlato, double valorInicialMenu,double valorPorcionHelado, double valorPorcionPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double getValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public void setValorPorcionHelado(double valorPorcionHelado) {
        this.valorPorcionHelado = valorPorcionHelado;
    }

    public double getValorPorcionPastel() {
        return valorPorcionPastel;
    }

    public void setValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }
    @Override
    public void setValorMenu(){
        valorMenu = getValorInicialMenu() + getValorPorcionHelado() + getValorPorcionPastel();
    }
    public String toString(){
        String cadena = String.format("Menu de niños\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del menú: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorPorcionHelado(),getValorPorcionPastel(),getValorMenu());
        return cadena;
    }
    
}
