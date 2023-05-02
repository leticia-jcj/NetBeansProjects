package poo;
public class Professor {
  
    String nome;
    double salario;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return getSalario()+1000;
    }
   
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}
