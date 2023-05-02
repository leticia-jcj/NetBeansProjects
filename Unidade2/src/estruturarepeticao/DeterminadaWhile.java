package estruturarepeticao;
import java.util.Scanner;
public class DeterminadaWhile {
    
    public static void main(String[] args) {
       
     double nota1;
     double nota2;
     double media;
     int contador = 1;
     
     Scanner scan = new Scanner(System.in);
     while (contador < 3)
     {
         System.out.println("DIGITE DUAS NOTAS:");
         System.out.print("INFORME A 1ª NOTA:");
         nota1 = scan.nextDouble();
         System.out.print("INFORME A 2ª NOTA:");
         nota2 = scan.nextDouble();
         
         media = (nota1 + nota2)/2;
         
         System.out.println("A MÉDIA DO ALUNO É: " + media);
         contador++;
         System.out.println(" ");
     }
         System.out.println("AGRADECEMOS POR UTILIZAR O PROGRAMA");
         System.out.println(" ");
        
    }
    
}
