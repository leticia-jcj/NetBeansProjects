package poo;

public class Aluno {
    //camposou variáveis de objetos
    private String nome;
    private String curso;
    private int matricula;
    
    //método construtor oculto
    
    //métodos
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
