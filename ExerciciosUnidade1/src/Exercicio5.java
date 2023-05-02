//5 - Faça um programa que receba o salário de um funcionário
//e o percentual de aumento, mostre o valor do aumento e o novo salário.
import java.util.Scanner;
public class Exercicio5 {
   public static void main(String[] args) {
      double salario; double calc; double percentual;
       
    System.out.print("Entre com o salário do funcionário:");
    Scanner scan = new Scanner(System.in);
    salario = scan.nextDouble();
    
    System.out.print("Entre com o percentual de aumento:");
    percentual = scan.nextDouble();  
    //calc = scan.nextDouble();
     
    percentual = percentual/100;
    calc = salario + (salario * percentual);
         
    System.out.printf("O novo salário com ajuste é R$ %.2f\n:", calc);
        
    }
    
}
