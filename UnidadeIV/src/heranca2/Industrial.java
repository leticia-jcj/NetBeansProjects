package heranca2;
public class Industrial extends Fogao {
    private double largura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "----- FOGÃO INDUSTRIAL -----" + "\n\n"+
                "MARCA:         " + getMarca() + "\n" +
                "PESO:          " + getPeso() + "kg" +"\n" +
                "QNT DE BOCAS:  " + getQntBocas() + "\n" +
                "LARGURA:       " + getLargura() + "cm"+ "\n";
    }
    
    
}
