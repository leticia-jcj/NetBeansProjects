public class Banco {
    
    private int codigo;
    private String nome;
    private String paisOrigem;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {  
        return "BANCO             " + "\n" +
               "Codigo:           " + getCodigo() + "\n" +
               "Nome:             " + getNome() + "\n" +
               "Pais de Origem:   " + getPaisOrigem() + "\n";
    }
    
    
}
