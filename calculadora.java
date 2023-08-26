/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class calculadora {

    public double a;
    public double b;
    public double resultado;

    public void setA(double a) {     // si
        this.a = a;
    }

    public void setB(double b) {      // si 
        this.b = b;
    }

    public double sumar(double a, double b) {
        //resultado = a + b;
        return a+b;
    }

    public double restar(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    public double multiplicar(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "ingrese numero b diferente de 0");
            b = Double.parseDouble(JOptionPane.showInputDialog(null));
        }
        resultado = a / b;
        return resultado;
    }
}
