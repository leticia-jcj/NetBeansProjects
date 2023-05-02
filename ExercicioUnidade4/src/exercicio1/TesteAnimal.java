package exercicio1;
public class TesteAnimal {
     public static void main(String[] args) {
        
         Cachorro dog = new Cachorro();
         dog.setNome("Bob");
         dog.setPeso(3.500);
         dog.setRaca("Vira-Lata");
         
         Cachorro dog2 = new Cachorro();
         dog2.setNome("Nico");
         dog2.setPeso(5.500);
         dog2.setRaca("Poodle");
                  
         Peixe fish = new Peixe();
         fish.setNome("Corvina");
         fish.setPeso(3.700);
         fish.setTipoHabitat("Água Doce");
        
         Peixe fish2 = new Peixe();
         fish2.setNome("Neon Cardinal");
         fish2.setPeso(0.25);
         fish2.setTipoHabitat("Água Doce");
         
         System.out.println(dog);
         System.out.println(dog2);
         System.out.println(fish);
         System.out.println(fish2);
    }
    
}
