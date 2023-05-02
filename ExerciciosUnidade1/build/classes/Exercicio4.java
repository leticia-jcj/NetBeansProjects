//4 - Faça um programa que receba o salário de um funcionário,
//calcule e mostre o novo salário,sabendo-se que sofreu um aumento de 25%.
import java.util.Scanner;
public class Exercicio4 {

     public static void main(String[] args) {
        
        double salario; double calc;
       
    System.out.println("Entre com o salário:");
      Scanner scan = new Scanner(System.in);
        salario = scan.nextDouble();
        //calc = scan.nextDouble();
        calc = salario + (salario * 0.25);
        
    System.out.println("O novo salário com ajuste de 25% é:" + calc);
   
    }
}
