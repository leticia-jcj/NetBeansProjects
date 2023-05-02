package polimorfismosobrescrita2;
public class Operario extends Empregado {
   
    private double comissao;
    private double valorProducao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    
    // metodo calcularSalario()
    public double getcalcularSalario() {
        return (super.getcalcularSalario() + (getComissao() * getValorProducao()));
    }

    @Override
    public String toString() {
        return "------ OPERÁRIO ------" + "\n" +
               "NOME:            " + getNome() + "\n" +
               "iDADE:           " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:    R$ " +getContribuinte() + "\n" +
               "COMISSÃO:        R$ " + getComissao() + "\n" +
               "VALOR PRODUÇÃO:  R$ " + getValorProducao() + "\n" +
               "SALÁRIO:         R$ " + getcalcularSalario() + "\n" +
               "MATRICULA:       " + getMatricula() + "\n" +
               "SETOR:           " + getSetor()+ "\n";
    }
    
    
    
}
