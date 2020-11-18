//Zulmy Rodriguez
public abstract class Deportista extends Persona {
    
   private String AreaDeDeporte;
   private int Edad;
   private double Peso;
   private double Altura;
   
   public Deportista(){
       
   }

    public String getAreaDeDeporte() {
        return AreaDeDeporte;
    }

    public void setAreaDeDeporte(String AreaDeDeporte) {
        this.AreaDeDeporte = AreaDeDeporte;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Deportista{" + "AreaDeDeporte=" + AreaDeDeporte + ", Edad=" + Edad + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }
    
    
    
    
    
}
