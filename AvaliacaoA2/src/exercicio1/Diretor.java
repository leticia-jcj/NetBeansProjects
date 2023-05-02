package exercicio1;
public class Diretor extends Funcionario {
    
    private int tempoMandato;
    private double gratificacao;

    public int getTempoMandato() {
        return tempoMandato;
    }

    public void setTempoMandato(int tempoMandato) {
        this.tempoMandato = tempoMandato;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    //polimorfismo sobrescrita. Classe reutiliza metodo da classe funcionario

    @Override
    public String toString() {
        return "----- DIRETOR -----" + "\n\n" +
               "NOME:               " + getNome() + "\n" + 
               "IDADE:              " + getIdade() + "\n" +
               "TEMPO DE MANDATO:   " + getTempoMandato() + " anos" + "\n" +
               //"GRATIFICAÇÃO:       R$ " + getGratificacao() +"\n" +
               "SALÁRIO LÍQUIDO:    R$ " + calcularSalarioLiquido() +"\n";
    }
    
}
