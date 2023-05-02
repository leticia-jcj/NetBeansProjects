import java.util.Scanner;
public class FuncionarioMXX {
    public static void main(String[] args) {
       
        String nome;
        int matricula;
        double salarioBruto;
        double salarioLiquido;
        double calc;
        int opcao;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("           BEM-VINDO À MXX SOFTWARE ");
        System.out.println("--------------------------------------------");
        System.out.println("");
        
        System.out.println("ENTRE COM OS DADOS DO FUNCIONÁRIO: "); 
        System.out.println("");
        
        System.out.print("NOME:                "); 
        nome = teclado.next();
        
        System.out.print("MATRÍCULA:           "); 
        matricula = teclado.nextInt();
        
        System.out.print("SALÁRIO BRUTO:    R$ ");
        salarioBruto = teclado.nextDouble();
        System.out.println("");
        
        System.out.print("----------------- ESCOLHA A OPÇÃO -----------------");
        System.out.println("");
             
        System.out.println(" ");
        System.out.println(" 1 - SALÁRIO DE        R$     0,00 ATÉ R$ 1.200,00");
        System.out.println(" 2 - SALÁRIO DE        R$ 1.201,00 ATÉ R$ 2.000,00");
        System.out.println(" 3 - SALÁRIO DE        R$ 2.001,00 ATÉ R$ 4.000,00");
        System.out.println(" 4 - SALÁRIO ACIMA DE  R$ 4.000                   ");
        System.out.println(" ");
                  
        opcao = teclado.nextInt();
        
        switch (opcao) {
            case 1: System.out.println("1 - SALÁRIO COM DESCONTO DE 8% DO INSS: R$ "
                                        + (salarioBruto - (salarioBruto*0.08)));
                    System.out.println("");
                    System.out.println("NOME DO FUNCIONÁRIO:    "+nome);
                    System.out.println("MATRÍCULA:              "+matricula);
                    System.out.println("SALÁRIO BRUTO:          R$ "+salarioBruto);
                    System.out.println("SALÁRIO LÍQUIDO:        R$ "+(salarioBruto - (salarioBruto*0.08)));
                    System.out.println("VALOR DO DESCONTO INSS: R$ "+(salarioBruto - (salarioBruto - (salarioBruto*0.08))));
                    System.out.println("");break;
                      
            case 2: System.out.println("2 - SALÁRIO COM DESCONTO DE 9% DO INSS: R$ "
                                        + (salarioBruto - (salarioBruto*0.09)));
                    System.out.println("");
                    System.out.println("NOME DO FUNCIONÁRIO:    "+nome);
                    System.out.println("MATRÍCULA:              "+matricula);
                    System.out.println("SALÁRIO BRUTO:          R$ "+salarioBruto);
                    System.out.println("SALÁRIO LÍQUIDO:        R$ "+(salarioBruto - (salarioBruto*0.09)));
                    System.out.println("VALOR DO DESCONTO INSS: R$ "+(salarioBruto - (salarioBruto - (salarioBruto*0.09)))); 
                    System.out.println("");break;
                    
            case 3: System.out.println("3 - SALÁRIO COM DESCONTO DE 11% DO INSS: R$ "
                                        + (salarioBruto - (salarioBruto*0.11)));
                    System.out.println("");
                    System.out.println("NOME DO FUNCIONÁRIO:    "+nome);
                    System.out.println("MATRÍCULA:              "+matricula);
                    System.out.println("SALÁRIO BRUTO:          R$ "+salarioBruto);
                    System.out.println("SALÁRIO LÍQUIDO:        R$ "+(salarioBruto - (salarioBruto*0.11)));
                    System.out.println("VALOR DO DESCONTO INSS: R$ "+(salarioBruto - (salarioBruto - (salarioBruto*0.11))));
                    System.out.println("");break; 
                    
            case 4: System.out.println("4 - SALÁRIO COM DESCONTO DE R$ 457,80:   R$ "
                                        + (salarioBruto - 457.80));
                    System.out.println("");
                    System.out.println("NOME DO FUNCIONÁRIO:    "+nome);
                    System.out.println("MATRÍCULA:              "+matricula);
                    System.out.println("SALÁRIO BRUTO:          R$ "+salarioBruto);
                    System.out.println("SALÁRIO LÍQUIDO:        R$ "+(salarioBruto - 457.80));
                    System.out.println("VALOR DO DESCONTO INSS: R$ "+ 457.80); 
                    System.out.println("");break;
                    
            default:
                    System.out.println("Opção Inválida!");
        
    }
    
}
}
