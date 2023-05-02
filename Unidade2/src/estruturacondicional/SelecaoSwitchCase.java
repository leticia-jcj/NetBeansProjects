
package estruturacondicional;
import java.util.Scanner;
public class SelecaoSwitchCase { //Switch Case = multipla escolha 
    public static void main(String[] args) {
        
        int opcao;
        Scanner scan = new Scanner(System.in);
        System.out.println("ESCOLHA APENAS UMA OPÇÃO DE CURSO.");
        System.out.println(" ");
        System.out.println("DIGITE 1 -------- JAVA");
        System.out.println("DIGITE 2 -------- PHP");
        System.out.println("DIGITE 3 -------- PASCAL");
                
        opcao = scan.nextInt();
        switch (opcao) {
            case 1: System.out.println("MATRICULA EM JAVA"); break;
            case 2: System.out.println("MATRICULA EM PHP"); break;
            case 3: System.out.println("MATRICULA EM PASCAL"); break;
            default:System.out.println("MATRICULA NÃO REALIZADA.");
                    
        }
    }
    
}
