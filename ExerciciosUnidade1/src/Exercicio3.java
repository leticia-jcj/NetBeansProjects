//3 - Faça um programa que receba 3 notas e os seus respectivos pesos,
//calcule e mostre a média ponderada.
import java.util.Scanner;
public class Exercicio3 {
    
    public static void main(String[] args) {
        
    double n1; double n2; double n3;
    int peso1; int peso2; int peso3;
    double media;
    
    System.out.println("DIGITE A 1ª NOTA:");
     Scanner scan = new Scanner(System.in);
        n1 = scan.nextDouble();
    System.out.println("DIGITE O PESO DA 1ª NOTA:");       
      
        peso1 = scan.nextInt();
        
    System.out.println("DIGITE A 2ª NOTA:");    
        n2 = scan.nextDouble();
    System.out.println("DIGITE O PESO DA 2ª NOTA:");
        peso2 = scan.nextInt();
        
    System.out.println("DIGITE A 3ª NOTA:");    
        n3 = scan.nextDouble();
     System.out.println("DIGITE O PESO DA 3ª NOTA:");    
        peso3 = scan.nextInt();
        
        System.out.println("______________________________________");
         media = (n1*peso1 + n2*peso2 + n3*peso3) / (peso1+peso2+peso3);
        System.out.println("A MÉDIA PONDERADA DAS NOTAS INFORMADAS É:" + media);
        //saída de dados
           
        //sout+tab = 2 atalho para escrever System.out.println
        //psvm+tab = atalho para escrever public static void main
        //concatenação = juntar 2 variaveis string  
    }
    
}
