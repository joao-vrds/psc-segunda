/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade7
{
    public static void main(String[] args) 
    {
        double salario;
        double i = 1.07;
        double salarioReajustado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu sálario atual: ");
        salario = entrada.nextDouble();
        
        salarioReajustado = salario * i;
        System.out.print("Seu novo salário é: " + "R$" + salarioReajustado);
    }
}
