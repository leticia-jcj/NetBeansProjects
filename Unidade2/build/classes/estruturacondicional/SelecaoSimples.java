//entre com um numero e mostre uma msg se maior q 0
package estruturacondicional;
import java.util.Scanner;
public class SelecaoSimples {
    public static void main(String[] args) {
        
      int  valor;
      Scanner scan = new Scanner(System.in); 
        System.out.print("ENTRE COM UM NÚMERO: ");
        valor = scan.nextInt();
        if (valor > 0)
        System.out.println("O NÚMERO "+ valor +" É MAIOR QUE 0.");
        System.out.println("______________________________________");
        
    }
    
}
