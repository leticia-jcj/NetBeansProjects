package exercicio1;
public class Professor extends Funcionario {
    
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "------ PROFESSOR ------" + "\n\n" +
               "NOME:              " + getNome() + "\n" +
               "IDADE:             "+ getIdade() + "\n" +
               "DISCIPLINA:        " + getDisciplina()+ "\n" +
               "SALÁRIO LÍQUIDO:   R$ " + calcularSalarioLiquido() +"\n";
    }
    
}
