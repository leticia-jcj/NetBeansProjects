package heranca2;
public class TesteEletrodomestico {
    public static void main(String[] args) {
   
        Domestico domestic = new Domestico();
        domestic.setMarca("BRASTEMP");
        domestic.setPeso(10);
        domestic.setQntBocas(5);
        domestic.setTipo("cooktop");
        System.out.println(domestic);
        
        Industrial industri = new Industrial();
        industri.setMarca("ESMALTEC");
        industri.setPeso(20);
        industri.setQntBocas(4);
        industri.setLargura(65.5);
        System.out.println(industri);
    }
    
}
