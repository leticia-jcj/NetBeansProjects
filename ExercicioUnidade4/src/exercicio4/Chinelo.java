package exercicio4;
public class Chinelo extends Calcado {
    
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "---------- CHINELO ----------" + "\n\n" +
                 "MARCA:        " + getMarca() + "\n" +
                 "NUMERAÇÃO:    " + getNumeracao() + "\n" +
                 "COR:          " + getCor() + "\n" +
                 "FABRICANTE:   " + getFabricante() + "\n" +          
                 "MATERIAL:     " + getMaterial() + "\n" +
                 "PREÇO:        R$ " + getPreco() + "\n";
               
    }
    
}
