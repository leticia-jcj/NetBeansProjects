//7 - Faça um programa que receba o salário base de um funcionário,
//calcule e mostre o seu salário a receber, sabendo-se que o funcionário
//tem gratificação de R$ 50 e imposto de 10% sobre o salário base.
import java.util.Scanner;
public class Exercico7 {
    public static void main(String[] args) {
      
        double salarioBase; double calc; double novoSalario;
       
    System.out.println("Entre com o SALÁRIO BASE do funcionário:");
    Scanner scan = new Scanner(System.in);
    salarioBase = scan.nextDouble();
    //calc = scan.nextDouble();
    
    calc = salarioBase - (salarioBase*0.1);
    novoSalario = salarioBase + 50 - calc;
    
    System.out.print("O NOVO SALÁRIO + GRATIFICAGÇÃO DE R$ 50,00 + ");
  System.out.println(" DESCONTO DE 10% É:" + novoSalario);
       
    }
    
}
