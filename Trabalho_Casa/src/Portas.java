
public class Portas {
   private float altura;
   private float largura;
   private String material;

   public Portas(float altura, float largura ,String material){
        setAltura(altura);
        setLargura(largura);
        setMaterial(material);
    }
   
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    

}
