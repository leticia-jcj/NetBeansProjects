public class Aluno {
    
        private String nome;
        private int idade;
        private double nota1;
        private double nota2;
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getCalcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "------------- ALUNO -------------  " + "\n\n" +
               "NOME:     " + getNome() + "\n" +
               "IDADE:    " + getIdade() +" anos" + "\n" +
               "NOTA 1:   " + getNota1() + "\n" +
               "NOTA 2:   " + getNota2() + "\n" +
               "MÉDIA:    " + getCalcularMedia()+"\n";
    }
        
}
