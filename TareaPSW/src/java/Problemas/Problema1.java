/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Problemas;

/**
 *
 * @author artem
 */
public class Problema1 {
    private String nombre;
    private double capital;
    private double interes=1.02;
    private double total;

    public Problema1(String nombre, double capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public Problema1() {
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcular()
    {
    this.total=(this.capital*this.interes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
