//1 – Faça um programa que receba dois números
//    e mostre o maior. (condicional - if)
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
       
        int n1;
        int n2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ENTRE COM O 1º NÚMERO: ");
        n1 = scan.nextInt();
        
        System.out.print("ENTRE COM O 2º NÚMERO: ");
        n2 = scan.nextInt();
        
        if (n1 > n2){
            System.out.println("----------------------------"); 
            System.out.println("O NÚMERO " + n1 + " É MAIOR QUE " + n2);
        }
        if (n2 > n1){    
            System.out.println("----------------------------");
            System.out.println("O NÚMERO " + n2 + " É MAIOR QUE " + n1);  
        } 
        if (n2 == n1){    
            System.out.println("----------------------------");
            System.out.println("O NÚMERO " + n2 + " É IGUAL AO NÚMERO " + n1);  
        }            
    }
    
}
