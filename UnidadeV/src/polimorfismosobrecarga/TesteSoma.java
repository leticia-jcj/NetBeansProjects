package polimorfismosobrecarga;
public class TesteSoma {
    public static void main(String[] args) {
       
    Soma soma = new Soma(); // cria instância da classe Soma
    
    // Declara várias variáveis
    byte b = 20;
    short s = 99;
    int i = 1000;
    long l = 1234L;
    float f = 3.1416f;
    double d = 2000;
    
    // Chama vários métodos da classe Soma
    System.out.print(soma.doisValores(b,s)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public int doisValores(int a,int b)\n");
    
    System.out.print(soma.doisValores(i,s)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public int doisValores(int a,int b)\n");
   
    System.out.print(soma.doisValores(i,i)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public int doisValores(int a,int b)\n");
    
    System.out.print(soma.doisValores(l,b)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,int b)\n");
    
    System.out.print(soma.doisValores(f,s)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,double b)\n");
    
    System.out.print(soma.doisValores(d,b)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,int b)\n");
    
    System.out.print(soma.doisValores(b,d)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,int b)\n");
    
    System.out.print(soma.doisValores(i,l)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,int b)\n");
    
    System.out.print(soma.doisValores(l,l)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,int b)\n");
    
    System.out.print(soma.doisValores(d,f)); //Escreva aqui qual método foi chamado
    System.out.println(" -> MÉTODO INVOCADO: public double doisValores(double a,double b)\n");
   }
    
}
