 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade17;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade17
{
    public static void main(String[] args) 
    {   
    double canetas = 0;
    double valorPago = 0;
    double troco = 0;
    double valorPagoPorCaneta;
    
    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##00.00");
    
    System.out.print("Digite quantas canetas foram compradas: ");
    canetas = entrada.nextDouble();
    
    System.out.print("Valor pago pelas canetas: ");
    valorPago = entrada.nextDouble();
    
    System.out.print("Troco recebido: ");
    troco = entrada.nextDouble();
    
    valorPagoPorCaneta = (valorPago - troco) / canetas;
    
    System.out.print("Valor pago por cada caneta foi: R$ " + df.format(valorPagoPorCaneta));
    }
}
