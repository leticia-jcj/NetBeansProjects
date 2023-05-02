package exercicio2;
public class Cliente extends Pessoa {
    
    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "---------- CLIENTE ----------" + "\n\n" +
               "NOME:                " + getNome() + "\n" +
               "IDADE:               " + getIdade() + "\n" +
               "SEXO:                " + getSexo() + "\n" +
               "VALOR DA DIVIDA:     R$ " + getValorDivida() + "\n" +
               "ANO DE NASCIMENTO:   " + getAnoNascimento() + "\n";
    }
       
}
