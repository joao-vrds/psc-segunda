/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade11;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;


public class Atividade11
{
    public static void main(String[] args) 
    {
      float nota1;
      float nota2;
      float nota3;
      float media;
      
      Scanner entrada = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.00");
      System.out.print("Digite a primeira nota: ");
      nota1 = entrada.nextFloat();
      
      System.out.print("Digite a segunda nota: ");
      nota2 = entrada.nextFloat();
      
      System.out.print("Digite a terceira nota: ");
      nota3 = entrada.nextFloat();
      
      media = (nota1 + nota2 + nota3) / 3;
      
      System.out.printf("Sua média das 3 notas é: " + df.format(media));
    }
}
