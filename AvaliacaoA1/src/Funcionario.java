public class Funcionario {
    
        private String nome;
        private String endereco;
        private int idade;
        private double salarioBase;
        private double imposto;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
    
    public double getCalcularSalario() {
        return getSalarioBase()- (getSalarioBase() * getImposto()/100); 
     //   return salarioBase – (salarioBase * imposto / 100);
    }
    
    @Override
    public String toString() {
        return "---------- FUNCIONÁRIO ---------- " + "\n\n" +
               "NOME:             " + getNome() + "\n" +
               "IDADE:            " + getIdade() +" anos" + "\n" +
               "ENDEREÇO:         " + getEndereco() + "\n" +
               "SALÁRIO BASE      R$: " + getSalarioBase() + "\n" +
               "IMPOSTO:          " + getImposto() + " %" +"\n" +
               "NOVO SALÁRIO:     R$: " + getCalcularSalario()+"\n";
    }
        
        
    
}
