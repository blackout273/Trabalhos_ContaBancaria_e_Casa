
public class Janelas {
    private String dimensao;
    private String material;
    
    public Janelas(String dimensao, String material){
        setMaterial(dimensao);
        setDimensao(material);
    }

    @Override
    public String toString() {
        return "Janelas{" + "dimensao=" + dimensao + ", material=" + material + '}';
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
    
 
}