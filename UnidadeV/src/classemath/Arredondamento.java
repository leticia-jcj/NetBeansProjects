//Crie uma classe para fazer o arredondamento dos seguintes valores:
//5.2, 5.6 e -5.8 para o valor inteiro mais próximo.
package classemath;
public class Arredondamento {
    public static void main(String[] args) {
      
        System.out.println(Math.round(5.2)); //abaixo de 5.5 arredonda pra baixo
        System.out.println(Math.round(5.6)); //acima de 5.5 arredonda pra cima
        System.out.println(Math.round(-5.8));
        System.out.println("");
        System.out.println(Math.ceil(5.2)); //arredonda pra cima sempre
        System.out.println(Math.ceil(5.6)); //    "      "     "     "
        System.out.println(Math.ceil(-5.8));
        System.out.println("");
        System.out.println(Math.floor(5.2)); //arredonda pra baixo sempre
        System.out.println(Math.floor(5.6)); //    "      "     "     "
        System.out.println(Math.floor(-5.8));
        System.out.println("");
        
        System.out.println(" ^^ vale os testes pra treinar... rs");
    } 
    
}
