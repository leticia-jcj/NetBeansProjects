package exercicio4;
public class TesteCalcado {
    public static void main(String[] args) {
      
      Tenis t1 = new Tenis();
      t1.setMarca("ADIDAS");
      t1.setNumeracao(42);
      t1.setCor("BRANCO");
      t1.setFabricante("MM PAULISTA");
      t1.setTipo("ESPORTE");
      t1.setPreco(2300);
  
      System.out.println(t1);
      
      Tenis t2 = new Tenis();
      t2.setMarca("NIKE");
      t2.setNumeracao(44);
      t2.setCor("ROXO");
      t2.setFabricante("JB ATACADO");
      t2.setTipo("ESPORTE");
      t2.setPreco(2100);
  
      System.out.println(t2);
      
      Bota b1 = new Bota();
      b1.setMarca("ARTIC");
      b1.setNumeracao(36);
      b1.setCor("PRETO");
      b1.setFabricante("LS ATACADO");
      b1.setModelo("CANO CURTO");
      b1.setPreco(1400);
  
      System.out.println(b1);
      
      Bota b2 = new Bota();
      b2.setMarca("ZAPATTO");
      b2.setNumeracao(38);
      b2.setCor("MARROM");
      b2.setFabricante("LS ATACADO");
      b2.setModelo("SALTO FINO");
      b2.setPreco(800);
  
      System.out.println(b2);
      
      Chinelo c1 = new Chinelo();
      c1.setMarca("HAVAIANA");
      c1.setNumeracao(35);
      c1.setCor("ROSA");
      c1.setFabricante("BSB PASSOS");
      c1.setMaterial("EMBORRACHADO");
      c1.setPreco(35);
  
      System.out.println(c1);
      
      Chinelo c2 = new Chinelo();
      c2.setMarca("IPANEMA");
      c2.setNumeracao(42);
      c2.setCor("AZUL");
      c2.setFabricante("CIA CALÇADOS");
      c2.setMaterial("EMBORRACHADO");
      c2.setPreco(40);
  
      System.out.println(c2);
      
      
    }
    
}
