/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade8;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade8
{
    public static void main(String[] args) 
    {
        double centimetros = 100;
        double metros;
        double metrosParaCentimetros;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de metros: " );
        metros = entrada.nextDouble();
        
        metrosParaCentimetros = metros * centimetros;
        
        System.out.print(metros + " metros em centímetros é igual a: " + metrosParaCentimetros + "cm");
    }
}
