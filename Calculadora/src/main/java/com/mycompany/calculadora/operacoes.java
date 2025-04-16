/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author 08228
 */
public class operacoes {
    public static double resultado;
    
    public static double soma(double num1, double num2){
        resultado = num1 + num2;
        return resultado;
    }
    
    public static double divisao(double num1, double num2){
        if(num2 != 0){
            resultado = num1/num2;
            return resultado;
        }else{
            throw new ArithmeticException("Divisão por zero não permitida");
        }
    }
    
    public static double multiplicacao(double num1, double num2){
        resultado = num1 * num2;
        return resultado;
    }
    
    public static double subtracao(double num1, double num2){
        resultado = num1 - num2;
        return resultado;
    }
}
