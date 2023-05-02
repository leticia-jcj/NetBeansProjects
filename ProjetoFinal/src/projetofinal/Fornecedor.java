package projetofinal;
public class Fornecedor extends Pessoa {
    
   private double valorCredito; //(correspondente ao crédito máximo atribuído ao fornecedor)
   private double valorDivida; //(montante da dívida para com o fornecedor)

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
   
    //método obterSaldo()devolve a diferença "-" entre os valores dos
    //atributos valorCredito e valorDivida
    
    public double getObterSaldo(){
        return (getValorCredito() - getValorDivida()); 
    }

    @Override
    public String toString() {
        return "---------- FORNECEDOR ----------" + "\n\n" +
               "ENDEREÇO:             " + getEndereco() + "\n" +
               "NOME:                 " + getNome() + "\n" +
               "TELEFONE:             " + getTelefone() + "\n\n" +
               "CRÉDITO TOTAL:        R$ " + getValorCredito() + "\n" +
               "VALOR DA DÍVIDA:      R$ " + getValorDivida() + "\n" +
               "DIFERENÇA DA DÍVIDA:  R$ " + getObterSaldo() + "\n\n";
    }
    
    
}