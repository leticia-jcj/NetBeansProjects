package exercicio2;
public class TestePessoa {
    public static void main(String[] args) {
      
        Gerente g1 = new Gerente();
        g1.setNome("MARIA");
        g1.setIdade(29);
        g1.setMatricula("75894");
        g1.setNomeGerencia("ADMINISTRATIVO");
        g1.setSalario(1000);
        
        Vendedor v1 = new Vendedor();
        v1.setNome("LUCAS");
        v1.setSalario(1500);
        v1.setValorVendas(10);
        v1.setQuantidadeVendas(2);
        
        Cliente c1 = new Cliente();
        c1.setNome("GILBERTO");
        c1.setIdade(29);
        c1.setSexo("MASCULINO");
        c1.setValorDivida(2000);
        c1.setAnoNascimento(1992);
        
        System.out.println(g1);
        System.out.println(v1);
        System.out.println(c1);
        
    }
    
}
