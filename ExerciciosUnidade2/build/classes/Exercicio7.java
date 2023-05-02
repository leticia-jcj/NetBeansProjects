//7 – Faça um programa que receba 13 notas, calcule e mostre a
//média aritmética entre elas. (faça usando repetição determinada – while)
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
      
     double nota = 0;
     double media = 1;
     int contador = 1;
     
     Scanner teclado = new Scanner(System.in);
     System.out.println("SIGA AS INSTRUÇÕES PARA CALCULAR A MÉDIA ");
     System.out.println(" ");
        while (contador <= 13){
        media = (nota*contador)/13;
            
        System.out.print("ENTRE COM A " + contador +"ª NOTA: ");
        nota = teclado.nextDouble();
        contador++;
         
     }
        System.out.println(" ");
     System.out.println("A MÉDIA DAS 13 NOTAS É: " + media);
    }
    
}
