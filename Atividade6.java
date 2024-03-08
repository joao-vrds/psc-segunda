/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade6
{
    public static void main(String[] args) 
    {
       int idade;
       int diasNoAno = 365;
       int diasDeVida;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite quantos anos você tem: ");
       
       idade = entrada.nextInt();
       diasDeVida = diasNoAno * idade;
       
       System.out.print("Você viveu aproximadamente " + diasDeVida + " dias.");
    }
}
