/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade14;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade14
{
    public static void main(String[] args) 
    {
      double a;
      double b;
      double c;
      double d;
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite um número para A: ");
      a = entrada.nextDouble();
      
      System.out.print("Digite um número para B: ");
      b = entrada.nextDouble();
      
      c = a;
      d = b;
      a = d;
      b = c;
      
      System.out.print("Agora A vale " + a + " e B vale " + b);
    }
}
