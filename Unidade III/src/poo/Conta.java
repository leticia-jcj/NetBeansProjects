package poo;
public class Conta {

private int numeroConta;
private double saldo;
private double deposito;

    public int getJuros(){
   if (this.getDeposito() == 0) {
       return 0;
    }
   if (this.getDeposito() >= 0 && this.getDeposito() < 40){
       return 10;
   }
   if (this.getDeposito() >= 40 && this.getDeposito() < 80){
       return 20;
   }
   return 30;
 }    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
       return "  Conta:        " + "Numero Conta = " + getNumeroConta() + "\n" +
            "  Saldo      R$ " + getSaldo() + "\n" +
            "  Deposito   R$ " + getDeposito() + "\n" +
            "  Juros      = " + getJuros() + "%";
    }


    
}
