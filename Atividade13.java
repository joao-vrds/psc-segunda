/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade13;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade13
{
    public static void main(String[] args) 
    {   
      double valorDaHoraTrabalhada;
      double salarioBruto = 0;
      double horasTrabalhadas;
      double taxaInss = 0;
      double salarioLiquido;
      
      Scanner entrada = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##00.00");
      
      System.out.print("Digite o valor da hora: ");
      valorDaHoraTrabalhada = entrada.nextDouble();
      
      System.out.print("Digite quantas horas foram trabalha: ");
      horasTrabalhadas = entrada.nextDouble();
      
      salarioBruto = valorDaHoraTrabalhada * horasTrabalhadas;
      
      if (salarioBruto <= 1412)
      { taxaInss = 1.075; }
      else if ( salarioBruto <= 2665 )
      { taxaInss = 1.09; }
      else if ( salarioBruto <= 3999 )
      { taxaInss = 1.12; }
      else
      { taxaInss = 1.14; }
      
      salarioLiquido = salarioBruto / taxaInss ;
      
      System.out.print("Seu salário líquido é: R$" + df.format(salarioLiquido)); 
    }
}
