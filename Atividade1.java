import java.util.Scanner;
public class Atividade1 { public static void main(String[] args) 
    {
     Double n1;
     Double n2;

     Scanner entrada = new Scanner(System.in);
     System.out.print("Informe o primeiro numero:");
    n1 = entrada.nextDouble();
    
    System.out.print("Informe o segundo numero:");

    n2 = entrada.nextDouble();

      double soma = n1 + n2;  

      System.out.println("Resultado: " + soma);
      entrada.close();
    }
    
}
