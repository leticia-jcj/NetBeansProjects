package heranca2;
public class Domestico extends Fogao {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "----- FOGÃO DOMÉSTICO -----" + "\n\n"+
                "MARCA:         " + getMarca() + "\n" +
                "PESO:          " + getPeso() + "kg" +"\n" +
                "QNT DE BOCAS:  " + getQntBocas() + "\n" +
                "TIPO:          " + getTipo() + "\n";
    }
    
    
}
