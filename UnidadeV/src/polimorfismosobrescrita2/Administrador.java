package polimorfismosobrescrita2;
public class Administrador extends Empregado {
  
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double getcalcularSalario() {
       return super.getcalcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "------ ADMINISTRADOR -------" +"\n" +
               "NOME:             " + getNome() + "\n" +
               "iDADE:            " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:     R$ " +getContribuinte() + "\n" +
               "AJUDA DE CUSTO:   R$ " + getAjudaDeCusto() + "\n" +
               "SALÁRIO:          R$ " + getcalcularSalario()+ "\n" +
               "MATRICULA:        " + getMatricula() + "\n" +
               "SALÁRIO:          R$ " + getcalcularSalario()+ "\n" +
               "SETOR:            " + getSetor()+ "\n";
    }
    
    
}
