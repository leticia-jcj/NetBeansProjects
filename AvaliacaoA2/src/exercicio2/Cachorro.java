package exercicio2;
public class Cachorro extends Animal {
    private String raca;
    private String tipoDeAlimentacao;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    @Override
    public String toString() {
        return "===== CACHORRO =====" + "\n\n" +
               "NOME:             " + getNome() + "\n" +
               "PESO:             " + getPeso() + "Kg" + "\n" +
               "RAÇA:             " + getRaca() + "\n" +
               "TIPO DE ALIMENTO: " + getTipoDeAlimentacao() + "\n";
    }
    
}
