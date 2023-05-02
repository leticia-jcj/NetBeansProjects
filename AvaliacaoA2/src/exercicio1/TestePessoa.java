package exercicio1;
public class TestePessoa {
    public static void main(String[] args) {
        
      Aluno a = new Aluno();
      a.setNome("Ana");
      a.setIdade(25);
      a.setEndereco("Rua 2 Apto 112");
      a.setNota1(7.8);
      a.setNota2(7.7);
      
      Professor p = new Professor();
      p.setNome("Edu");
      p.setIdade(45);
      p.setDisciplina("Matemática");
      p.setEndereco("Rua 4 Apto 114");
      p.setImposto(6);
      p.setSalarioBase(2000);
      
      Coordenador c = new Coordenador();
      c.setNome("Roger");
      c.setIdade(47);
      c.setEndereco("Rua 25 Apto 101");
      c.setNomeCoordenacao("Tranporte Escolar");
      c.setImposto(4);
      c.setSalarioBase(1000);
      
      Diretor d = new Diretor();
      d.setNome("Lucas");
      d.setIdade(47);
      d.setEndereco("Rua 4 Apto 115");
      d.setTempoMandato(4);
      d.setImposto(7);
      d.setSalarioBase(1200);
      d.setGratificacao(200);
      
        System.out.println(a);
        System.out.println(p);
        System.out.println(c);
        System.out.println(d);
        //System.out.println("Polimorfismo Sobrescrita. Classe reutiliza metodo da classe Funcionario");
           
               
    }
    
}
