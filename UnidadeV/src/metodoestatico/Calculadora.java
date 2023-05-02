package metodoestatico;

import javax.swing.JOptionPane;

public class Calculadora {
    
    static double n1;
    static double n2;
    static double n3;
    static double soma;
    
    static void insiraNumero(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo  número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
    }
    
    static void calcula(){
        soma = (n1+n2+n3);
    }
    
    static void exibirSoma(){
        JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + soma); 
}
    
}
