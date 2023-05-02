public class TesteExercicio1 {
    public static void main(String[] args) {
    
    Banco b1 = new Banco();
    
    b1.setCodigo(071);
    b1.setNome("BRB");
    b1.setPaisOrigem("Brasil");
    
    Agencia a1 = new Agencia();
    
    a1.setNumero(5874);
    a1.setNome("Agência 02");
    
    ContaCorrente c1 = new ContaCorrente();
    
    c1.setNumero(1254);
    c1.setTipo(01);
    c1.setSaldo(1000);
   
    Cliente cl1 = new Cliente();
    cl1.setNome("Víctor Belmont Villar");
    cl1.setIdentidade("32587757-8");
    cl1.setCpf("046.658.114-23");
    
    Cliente cl2 = new Cliente();
    cl2.setNome("Luanna D´Vila Roque");
    cl2.setIdentidade("475847578-7");
    cl2.setCpf("047.685.112-28");
    
    
    Endereco e1 = new Endereco();
    
    e1.setRua("Caminho das Árvores");
    e1.setNumero(120);
    e1.setTelefone("(99) 3344-5566");
    
        System.out.println(b1);  System.out.println(a1);
        System.out.println(c1);  System.out.println(cl1);
        System.out.println(cl2); System.out.println(e1);
    
    }
    
}
