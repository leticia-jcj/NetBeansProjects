//digite duas notas e veja a media de cada aluno, em um total de 5 alunos
package estruturarepeticao;
import java.util.Scanner;
public class DeterminadaFor {
  public static void main(String[] args) {
      
     double nota1;
     double nota2;
     double media;
     int contador;
     
     Scanner scan = new Scanner(System.in);
     for (contador = 0; contador <= 5; contador++)
     {
         System.out.println("DIGITE DUAS NOTAS:");
         System.out.print("INFORME A 1ª NOTA:");
         nota1 = scan.nextDouble();
         System.out.print("INFORME A 2ª NOTA:");
         nota2 = scan.nextDouble();
         
         media = (nota1 + nota2)/2;
         
         System.out.println("A MÉDIA DO ALUNO É: " + media);
         System.out.println(" ");
     }
         System.out.println("AGRADECEMOS POR UTILIZAR O PROGRAMA");
         System.out.println(" ");
     
    }
    
}
