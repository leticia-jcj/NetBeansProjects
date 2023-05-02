package herenca3;
public class Ave extends Animal {
    private Boolean voar = true;

    public Boolean getVoar() {
        return voar;
    }

    public void setVoar(Boolean voar) {
        this.voar = voar;
    }
    public String getTextoVoa(){
     if (getVoar()){
         return "sim";
     } else {
         return "não";
     }
  }

   
    
}
