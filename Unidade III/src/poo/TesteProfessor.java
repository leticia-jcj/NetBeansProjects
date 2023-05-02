package poo;
public class TesteProfessor {
    public static void main(String[] args) {
       
        Professor pf1 = new Professor();
        
        pf1.setNome("Carlos");
        pf1.setSalario(500);
        
        System.out.println("Mostre o nome: " + pf1.getNome());
        System.out.println("Mostre o salário: " + pf1.getSalario());
    }
    
}
