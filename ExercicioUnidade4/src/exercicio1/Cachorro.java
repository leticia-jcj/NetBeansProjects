package exercicio1;
public class Cachorro extends Animal {
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "----- CACHORRO -----" + "\n\n" +
                "RAÇA:   " + getRaca() + "\n" +
                "NOME:   " + getNome() + "\n" +
                "PESO:   " + getPeso() + " kg" + "\n";
                
    }
    
    
}
