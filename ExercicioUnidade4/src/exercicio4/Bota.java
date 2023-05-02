package exercicio4;
public class Bota extends Calcado {
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
          return "---------- BOTA ----------" + "\n\n" +
                 "MARCA:        " + getMarca() + "\n" +
                 "NUMERAÇÃO:    " + getNumeracao() + "\n" +
                 "COR:          " + getCor() + "\n" +
                 "FABRICANTE:   " + getFabricante() + "\n" +          
                 "MODELO:       " + getModelo() + "\n" +
                 "PREÇO:        R$ " + getPreco() + "\n";
    }
    
    
}
