/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Problemas;

/**
 *
 * @author artem
 */
public class Problema8 {
    private int num1;
    private int num2;
    private int num3;
    private int mayor;

    public Problema8(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Problema8() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    
    public void mayor(){
        if (num1>num2)
        {
            if ( num1> num3){
             mayor= num1;
            }
            else{
             mayor= num3;
            }
        }else if( num1< num2)
        {
            if( num2> num3){
             mayor= num2;
            }
            else{
             mayor= num3;
            }
        }
    
    }
    
}