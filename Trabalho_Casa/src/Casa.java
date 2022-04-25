
import java.util.ArrayList;


public class Casa {

    private String cor;
    private String tamanho;

    public final ArrayList<Portas> arrayPortas = new ArrayList<>();
    public final ArrayList<Janelas> arrayJanelas = new ArrayList<>();
    public final ArrayList<Paredes> arrayParedes = new ArrayList<>();
 
    
    
    public static void main(String[] args) {
        Casa cs = new Casa();
        
        cs.setCor("Amarela");
        cs.setTamanho("80m²");
        
        cs.arrayPortas.add(new Portas(1.8f,0.6f,"Madeira"));
        cs.arrayPortas.add(new Portas(2.0f,0.6f,"Ferro"));
        
        cs.arrayJanelas.add(new Janelas("12x12","aluminio"));
        cs.arrayJanelas.add(new Janelas("24x24","Madeira"));
        cs.arrayJanelas.add(new Janelas("18x18","Ferro"));
        
        cs.arrayParedes.add(new Paredes("Parede Norte",2.0f));
        cs.arrayParedes.add(new Paredes("Parede Sul",2.0f));
        cs.arrayParedes.add(new Paredes("Parede Leste",2.0f));
        cs.arrayParedes.add(new Paredes("Parede Oeste",2.0f));
        
        System.out.println("Casa");
        System.out.println("Cor: "+cs.getCor());
        System.out.println("Tamanho: "+cs.getTamanho());
        
        
        System.out.println("\nJanelas");
        for(Janelas janela :cs.arrayJanelas){
            System.out.println("Dimensao: "+janela.getMaterial());
            System.out.println("Material: "+janela.getDimensao());
        }
        
        System.out.println("\nParedes");
        for(Paredes parede: cs.arrayParedes){
            System.out.println("Localizacao: "+parede.getLocalizacao());
            System.out.println("Altura: "+parede.getAltura());
        }
        
        System.out.println("\nPortas");
        for(Portas porta: cs.arrayPortas){
            System.out.println("Altura: "+porta.getAltura());
            System.out.println("Largura: "+porta.getLargura());
            System.out.println("Material: "+porta.getMaterial());
        }
    

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
