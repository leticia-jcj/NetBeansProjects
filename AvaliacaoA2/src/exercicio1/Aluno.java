package exercicio1;
public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1 ;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    public double calcularMedia() {
        return ((getNota1()*getNota2())/2);
    }
    
 
    //polimorfismo sobrecarga.
    public double calcularMedia(double nota1, double nota2) {
        this.setNota1(nota1);
        this.setNota2(nota2);
        return this.calcularMedia();   
    }

    @Override
    public String toString() {
        return "----- ALUNO -----" + "\n\n" +
               "NOME:    " + getNome() + "\n" + 
               "IDADE:   " + getIdade() + "\n" +
               "NOTA 1 = " + getNota1() + "\n" +
               "NOTA 2 = " + getNota2() + "\n" +
               "MÉDIA:   " + calcularMedia() + "\n" ;
         
    
    }
         
        
               
    }

 

