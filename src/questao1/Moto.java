
package questao1;


public class Moto  extends Veiculo{
    
    private int cilindradas;

    public Moto(String modelo, String marca, int cilindradas) {
        super(modelo, marca);
        this.cilindradas = cilindradas;
    }

    @Override
    public String descrever() {
        return "Moto " + marca + " " + modelo + ", com " + cilindradas + " cilindradas.";
    }
    
}
