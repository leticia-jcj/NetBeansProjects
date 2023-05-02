package exercicio4;
public class Tenis extends Calcado{
    
    private String tipo; //casual, esporte
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getDesconto() {
        return (getPreco() - (getPreco() * 5/100));
    }
    
    @Override
    public String toString() {
        return "---------- TÊNIS ----------" + "\n\n" +
               "MARCA:        " + getMarca() + "\n" +
               "NUMERAÇÃO:    " + getNumeracao() + "\n" +
               "COR:          " + getCor() + "\n" +
               "FABRICANTE:   " + getFabricante() + "\n" +          
               "TIPO          " + getTipo() + "\n" +
               "PREÇO:        R$ " + getPreco() + "\n" +
               "PROMOÇÃO:     R$ " + getDesconto() + "\n";
        
              
        
    }
    
    
}
