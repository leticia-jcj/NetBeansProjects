package heranca;
public class TesteAnimal {
    public static void main(String[] args) {
       
        Cachorro toto = new Cachorro();
        toto.comida = ("Ração Golden");
        toto.dormir();
        
        Galinha carijo = new Galinha();
        carijo.dormir();
    }
    
}
