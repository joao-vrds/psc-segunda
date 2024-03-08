/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade5 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        double dolar = 4.95;
        double real;
        
        System.out.println("Digite o valor em dolar: ");
        real = entrada.nextDouble();

        System.out.println("$" + real + " = " + "R$" + (real * dolar));
    }
}

