package estruturacondicional;
import java.util.Scanner;
public class SelecaoComposta {
     public static void main(String[] args) {
         double nota;
      Scanner scan = new Scanner(System.in); 
        System.out.print("ENTRE COM UMA NOTA: ");
        nota = scan.nextDouble();
        
        if (nota >= 0 && nota <= 10) {
           System.out.println("NOTA = " + nota + " -- VALOR VÁLIDO.");    
        } else {
           System.out.println("NOTA = " + nota + " -- VALOR INVÁLIDO.");
        
        }
     }
        
    
}
