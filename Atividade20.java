/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade20;

/**
 *
 * @author Jovro
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade20
{
    public static Double valorTotal (int porcentagem, double valorDaPeca, int quantidadeDePeca)
    {
        double resultado = valorDaPeca * quantidadeDePeca * (((double)porcentagem/100) + 1);
        return resultado;
    }
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        
        int i1 = 0;
        double valorUnitario1 = 0;
        String codigoDaPeca1 = null;
        int quantidadeDePeca1 = 0;
        
        int i2 = 0;
        double valorUnitario2 = 0;
        String codigoDaPeca2 = null;
        int quantidadeDePeca2 = 0;
        
        
        System.out.print("Digite a taxa da primeira peça: ");
        i1 = entrada.nextInt();
        System.out.print("Digite o valor unitário da primeira peça: ");
        valorUnitario1 =  entrada.nextDouble();
        System.out.print("Digite o código da primeira peça: ");
        codigoDaPeca1 = entrada.next();
        System.out.print("Digite a quantidade da primeira peça: ");
        quantidadeDePeca1 = entrada.nextInt();
        
        System.out.print("\n\nDigite a taxa da segunda peça: ");
        i2 = entrada.nextInt();
        System.out.print("Digite o valor unitário da segunda peça: ");
        valorUnitario2 =  entrada.nextDouble();
        System.out.print("Digite o código da segunda peça: ");
        codigoDaPeca2 = entrada.next();
        System.out.print("Digite a quantidade da segunda peça: ");
        quantidadeDePeca2 = entrada.nextInt();
        
        double total = valorTotal(i1, valorUnitario1, quantidadeDePeca1) + valorTotal(i2, valorUnitario2, quantidadeDePeca2);
    
        System.out.printf("\nValor da compra da peça " + codigoDaPeca1 + " é de R$" + df.format(valorTotal(i1, valorUnitario1, quantidadeDePeca1)));
        System.out.printf("\nValor da compra da peça " + codigoDaPeca2 + " é de R$" + df.format(valorTotal(i2, valorUnitario2, quantidadeDePeca2)));
        System.out.printf("\nValor total da compra é de R$" + df.format(total));
        
    }
}
