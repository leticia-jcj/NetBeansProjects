package exercicio1;
public class Peixe extends Animal {
    
    private String tipoHabitat;
    
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "----- PEIXE -----" + "\n\n" +
                "TIPO HABITAT: " + getTipoHabitat() + "\n" +
                "NOME:         " + getNome() + "\n" +
                "PESO:         " + getPeso() + " kg" + "\n";
        
    }
    
    
}
