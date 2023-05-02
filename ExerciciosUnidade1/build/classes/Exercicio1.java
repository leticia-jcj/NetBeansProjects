// 1 – Faça um programa que receba 4 números inteiros,
// calcule e mostre a soma desses números.
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
    //método MAIN responsável pela execução do programa
        System.out.println("Entre com quatro números e aguarde o resultado:");
        //declaração de variáveis
        int n1; int n2; int n3; int n4;
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        n1 = scan.nextInt(); n2 = scan.nextInt();
        n3 = scan.nextInt(); n4 = scan.nextInt();
        System.out.print("A soma dos números informados é:");
        //saída de dados
        System.out.println(n1+n2+n3+n4);
        //sout+tab = 2 atalho para escrever System.out.println
        //psvm+tab = atalho para escrever public static void main
        //concatenação = juntar 2 variaveis string
    }
    
}
