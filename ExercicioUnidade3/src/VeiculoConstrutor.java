public class VeiculoConstrutor {
    
    private String proprietario;
    private int ano;

    public VeiculoConstrutor(String proprietario, int ano) {
        this.proprietario = proprietario;
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
