/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade12;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade12
{
    public static void main(String[] args) 
    {  
      int valorInicial;
      int antecessor;
      int posterior;
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite um número: ");
      valorInicial = entrada.nextInt();
      
      antecessor = valorInicial - 1;
      posterior = valorInicial + 1;
      
      System.out.print("Seu número é " + valorInicial + ", o seu antecessor é o " + antecessor + " e o seu posterior é " + posterior);
    }
}
