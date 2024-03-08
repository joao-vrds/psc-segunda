/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade15;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade15
{
    public static void main(String[] args) 
    {   
     double a;
     double b;
     double c;
     double delta;
     double bhaskara1;
     double bhaskara2;
     
     Scanner entrada = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#,##00.00");
     
     System.out.print("Digite um valor para A: ");
     a = entrada.nextDouble();
     
     System.out.print("Digite um valor para B: ");
     b = entrada.nextDouble();
     
     System.out.print("Digite um valor para C: ");
     c = entrada.nextDouble();
     
     delta = Math.pow(b,2) - 4*a*c;
     bhaskara1 = ((-b)+ Math.sqrt(delta))/ (2*a);
     bhaskara2 = ((-b)- Math.sqrt(delta))/ (2*a);
     
     System.out.println("Valor de X1 = " + df.format(bhaskara1));
     System.out.println("Valor de X2 = " + df.format(bhaskara2));
    }
}
