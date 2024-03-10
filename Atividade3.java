import java.util.Scanner;

public class Atividade3 
{
    public static void main(String[] args) 
    {
        String nome;
        String saudacao = "Seja bem vindo(a)";

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva seu nome");
        nome = entrada.nextLine();

        System.out.println(saudacao + nome);
    }
}
