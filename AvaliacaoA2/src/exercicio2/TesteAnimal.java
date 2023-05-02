package exercicio2;
public class TesteAnimal {
    public static void main(String[] args) {
      Peixe peixe = new Peixe();
      peixe.setNome("Nemo");
      peixe.setPeso(1);
      peixe.setTipoHabitat("Água Doce");
   
      Cachorro cachorro = new Cachorro();
      cachorro.setNome("Bob");
      cachorro.setPeso(3);
      cachorro.setRaca("vira-lata");
      cachorro.setTipoDeAlimentacao("ração");
      
        System.out.println(peixe);
        System.out.println(cachorro);
        System.out.println("Essa foi mamão com açúcar. Obrigada!");
    }
    
}
