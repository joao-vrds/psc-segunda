import java.util.Scanner;
public class Atividade2 { public static void main(String[] args) 
    {
     Double X;
     Double Y;

     Scanner entrada = new Scanner(System.in);
     System.out.print("Informe o primeiro numero:");
    X = entrada.nextDouble();
    
    System.out.print("Informe o segundo numero:");

    Y = entrada.nextDouble();

      double resto = X % Y;  

      System.out.println("Resultado: " + resto);
      entrada.close();
    }
    
}
