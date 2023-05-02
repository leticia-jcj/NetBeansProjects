//3 – Faça um programa que receba dois números e execute as opções abaixo,
//de acordo com a escolha do usuário: (faça usando a condicional – switch)

//•	– Média entre os números digitados
//•	– Produto (multiplicação) entre os números digitados
//•	– Divisão do primeiro pelo segundo
//•	– Diferença do maior pelo menor
// Se a opção digitada for inválida, mostre uma mensagem de erro.
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        
        int opcao; int n1; int n2;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTRE COM O 1º NÚMERO: ");
        n1 = scan.nextInt();
        
        System.out.print("ENTRE COM O 2º NÚMERO: ");
        n2 = scan.nextInt();
        
        System.out.println(" ");
        System.out.print("ESCOLHA UMA OPÇÃO DO MENÚ: ");
        System.out.println(" ");
        System.out.println("DIGITE 1 --- MÉDIA ENTRE OS NÚMEROS");
        System.out.println("DIGITE 2 --- MULTIPLICAÇÃO ENTRE OS NÚMEROS");
        System.out.println("DIGITE 3 --- DIVISÃO DO PRIMEIRO PELO SEGUNDO");
        System.out.println("DIGITE 4 --- DIFERENÇA DO MAIOR PELO MENOR");
        System.out.println(" ");
                
        opcao = scan.nextInt();
        switch (opcao) {
            case 1: System.out.println("1 --- MÉDIA ENTRE OS NÚMEROS: " + ((n1+n2)/2)); break;
            case 2: System.out.println("2 --- MULTIPLICAÇÃO ENTRE OS NÚMEROS: " + (n1*n2)); break;
            case 3: System.out.println("3 --- DIVISÃO DO PRIMEIRO PELO SEGUNDO: " + (n1/n2)); break;
            case 4: System.out.println("4 --- DIFERENÇA DO MAIOR PELO MENOR: " + (n1-n2)); break;
           default: System.out.println("OPÇÃO INVÁLIDA!");
                                        
        }
        
    }
    
}
