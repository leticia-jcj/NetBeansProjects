package projetofinal;
public class TestePessoa {
    public static void main(String[] args) {
    
        Fornecedor f = new Fornecedor();
        
        f.setNome("JOÃO CARLOS");
        f.setEndereco("RUA ALAMEDA 07 ED. SERRA APTO 102");
        f.setTelefone("61 3333-3333");
        f.setValorCredito(1000);
        f.setValorDivida(300);
        System.out.println(f);
        
        Empregado e = new Empregado();
        
        e.setNome("ANA LIMA");
        e.setEndereco("EQNO 15 CONJ B ED. FLORES APTO 401");
        e.setTelefone("66 7896-5248");
        e.setCodigoSetor(12);
        e.setSalarioBase(1500);
        e.setImposto(5);
        System.out.println(e);
        
        Administrador a = new Administrador();
        
        a.setEndereco("RUA GARCIA Nº 111 CASA 2");
        a.setNome("MARGARETTE OLIVER");
        a.setTelefone("68 2225-7874");
        a.setCodigoSetor(21);
        a.setSalarioBase(1500);
        a.setImposto(5);
        a.setAjudaDeCusto(500);
        System.out.println(a);
        
        Operario o = new Operario();
        
        o.setEndereco("RUA SÃO MIGUEL CASA 21");
        o.setNome("MARIA DAS DORES");
        o.setTelefone("32 6658-9954");
        o.setCodigoSetor(25);
        o.setSalarioBase(1500);
        o.setImposto(5);
        o.setValorProducao(100);
        System.out.println(o);
        
        Vendedor v = new Vendedor();
        
        v.setEndereco("EQNA 21 LOTE 55 CASA 08");
        v.setNome("LORENA ALVES");
        v.setTelefone("99 5248-4158");
        v.setCodigoSetor(55);
        v.setSalarioBase(1500);
        v.setImposto(5);
        v.setValorVendas(7000);
        System.out.println(v);
    }
    
}
