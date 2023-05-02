package exercicio2;
public class Vendedor extends Empregado {
    
    private double valorVendas;
    private int quantidadeVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public String toString() {
        return "---------- VENDEDOR ----------" + "\n\n" +
               "NOME:               " + getNome() + "\n" +
               "SALÁRIO:            R$ " + getSalario() + "\n" +
               "VALOR DAS VENDAS:   R$ " + getValorVendas() + "\n" +
               "QNT DE VENDAS:         " + getQuantidadeVendas() + "\n";
    }

    
}
