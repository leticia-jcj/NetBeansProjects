//Faça um programa que receba o salário de um funcionário,
//if salário >= a R$ 1.000,00, mostrar salário + R$ 100,00 de bônus,
//if salário < que R$ 1.000,00, o bônus será de R$ 50,00.
//Mostre: novo salário (condicional – if...else)
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
     
        double salarioFuncionario;
        double novoSalario = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ENTRE COM O SALÁRIO DO FUNCINÁRIO: R$ ");
        salarioFuncionario = scan.nextDouble();
        
        if (salarioFuncionario >= 1000){
            novoSalario =  salarioFuncionario + 100;
            System.out.println("NOVO SALÁRIO + BÔNUS DE R$ 100,00 É: R$ " + novoSalario);  
        }
          
            else if (salarioFuncionario < 1000){
            novoSalario =  salarioFuncionario + 50;
            System.out.println("NOVO SALÁRIO + BÔNUS DE R$ 50,00 É: R$ " + novoSalario);   
         }
                
    }
}
    

