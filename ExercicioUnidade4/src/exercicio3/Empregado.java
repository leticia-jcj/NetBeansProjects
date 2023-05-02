package exercicio3;
public class Empregado extends Pessoa {
    
   private int codigoSetor;
   private double salarioBase; //(vencimento base)
   private double imposto; //(porcentagem retida dos impostos)

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
   
  // metodo calcularSalario()
    
    public double getcalcularSalario() {
        return (getSalarioBase() - (getSalarioBase() * getImposto()/100));
    }

    @Override
    public String toString() {
        return "------------ EMPREGADO ------------" + "\n\n" +
               "ENDEREÇO:           " + getEndereco() + "\n" +
               "NOME:               " + getNome() +"\n" +
               "TELEFONE:           " + getTelefone() +"\n\n" +
               "CÓGIDO DO SETOR:    " + getCodigoSetor() +"\n" +
               "SALÁRIO BASE:       R$ " + getSalarioBase() +"\n" +
               "SÁLÁRIO COM DESC.:  R$ " + getcalcularSalario() +"\n" +
               "IMPOSTO:            " + getImposto() +"%" + "\n\n";
    }
    
    
}
