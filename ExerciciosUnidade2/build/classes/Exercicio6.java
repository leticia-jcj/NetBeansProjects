//6 – Faça um programa que receba 12 números inteiros,
//calcule e mostre a soma desses números.
//(faça usando repetição determinada – for)
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        
     int numero;
     int calc = 0;
   
     Scanner teclado = new Scanner(System.in);
     for (int contador = 1; contador <=12 ; contador++)
     {
         System.out.print("INFORME UM NÚMERO: ");
         numero = teclado.nextInt();
                       
         calc = calc+numero;
         
         System.out.println("A SOMA DOS NÚMEROS É " + calc);
         
         System.out.println(" ");
     }
         System.out.println("OBRIGADA POR UTILIZAR O PROGRAMA.");
         System.out.println(" "); 
        
        
    }
    
}
