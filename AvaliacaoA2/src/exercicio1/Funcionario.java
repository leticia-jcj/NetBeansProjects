package exercicio1;
public class Funcionario extends Pessoa {
  private double salarioBase;
  private double imposto;
  
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
        if (imposto >= 5 && imposto <= 15){
            this.imposto = imposto;
        }
        else {
            this.imposto = 5;
        }
    }
    
    public double calcularSalarioLiquido() {
        return (getSalarioBase() - (getSalarioBase() * getImposto()/100));
    }
    
    
}
