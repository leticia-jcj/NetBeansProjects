//8 - Faça um programa que receba o valor de um depósito e o valor
//da taxa de juros, calcule e mostre o valor do rendimento e valor
//total após o rendimento
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
    double deposito; double rendimento; double taxaJuros; double calc;
       
    System.out.print("INFORME O VALOR DO DEPÓSITO: ");
    Scanner scan = new Scanner(System.in);
    deposito = scan.nextDouble();
    
    System.out.print("INFORME O VALOR DA TAXA DE JUROS: ");
    taxaJuros = scan.nextDouble();  
    
    rendimento = deposito * (taxaJuros/100);   
    calc = deposito + rendimento;
    System.out.println("__________________________");    
    System.out.printf("RENDIMENTO FINAL R$ %.2f\n: ", calc);
      
    }
    
}
