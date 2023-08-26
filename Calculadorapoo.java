/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadorapoo;

import javax.swing.JOptionPane;

public class Calculadorapoo {

    public static int op = 0;

    public static void main(String[] args) {
        calculadora mycalculadora = new calculadora();
        while (true) {

            double a = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero a"));

            double b = Double.parseDouble(JOptionPane.showInputDialog("ingrese numero b"));

            op = Integer.parseInt(JOptionPane.showInputDialog("ingrese la operacon que desea relizar  \n1.suma \n2.resta \n3.multiplicar \n4.dividir  "));

            while (true) {
                if (op >= 1 && op <= 4) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "ingrese numero valido");
                }
            }
            
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "el resultado es : " + mycalculadora.sumar(a, b));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "el resultado es : " + mycalculadora.restar(a, b));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "el resultado es : " + mycalculadora.multiplicar(a, b));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "el resultado es : " + mycalculadora.dividir(a, b));
                    break;

            }

            
            
            int con = Integer.parseInt(JOptionPane.showInputDialog("0.salir \n1.continuar"));

            if (con == 0) {
                break;
            }
        }
    }
}
