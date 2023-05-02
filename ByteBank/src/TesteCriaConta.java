public class TesteCriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());
        
        primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
        System.out.println(primeiraConta.getSaldo());
        
        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        System.out.println("endereço de memeria "+primeiraConta);
    }
    
}
