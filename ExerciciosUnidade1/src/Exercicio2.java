//2 - Faça um programa que receba 3 notas,
//calcule e mostre a média aritmética entre elas.
import java.util.Scanner;
public class Exercicio2 {
    
    public static void main(String[] args) {
    System.out.println("Digite as três notas e aguarde o resultado:");
        //declaração de variáveis
        double n1; double n2; double n3;
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        n1 = scan.nextDouble(); n2 = scan.nextDouble(); n3 = scan.nextDouble();
        System.out.print("A média aritmética das notas informadas é:");
        //saída de dados
        System.out.println((n1+n2+n3)/3);
        //sout+tab = 2 atalho para escrever System.out.println
        //psvm+tab = atalho para escrever public static void main
        //concatenação = juntar 2 variaveis string   
    }
    
}
