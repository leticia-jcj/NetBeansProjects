package herenca3;
public class Cao extends Mamifero {
    private String raca;
   
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "------------ CÃO ------------" + "\n\n" +
               "RAÇA:              " + getRaca() + "\n" +
               "COMIDA:            " + getComida() + "\n" +
               "HABITAT:           " + getHabitat() + "\n" +
               "SEXO:              " + getSexo() + "\n" +
               "QNT PATAS:         " + getQntPatas() + "\n" +
               "SOM EMITIDO:       " + getSomEmitido() + "\n" +
               "TEMPO GESTACIONAL: " + getTempoGestacao() + " meses" + "\n";
    }

    }
