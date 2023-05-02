//8 – time com 11 jogadores deseja saber características de sua equipe,
//calcule e mostre: FAZER DOIS PROGRAMAS (for e while)
//ENTRADA DADOS: peso - idade - altura de cada jogador

//SAIDA DADOS
//calcule e mostre: FAZER DOIS PROGRAMAS (for e while)
//A quantidade de jogadores com idade inferior a 20 anos;
//A média de idade do time;
//A média das alturas dos jogadores com menos de 20 anos;
//A porcentagem de jogadores com mais de 70kg
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
       
    double peso = 0;
    int idade = 0;
    double altura = 0;
    int contador = 1;
            
    Scanner teclado = new Scanner(System.in);
        
    while (contador <=3){
        System.out.print("INFORME A IDADE DO " + contador + "º JOGADOR: ");
        idade = teclado.nextInt();
        
        System.out.print("INFORME A ALTURA DO " + contador + "º JOGADOR: ");
        altura = teclado.nextDouble();
        
        System.out.print("INFORME O PESO DO " + contador + "º JOGADOR: ");
        peso = teclado.nextDouble();
        
        System.out.println("-------------------------------------");
        
        contador++;
    }
        if (idade <= 20){
        System.out.print("Jogadores com idade inferior a 20 anos: ");
        System.out.println(contador-idade);
        
       
        //System.out.println("A porcentagem de jogadores com mais de 70kg é: " + porcentagem); 
        
        double mediaIdade = (idade*contador)/3;
        System.out.println("A média de idade do time é: " + mediaIdade + "%");
        
        double mediaAltura = altura*(contador-idade)/contador;
        System.out.print("A média das alturas dos jogadores com menos de");  
        System.out.print(" 20 anos é: " + mediaAltura);
        System.out.println(" ");
        
         
        }
            
        }
 
    }  

