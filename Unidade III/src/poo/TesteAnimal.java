package poo;
public class TesteAnimal {
    public static void main(String[] args) {
    
        Animal a1 = new Animal();
        a1.setNome("Bob");
        a1.setRaca("Vira-Lats");
        
        System.out.println("O nome do animal é " + a1.getNome() +
                            "\n" + "Da raça " + a1.getRaca());
        
    }
    
}
