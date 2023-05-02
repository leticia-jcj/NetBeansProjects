package polimorfismosobrescrita2;
public class Empregado extends Pessoa {
    
    private int matricula;
    private double salario;
    private String Setor;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }
    
    // metodo calcularSalario()
    public double getcalcularSalario() {
        return (getSalario() - (getSalario() * 0.11));
    }

    @Override
    public String toString() {
        return "----- EMPREGADO -----" + "\n" +
               "NOME:             " + getNome() + "\n" +
               "iDADE:            " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:     R$ " +getContribuinte() + "\n" +
               "MATRICULA:        " + getMatricula() + "\n" +
               "SALÁRIO:          R$ " + getcalcularSalario()+ "\n" +
               "SETOR:            " + getSetor();
    }
    
    
    
}
