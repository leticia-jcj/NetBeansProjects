package exercicio2;
public class Gerente extends Empregado {
    
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "---------- GERENTE ----------" + "\n\n" +
              "NOME:          " + getNome() + "\n" +
              "IDADE:         " + getIdade() + " ANOS" + "\n" +
              "MATRICULA:     " + getMatricula() + "\n" +
              "NOME GERÊNCIA: " + getNomeGerencia() + "\n" +
              "VALOR INSS:    R$ " + getValorInss() + "\n";
    }
    
    
}
