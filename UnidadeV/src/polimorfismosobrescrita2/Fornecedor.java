package polimorfismosobrescrita2;
public class Fornecedor extends Pessoa {
  
    private double receita;
    private double despesa;

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }
    
    
    
    public double obterSaldo() {
        return getReceita() - getDespesa();
    }

    @Override
    public String toString() {
        return "------ FORNECEDOR ------" + "\n" +
               "NOME:             " + getNome() + "\n" +
               "iDADE:            " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:     R$ " +getContribuinte() + "\n" +
               "RECEITA:          R$ " + getReceita() + "\n" +
               "DESPESA:          R$ " + getDespesa() + "\n" +
               "SALÁRIO:          R$ " + obterSaldo() + "\n";
        
    }
    
    
}
