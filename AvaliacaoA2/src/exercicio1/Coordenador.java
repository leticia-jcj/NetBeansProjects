package exercicio1;
public class Coordenador extends Funcionario {
    private String nomeCoordenacao;

    public String getNomeCoordenacao() {
        return nomeCoordenacao;
    }

    public void setNomeCoordenacao(String nomeCoordenacao) {
        this.nomeCoordenacao = nomeCoordenacao;
    }

    @Override
    public String toString() {
        return "----- COORDENADOR -----" + "\n\n" +
               "NOME:              " + getNome() + "\n" + 
               "IDADE:             " + getIdade() + "\n" +
               "NOME COORDENAÇÃO:  " + getNomeCoordenacao() + "\n" +
               "SALÁRIO LÍQUIDO:   R$ " + calcularSalarioLiquido() +"\n";
    }
    
    
}
