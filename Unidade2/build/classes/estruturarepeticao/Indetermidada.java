//Entre com o código e salário de vários professores e mostre ao final, a
//quantidade de professores digitados e a média salarial dos professores.
//O programa termina quando o usuário digitar o número 999
package estruturarepeticao;
import java.util.Scanner;
public class Indetermidada {
     public static void main(String[] args) {
         
         int codigo;
         double salario;
         double somaSalario = 0;
         double mediaSalario = 0;
         int contadorProfessor = 0;
         int cont1000 = 0;
         double percentual = 0;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.print("DIGITE O CÓDIGO DO PROFESSOR OU 999 PARA SAIR: ");
         codigo = scan.nextInt();
         
         while (codigo != 999) {
             
             System.out.print("DIGITE O SALÁRIO DO PROFESSOR: R$ ");
             salario = scan.nextDouble();
             
             contadorProfessor++; //quantidade
             somaSalario = somaSalario + salario; //soma
             mediaSalario = somaSalario/contadorProfessor;//media = aquilo que quero
                                                          //fazer a média + quantidade
             //mostrar salario maior que 1000
             if (salario > 1000) {
                cont1000++;
             }
             percentual = cont1000++*100/contadorProfessor; //percentual = conto o quw quero saber
                                                            //o percentual multiplico por 100 e divido
                                                            //tudo pela quantidade total
                                                            
             System.out.print("DIGITE O CÓDIGO DO PROFESSOR OU 999 PARA SAIR: ");
             codigo = scan.nextInt();
             
         }
         System.out.println("QUANTIDADE DE PROFESSORES: " + contadorProfessor);
         System.out.println("MÉDIA SALARIAL DOS PROFESSORES: " + mediaSalario);
         System.out.println("QUANTIDADES DE SALÁERIOS MAIORES DO QUE R$ 1000: " + cont1000);
         System.out.println("PORCENTAGEM DE SALÁERIOS MAIORES DO QUE R$ 1000: " + percentual);
    }
    
}
