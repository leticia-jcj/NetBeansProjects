
package estruturacondicional;
import java.util.Scanner;
public class SelecaoComposta2 {
    public static void main(String[] args) {
            double nota;
      Scanner scan = new Scanner(System.in); 
        System.out.print("ENTRE COM UMA NOTA: ");
        nota = scan.nextDouble();
        
        if (nota <= 3) {
           System.out.println("NOTA = " + nota + " -- ALUNO REPROVADO.");    
        } else if (nota < 5) {
           System.out.println("NOTA = " + nota + " -- ALUNO EM RECUPERAÇÃO.");
        } else if (nota <= 8) {
           System.out.println("NOTA = " + nota + " -- ALUNO APROVADO.");
        } else {
           System.out.println("APROVADO COM MÉRITOS!");
        } 
    }
}
    
    
