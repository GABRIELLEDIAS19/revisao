import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite sua altura: ");
    double altura = sc.nextDouble();
    System.out.println("digite seu peso: ");
    double peso = sc.nextDouble();
    double imc = peso / (altura * altura);
    System.out.printf("seu imc é %.2f", imc);
    sc.close();
    }
    
  
  }

  