public class TesteExercicio4 {
    public static void main(String[] args) {
        
        Veiculo v1 = new Veiculo();
        
        v1.setProprietario("Arlindo Bella Vista");
        v1.setAno(2021);
        
        Empregado e1 = new Empregado();
        
        e1.setNome("Lunna Diná Mariana");
        e1.setMatricula("25887");
        e1.setIdade(24);
        e1.setSalario(2000);
        
        System.out.println("PROPRIÉTARIO: " + v1.getProprietario());
        System.out.println("ANO:          " + v1.getAno());
        System.out.println("--------------------------------");
        System.out.println("NOME:         " + e1.getNome()); 
        System.out.println("MATRÍCULA:    " + e1.getMatricula());
        System.out.println("IDADE:        " + e1.getIdade()); 
        System.out.println("SALÁRIO:      R$ " + e1.getSalario()); 
        System.out.println("--------------------------------");
    }
    
}
