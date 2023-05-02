package projetofinal;
public class Operario extends Empregado {
    
    //corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário
    private double valorProducao; 
    //corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "------------ OPERÁRIO ------------" + "\n\n"+
               "ENDEREÇO:            " + getEndereco() + "\n"+
               "NOME:                " + getNome() + "\n"+
               "TELEFONE:            " + getTelefone() + "\n\n"+
               "CÓDIGO DO SETOR:     " + getCodigoSetor() + "\n"+
               "SALÁRIO BASE         R$ " + getSalarioBase() + "\n"+
               "IMPOSTO:             " + getImposto() + "%"+ "\n\n"+
               "SALÁRIO COM DESC.    R$ " + getcalcularSalario() + "\n" +
               "VALOR PRODUÇÃO:      R$ " + getValorProducao() + "\n"+
               "COMISSÃO:            R$ " + (getValorProducao() * 5/100) + "\n" +
               "SALÁRIO + COMISSÃO:  R$ " + ((getValorProducao() * 5/100) + getcalcularSalario()) + "\n";
    }
    
    
}
