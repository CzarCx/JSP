/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Problemas;

/**
 *
 * @author artem
 */
public class Problema5 {
   private String grupo;
    private int nHombres;
    private int nMujeres;
    private int porcH;
    private int porcM;

    public Problema5(String grupo, int nHombres, int nMujeres) {
        this.grupo = grupo;
        this.nHombres = nHombres;
        this.nMujeres = nMujeres;
    }

    public Problema5() {
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getnHombres() {
        return nHombres;
    }

    public void setnHombres(int nHombres) {
        this.nHombres = nHombres;
    }

    public int getnMujeres() {
        return nMujeres;
    }

    public void setnMujeres(int nMujeres) {
        this.nMujeres = nMujeres;
    }

    public int getPorcH() {
        return porcH;
    }

    public void setPorcH(int porcH) {
        this.porcH = porcH;
    }

    public int getPorcM() {
        return porcM;
    }

    public void setPorcM(int porcM) {
        this.porcM = porcM;
    }
    
    public void porcentaje(){
    this.porcH=(this.nHombres*100)/(this.nHombres+this.nMujeres);
    this.porcM=(this.nMujeres*100)/(this.nHombres+this.nMujeres);    
    }     
}
