/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade18;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade18
{
    public static void main(String[] args) 
    {   
     int alturaDoDegrau;
     int alturaEscada;
     int quantidadeDegraus;
     
     Scanner entrada = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("#,##00.00");
     
     System.out.print("Digite a altura de cada degrau(em metros): ");
     alturaDoDegrau = entrada.nextInt();
     
     System.out.print("Digite a altura da escada(em metros): ");
     alturaEscada = entrada.nextInt();
     
     quantidadeDegraus = alturaEscada / alturaDoDegrau;
     
     System.out.print("A quantidade de degraus é " + quantidadeDegraus);
     
    }
}
