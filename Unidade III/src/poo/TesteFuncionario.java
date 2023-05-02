package poo;
public class TesteFuncionario {
     public static void main(String[] args) {
      //f1 - (nome qualquer) é uma variável de referencia do tipo Funcionário
      //new - criado novo objeto (criado na jvm na área de mémoria chamada heap)
      //Funcionario() - metodo construtor especial
      
      Funcionario f1 = new Funcionario();
      
      f1.setNome("Letícia");
      f1.setCargo("Dev. Full Stack");
      f1.setSalario(8000);
      
    //  System.out.println("----------------------------------- ");
    //  System.out.println("Nome:         --  " + f1.getNome());
    //  System.out.println("Cargo:        --  " + f1.getCargo());
    //  System.out.println("Salário:      --  R$ " + f1.getSalario());
    //  System.out.println("Comissão:     --  R$ " + f1.getComissao());
    //  System.out.println("Novo Salário  --  R$ " + (f1.getSalario() + f1.getComissao()));
    //  System.out.println("----------------------------------- ");
        
        //System.out.println(f1.toString()); 
        System.out.println(f1);
    }
    
}
