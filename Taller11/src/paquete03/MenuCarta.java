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
public class MenuCarta extends Menu {
   private double valorPorcionGuarnicion;
   private double valorBebida;
   private double porcentajeAdicional;

    public MenuCarta( String nombrePlato, double valorInicialMenu,double valorPorcionGuarnicion, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public void setValorPorcionGuarnicion(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }
   @Override
    public void setValorMenu(){
        valorMenu = getValorInicialMenu()+getValorBebida()+getValorPorcionGuarnicion()+
                (getValorInicialMenu()*(getPorcentajeAdicional()/100));
    }
    public String toString(){
        String cadena = String.format("Menu de Carta\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor guarnicion: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor del menú: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorPorcionGuarnicion(),getValorBebida(),getPorcentajeAdicional(),getValorMenu());
        return cadena;
    }
}
