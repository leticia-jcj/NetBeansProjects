//10 – valor carro novo = preço de fábrica + percentual lucro distribuidor
//+ percentual impostos aplicados ao preço de fábrica.

//Entrada de dados:
//preço de fábricao
//percentual de lucro dos distribuidores
//percentual dos impostos

//Saida dados:
//valor do lucro do distribuidor
//valor correspondente aos impostos
//preço de venda do veículo.

import java.util.Scanner;
public class Exercico10 {
    public static void main(String[] args) {
        
      double precoNovo; double precoFabrica;
      double lucroDistribuidor; double impostos;
      double calc1; double calc2; double calc3;
      
      Scanner scan = new Scanner(System.in);
        
      System.out.print("INFORME O PREÇO DE FÁBRICA: ");
      precoFabrica = scan.nextDouble();
    
      System.out.print("INFORME O PERCENTUAL DE LUCRO DO DISTRIBUIDOR: ");
      lucroDistribuidor  = scan.nextDouble();
      
      System.out.print("INFORME O PERCENTUAL DOS IMPOSTOS: ");
      impostos  = scan.nextDouble();  
    
    calc1 = precoFabrica * impostos/100; //extrair imposto do preço de fábtica
    calc2 = precoFabrica* lucroDistribuidor/100; //percentual lucro distribuidor 
    precoNovo = precoFabrica + calc1 + calc2; //preco final carro
    calc3 =  precoNovo - calc1; //lucro do distribuidor
    //ctrl+espaço
    
   
    System.out.println("__________________________");    
    System.out.printf("O VALOR CORRESPONDENTE AOS IMPOSTOS É: R$ %.2f\n", calc1);
    System.out.printf("O VALOR DO LUCRO DO DITRIBUIDOR É: R$ %.2f\n", calc3);
    System.out.printf("O PREÇO DE VENDA DO VEÍCULO É: R$ %.2f\n", precoNovo);
    System.out.println("__________________________");
     System.out.println("Não compre carro. Vá de 99!");
       
    }
    
}
