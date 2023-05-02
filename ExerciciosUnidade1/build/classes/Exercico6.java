//6 - Receba o salário base de um funcionário,
//calcule e mostre o salário a receber, sabendo-se que
//o funcionário tem 5% de gratificação sobre o salário
//base e paga imposto de 7% sobre este salário
import java.util.Scanner;
public class Exercico6 {
      public static void main(String[] args) {
          
          double salarioBase; double calc; double novoSalario;
       
    System.out.println("Entre com o SALÁRIO BASE do funcionário:");
    Scanner scan = new Scanner(System.in);
    salarioBase = scan.nextDouble();
    //calc = scan.nextDouble();
    
    calc = salarioBase + (salarioBase * 0.05);
    novoSalario = calc - (calc * 0.07);
    
    System.out.print("O NOVO SALÁRIO + GRATIFICAGÇÃO DE 5% + ");
  System.out.println(" DESCONTO DE 7% É:" + novoSalario);
       
    }
    
}
