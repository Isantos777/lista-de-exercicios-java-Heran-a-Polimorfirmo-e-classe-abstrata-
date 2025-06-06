
package questao1;


public class Caminhao  extends Veiculo{
      private int cargaMaxima;

    public Caminhao(String modelo, String marca, int cargaMaxima) {
        super(modelo, marca);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String descrever() {
        return "Caminhão " + marca + " " + modelo + ", com capacidade de " + cargaMaxima + " kg.";
    }
}
