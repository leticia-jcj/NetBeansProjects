package unidade1;
//nome do pacote/PASTA
import java.util.Scanner;
//importação da classe scanner para entrada de dados
public class Exemplo01 {
//nome da classe/programa

    public static void main(String[] args) {
//método MAIN responsável pela execução do programa
//declaração de variáveis
    System.out.println("ENTRE COM 3 NÚMEROS:");
     int num1;
     int num2;
     double num3;
//entrada de dados
    Scanner scan = new Scanner(System.in);
//uso da classe scanner para abilitar
//a entrada de dados através da variável SCAN

//abaixo conversão de tipos de dados
//variável SCAN RECEBE OS DADOS VIA TECLADO UMA POR VEZ
// e faz a conversão
     num1 = scan.nextInt();
     num2 = scan.nextInt();
     num3 = scan.nextDouble();
     System.out.println("RESULTADO:");
     //saída de dados
     System.out.println(num1+num2+num3);
     //sout+tab = atalho para escrever System.out.println
     //psvm+tab = atalho para escrever public static void main
           
    }
    
}
