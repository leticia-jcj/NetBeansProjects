package poo;

public class TesteCadastro {

    public static void main(String[] args) {
      
        Cadastro cad1 = new Cadastro("Flávio", ", SEXO: Masculino, ", 45); 
        Cadastro cad2 = new Cadastro("Luana", ", SEXO: Feminino ", 25);
        
        System.out.println("Dados: " + cad1.getNome() + cad1.getSexo() + cad1.getIdade());
        System.out.println("Dados: " + cad2.getNome() + cad2.getSexo() + cad2.getIdade());
    }
    
}
