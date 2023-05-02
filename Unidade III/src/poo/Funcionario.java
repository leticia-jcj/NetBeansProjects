package poo;
public class Funcionario {
   
   private String nome;
   private String cargo;
   private double salario;
   
   public double getComissao(){
       return (getSalario()*10)/100;
   }
   
   public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
   public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    } 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario: " + getNome() + "\n"
              +"Cargo:       " + getCargo() + "\n"
              +"Salario   R$ " + getSalario() + "\n"
              +"Comissão  R$ " + getComissao();
    }
    
    
}
