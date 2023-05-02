package projetofinal;
public class Vendedor extends Empregado {
    
    private double valorVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public String toString() {
        return "---------- VENDEDOR ----------" + "\n\n" +
               "ENDEREÇO:            " + getEndereco() + "\n"+
               "NOME:                " + getNome() + "\n"+
               "TELEFONE:            " + getTelefone() + "\n\n"+
               "CÓDIGO DO SETOR:     " + getCodigoSetor() + "\n"+
               "SALÁRIO BASE         R$ " + getSalarioBase() + "\n"+
               "IMPOSTO:             " + getImposto() + "%"+ "\n\n"+
               "SALÁRIO COM DESC.    R$ " + getcalcularSalario() + "\n" +
               "VALOR VENDAS:        R$ " + getValorVendas() + "\n" +
               "COMISSÃO:            R$ " + (getValorVendas() * 5/100) + "\n" +
               "SALÁRIO + COMISSÃO:  R$ " + ((getValorVendas() * 5/100) + getcalcularSalario()) + "\n";
                
               
    }
    
    
}
