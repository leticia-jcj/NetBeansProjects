package polimorfismosobrescrita2;
public class TestePessoa {
    public static void main(String[] args) {
       
      Empregado e = new Empregado(); //teste
      System.out.println(e.toString());
      System.out.println("");
      
      Fornecedor f = new Fornecedor();
      
      f.setNome("Ana");
      f.setContribuinte(100);
      f.setIdade(20);
      f.setReceita(1000);
      f.setDespesa(100);
      
      Cliente c = new Cliente();
      
      c.setNome("Edina");
      c.setContribuinte(100);
      c.setIdade(41);
      c.setEmail("edina@gmail.com");
      c.setTelefone("(99) 9999-9999");
      
      Administrador a = new Administrador();
      
      a.setNome("Luana");
      a.setContribuinte(100);
      a.setIdade(40);
      a.setMatricula(252588);
      a.setAjudaDeCusto(100);
      a.setSalario(1000);
      a.setSetor("ADM");
      
      Operario o = new Operario();
      
      o.setNome("Vanda");
      o.setContribuinte(100);
      o.setMatricula(25445);
      o.setIdade(25);
      o.setComissao(100);
      o.setValorProducao(10);
      o.setSetor("OPERACIONAL");
      o.setSalario(1000);
      
      Vendedor v = new Vendedor();
      
      v.setNome("Lucas");
      v.setMatricula(251447);
      v.setIdade(26);
      v.setContribuinte(100);
      v.setSalario(1000);
      v.setValorVendas(1000);
      v.setSetor("VENDAS");
      v.setComissao(100);
    
        System.out.println(f);
        System.out.println(c);
        System.out.println(a);
        System.out.println(o);
        System.out.println(v);
    }
    
}
