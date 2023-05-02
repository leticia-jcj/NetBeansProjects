public class Empregado2 {
    
   private String nome;
   private String matricula;
   private int idade;
   private double salario; 
   
      
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAumento(){
        
    }
 
  
       @Override
    public String toString() {
        return "EMPREGADO 2" + "\n" + 
               "NOME:       " + getNome() + "\n" +
               "MATRÍCULA:  " + getMatricula() + "\n" +
               "IDADE:      " + getIdade() + "\n"+
               "SALÁRIO:    R$ " + getSalario(); //+ "\n" +
            //  "AUMENTO:    R$ " + getAumento();
    }
    
    
    
}
