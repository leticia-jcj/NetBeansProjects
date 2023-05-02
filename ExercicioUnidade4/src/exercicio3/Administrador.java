package exercicio3;
public class Administrador extends Empregado {
    
    private double  ajudaDeCusto; // referente a viagens, estadias...

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "---------- ADMINISTRADOR ----------" + "\n\n" +
               "ENDEREÇO:           " + getEndereco() +"\n" + 
               "NOME:               " + getNome()+"\n" +
               "TELEFONE:           " + getTelefone() +"\n\n" +
               "CÓGIDO DO SETOR:    " + getCodigoSetor() +"\n" +
               "SALÁRIO BASE:       R$ " + getSalarioBase() +"\n" +
               "IMPOSTO:            " + getImposto() +"%" + "\n\n" +
               "SALÁRIO COM DESC.   R$ " + getcalcularSalario() + "\n" +
               "AJUDA DE CUSTO:     R$ " + getAjudaDeCusto() + "\n"+
               "SALÁRIO + AJUDA:    R$ " + (getcalcularSalario() + getAjudaDeCusto()) +"\n\n";
    }
    
    
}
