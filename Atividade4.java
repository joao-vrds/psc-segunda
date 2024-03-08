/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Atividade4 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String endereco;
        String telefone;
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Digite seu endereço: EXP: (Rua das palmeiras, n 18, Bairro Industrial): ");
        endereco = entrada.nextLine();
        
        System.out.print("Digite seu telefone: ");
        telefone = entrada.nextLine();
        
        System.out.print("Seu nome é " + nome + ", seu número de telefone é " + 
                            telefone + " e você mora no endereço " + endereco);
        
    }
}

