package herenca3;
public class TesteAnimal {
 
    public static void main(String[] args) {
        TesteAnimal t = new TesteAnimal();
        
        Cao c = new Cao();
        c.setRaca("vira-lata");
        c.setHabitat("terrestre");
        c.setQntPatas(4);
        c.setSexo("macho");
        c.setComida("ração");
        c.setTempoGestacao(6);
        c.setSomEmitido("latido");
        
        System.out.println(c);
        
        Galinha g = new Galinha();
        g.setHabitat("terrestre");
        g.setSexo("femea");
        g.setComida("milho");
        g.setTempoGestacao(21);
        g.setSomEmitido("cacarejo");
        g.setQntOvos(10);
        
        System.out.println(g);
        
    }
    
}
