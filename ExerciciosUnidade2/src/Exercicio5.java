//5 – Entre com 10 números e mostre o triplo de cada número.
//(faça usando repetição determinada – while)
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        
     int numero;
     int calc;
     int contador = 0;
     
     Scanner teclado = new Scanner(System.in);
     while (contador < 10)
     {
         System.out.print("INFORME UM NÚMERO: ");
                  
         numero = teclado.nextInt();
                       
         calc = numero*3;
         
         System.out.println("O TRIPLO DE " + numero + " É " + calc);
         contador++;
         System.out.println(" ");
     }
         System.out.println("OBRIGADA POR UTILIZAR O PROGRAMA.");
         System.out.println(" "); 
      
        
        
    }
    
}
