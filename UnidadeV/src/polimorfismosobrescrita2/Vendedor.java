package polimorfismosobrescrita2;
public class Vendedor extends Empregado {
    
    private double comissao;
    private double valorVendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    
    // metodo calcularSalario()
    public double getcalcularSalario() {
        return (super.getcalcularSalario()+ (getComissao() * getValorVendas()));
    }

    @Override
    public String toString() {
        return "------ VENDEDOR ------" + "\n" +
               "NOME:            " + getNome() + "\n" +
               "iDADE:           " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:    R$ " + getContribuinte() + "\n" +
               "COMISSÃO:        R$ " + getComissao() + "\n" +
               "VALOR VENDAS:    R$ " + getValorVendas() + "\n" +
               "SALÁRIO:         R$ " + getcalcularSalario() + "\n" +
               "MATRICULA:       " + getMatricula() + "\n" +
               "SETOR:           " + getSetor() + "\n";
    }
    
}
