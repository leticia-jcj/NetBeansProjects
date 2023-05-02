package polimorfismosobrescrita2;
public class Cliente extends Pessoa {
    
    private String email;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "------- CLIENTE -------" + "\n" +
               "NOME:             " + getNome() + "\n" +
               "iDADE:            " + getIdade() + " anos" + "\n" +
               "CONTRIBUINTE:     R$ " +getContribuinte() + "\n" +
               "EMAIL:            " + getEmail() + "\n" +
               "TELEFONE:         " + getTelefone() + "\n";
               
    }
    
    
}
