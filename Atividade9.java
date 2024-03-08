/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade9;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade9
{
    public static void main(String[] args) 
    {
       double raio; 
       double areaDoCirculo;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite o raio em centímetros: ");
       raio = entrada.nextDouble();
       
       areaDoCirculo = 3.14 * (raio * raio);
       
       System.out.print("O círculo de raio " + raio + "cm possui área de " + areaDoCirculo + "cm^2");
    }
}
