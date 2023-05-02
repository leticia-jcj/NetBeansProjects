///4 - Uma empresa concederá um aumento variável
//de salário aos seus funcionários, de acordo com o cargo,
//conforme a tabela abaixo.

//Entrada dados: leia o salário e o código do cargo de um funcionário e calcula
//o novo salário.

//if cargofuncionario não estiver na tabela = funcionário receber 40% de aumento

//Mostre o salário antigo, o novo salário e a
//diferença. (faça usando as condicionais – switch e composta if (opcao != codigoCargo)

//você fará dois programas separadamente)
//Código Cargo Percentual
//101 Gerente 10%
//102 Engenheiro 20%
//103 Técnico 30%
import java.util.Scanner;
public class Exercicio4 {
   public static void main(String[] args) {
        
         double salario; //int codigoCargo;
         double novoSalario; 
         int opcao;
    
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("ENTRE COM O SALÁRIO DO FUNCIONÁRIO: R$ ");
        salario = teclado.nextDouble();
             
        System.out.println(" ");
        System.out.print("      CÓDIGO |   CARGO  |  PERCENTUAL");
        System.out.println(" ");
        System.out.println("       101      GERENTE       10%");
        System.out.println("       102      ENGENHEIRO    20%");
        System.out.println("       103      TÉCNICO       30%");
        System.out.println(" ");
        
        System.out.print("DIGITE O CÓDIGO DO CARGO DO FUNCIONÁRIO: ");
        //System.out.println(" ");
        //System.out.print("ENTRE COM O CÓDIGO DO CARGO DO FUNCIONÁRIO: ");
        //codigoCargo = teclado.nextInt();
                
        opcao = teclado.nextInt();
        switch (opcao) {
            case 101: System.out.println("101 - GERENTE - REAJUSTE DE 10%: R$ " + (salario + (salario*0.01)));
                      System.out.println("    - SALÁRIO ANTIGO: R$ " + salario); break;  
            case 102: System.out.println("102 - ENGENHEIRO - REAJUSTE DE 20%: R$ " + (salario + (salario*0.02)));
                      System.out.println("    - SALÁRIO ANTIGO: R$ " + salario); break; 
            case 103: System.out.println("103 - TÉCNICO - REAJUSTE DE 30%: R$ " + (salario + (salario*0.03)));
                      System.out.println("    - SALÁRIO ANTIGO: R$ " + salario); break; 
             default:
               System.out.println("O CARGO DO FUNCIONÁRIO NÃO CONSTA NA TABELA");
               System.out.println(" ");
               System.out.println("|| REAJUSTE SALARIAL DE 40% ||");
               System.out.println(" ");
               System.out.println("---- SALÁRIO ANTIGO: R$ " + salario);
               System.out.println("---- NOVO SALÁRIO:   R$ " + (salario + (salario*0.04))); 
               
               System.out.print("---- DIFEREÇA DO REAJUSTE: R$ ");
               novoSalario = (salario + (salario*0.04) - salario);
               System.out.println("" + novoSalario);
        }
       
    }
    
}
