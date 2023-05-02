//9 - Faça um programa que receba o ano de nascimento e ano atual,
//calcule e mostre a idade atual e a idade em 2080.
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        
        int anoNascimento;int anoAtual; int calc; int idadeFuturo;
        Scanner scan = new Scanner(System.in);
                
    System.out.print("INFORME O ANO DE NASCIMENTO:");
     anoNascimento = scan.nextInt();
     
    System.out.print("INFORME O ANO ATUAL:");
     anoAtual = scan.nextInt();
       
       calc =  anoAtual - anoNascimento;
       idadeFuturo = 2080 - anoAtual;
       
    System.out.println("______________________________________");
    System.out.println("SUA IDADE ATUAL É: " + calc);
    System.out.println("SUA IDADE EM 2080 SERÁ: " + idadeFuturo);
    System.out.println("______________________________________");
    }
    
}
