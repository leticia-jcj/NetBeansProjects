public class Cliente {
  
    private String nome;
    private String identidade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "CLIENTE     " + "\n" +
               "Nome:       " + getNome() + "\n" +
               "Identidade: " + getIdentidade() + "\n" +
               "CPF:        " + getCpf() + "\n";
    }
 
    
}
