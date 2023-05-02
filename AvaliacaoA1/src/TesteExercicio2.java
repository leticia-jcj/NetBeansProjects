public class TesteExercicio2 {
    public static void main(String[] args) {
        
       Funcionario f1 = new Funcionario();
       f1.setNome("Ana Maria");
       f1.setIdade(20);
       f1.setEndereco("QR 201 LOTE 4 APTO 102");
       f1.setSalarioBase(1000);
       f1.setImposto(5);
       
       Funcionario f2 = new Funcionario();
       f2.setNome("Lenna");
       f2.setIdade(30);
       f2.setEndereco("QR 101 LOTE 14 APTO 201");
       f2.setSalarioBase(2000);
       f2.setImposto(10);
       
       Aluno a1 = new Aluno();
       a1.setNome("Maria Clara");
       a1.setIdade(20);
       a1.setNota1(10);
       a1.setNota2(8);
       
       Aluno a2 = new Aluno();
       a2.setNome("Julia");
       a2.setIdade(17);
       a2.setNota1(8);
       a2.setNota2(8);
       
       System.out.println(f1);
       System.out.println(f2);
       System.out.println(a1);
       System.out.println(a2);
       
       System.out.println("O CHORO É LIVRE! RS");
       
    }
    
}
