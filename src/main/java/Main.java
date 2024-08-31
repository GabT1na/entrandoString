import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu primeiro nome:");
    String nome = sc.next();
    
    System.out.println("digite seu sobrenome");

    String sobrenome = sc.next();

    System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    
    sc.close();

    Scanner idade =new Scanner(System.in);
    System.out.println("Qual a sua idade? ");
       int numero = idade.nextInt();
      System.out.println("O número digitado foi:");
       System.out.println(numero);
     idade.close();
  }
}