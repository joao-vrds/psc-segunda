/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade16;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade16
{
    public static void main(String[] args) 
    {
     double litrosConsumidos;
     double kmPercorridos;
     double kmPorLitro;
     
     Scanner entrada = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#,##00.00");
     
     System.out.print("Quantos kilometros foram percorridos: ");
     kmPercorridos = entrada.nextDouble();
     
     System.out.print("Quantos litros de gasolina foram gastos: ");
     litrosConsumidos = entrada.nextDouble();
     
     kmPorLitro = kmPercorridos / litrosConsumidos;
     
     System.out.print("O consumo médio foi de " + df.format(kmPorLitro) + " Km/l");
    }
}
