public class ContaCorrente {
    
    private int numero;
    private int tipo;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CONTA CORRENTE    " +  "\n" +
               "Número:           " + getNumero() + "\n" +
               "Tipo:             " + getTipo() + "\n" +
               "Saldo             R$ " + getSaldo() + "\n";
    }
    
    
}
