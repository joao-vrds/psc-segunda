/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade10;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade10
{
    public static void main(String[] args) 
    {
      double fahrenheit;
      double celsius;
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite o valor da temperatura me Fahrenheit: ");
      fahrenheit = entrada.nextDouble();
      
      celsius = ((fahrenheit - 32) / 9) * 5;
      System.out.print(fahrenheit + " fahrenheit é igual a " + celsius + "celsius"); 
    }
}
