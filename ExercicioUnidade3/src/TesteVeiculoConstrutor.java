public class TesteVeiculoConstrutor {
    public static void main(String[] args) {
        
        VeiculoConstrutor v1 = new VeiculoConstrutor("Arlindo Bella Vista", 2021);
        
        System.out.println("DADOS DO VEÍCULO" + "\n" +
                           "PROPRIETÁRIO: " + v1.getProprietario() +"\n"+
                           "ANO:          " + v1.getAno());   
    }
    
}
