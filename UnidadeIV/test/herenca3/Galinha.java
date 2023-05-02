package herenca3;
public class Galinha extends Ave {
    
    private int qntOvos;
    
    public Galinha () {
        
        setVoar(false);
    }

    public int getQntOvos() {
        return qntOvos;
    }

    public void setQntOvos(int qntOvos) {
        this.qntOvos = qntOvos;
    }

    @Override
    public void setVoar(Boolean voar) { 
        if (voar){
            System.out.println("Galinha não voa!");
        }
        super.setVoar(false);
    }
    
    @Override
    public String toString() {
        return "---------- GALINHA ----------" + "\n\n" +
               "COMIDA:            " + getComida() + "\n" +
               "HABITAT:           " + getHabitat() + "\n" +
               "SEXO:              " + getSexo() + "\n" +
               "SOM EMITIDO:       " + getSomEmitido() + "\n" +
               "TEMPO GESTACIONAL: " + getTempoGestacao() + " dias" + "\n" +
               "QNT. OVOS:         " + getQntOvos() + "\n" +
               "VOA:               " + getTextoVoa() + "\n";
        
    }
    
    
}
